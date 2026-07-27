package day11;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String d="listen";
        String k="silent";

        int len=d.length();
        int len1=k.length();
        if(len!=len1){
            System.out.print("Not Anagram");
        }
        else{
            char[]arr=d.toCharArray();
            char[]arr1=k.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            if(Arrays.equals(arr,arr1)){
                System.out.print("Anagram");
            }
            else{
                System.out.print("Not anagram");
            }
        }
    }
}
