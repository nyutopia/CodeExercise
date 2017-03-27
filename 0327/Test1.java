/*
找到最多有多少个点在一条直线上
Given n points on a 2D plane, 
find the maximum number of points that lie on the same straight line.
*/

/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Test1{
    public int maxPoints(Point[] points) {
        int n = points.length;
        if(n<2) return n;
        int max = 1;
        for(int i = 0;i < n;i++){
            int num = 1;
            int tmp = 0;
            for(int j = i+1;j<n;j++){
                int delta1=points[i].x-points[j].x;
                int delta2=points[i].y-points[j].y;
                
                if(delta1==0&&delta2==0){
                    tmp++;
                }else{
                    num++;
                    for(int k = j+1;k<points.length;k++){
                        int deltax=points[j].x-points[k].x;
                        int deltay=points[j].y-points[k].y;
                        if(deltax*delta2==deltay*delta1){
                            num++;
                        }
                    }
                    if(max<num+tmp)
                        max=num+tmp;
                }
                num =1;
            }
            if(max<num+tmp)
                max=num+tmp;
           
        }
        return max;
    }
}