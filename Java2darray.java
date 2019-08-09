import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] numberArray = new String[6][];
        int largSum = 0;
        for(int i=0; i<6; i++){
            numberArray[i]=s.nextLine().split(" ");
        }
        
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                int sum = Integer.parseInt(numberArray[i][j])+Integer.parseInt(numberArray[i][j+1])+Integer.parseInt(numberArray[i][j+2])+Integer.parseInt(numberArray[i+1][j+1])+Integer.parseInt(numberArray[i+2][j])+Integer.parseInt(numberArray[i+2][j+1])+Integer.parseInt(numberArray[i+2][j+2]);
                if(i==0 && j==0){
                    largSum=sum;
                }else{
                    if(sum>largSum){
                        largSum=sum;
                    }
                }
            }
        }
        System.out.println(largSum);
    }
}
