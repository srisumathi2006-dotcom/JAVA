package day11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_word_in_String {
    public static void main(String[]args){
        String j="The world of full people";
        String [] h=j.split(" ");
        String max= h[0];
        for(String l:h){
            if(l.length()>max.length()){
                max=l;
            }
        }
        System.out.println(max);
    }
}
