/*
ÆË¿ËÅÆË³×Ó
*/

import java.util.Arrays;
public class Test1{
    public boolean isContinuous(int [] numbers) {
        if(numbers == null||numbers.length == 0) return false;
        Arrays.sort(numbers);
        int numberOfZero = 0;
        int numberOfGap = 0;
        for(int i = 0;i<numbers.length-1;i++){
            if(numbers[i] == 0){
                numberOfZero++;
                continue;
            }
            if(numbers[i+1]==numbers[i])
                return false;
            if(numbers[i+1]-numbers[i]>1){
                numberOfGap +=numbers[i+1]-numbers[i]-1;
            }
        }
        
        if(numberOfZero>=numberOfGap) return true;
        else return false;

    }
}