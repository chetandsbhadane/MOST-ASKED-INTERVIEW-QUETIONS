/*
    Author - Chetan Bhadane
    Designation - Test Engineer/SDET
*/
/*
    1. Find duplicate char from string. Write a program to find duplicate characters in a given String.
    Input: hackerearth
    Output: h a e r
*/
import java.util.Arrays;
class que_001{
    public static void main(String[] args){
        String str = "hackerearth";
        char[] repeated = str.toCharArray();

        for(int i=0;i<str.length();i++){
            boolean isDuplicate = false;
            for(int j=i+1;j<str.length();j++){
                if(repeated[i] == repeated[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                System.out.println(repeated[i]);
            }
        }
    }
}