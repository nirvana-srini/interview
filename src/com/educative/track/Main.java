package com.educative.track;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        String[] str1List = {"listen", "race", "elbow", "caqt", "inch", "anagram"};
        String[] str2List = {"silent", "cares", "below", "acrt", "chin" , "nagaram"};

        for (int i = 0; i < str2List.length; i++) {
            System.out.print((i + 1) + ".");
            System.out.println("\tstr1: \"" + str1List[i] + "\"");
            System.out.println("\tstr2: \"" + str2List[i] + "\"");
            System.out.println("\t\"" + str2List[i] + "\" is an anagram of \"" + str1List[i] + "\": "
                    + isAnagram(str1List[i], str2List[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
     public static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap();
        if(str1.length() != str2.length()) {
            return false;
        }
         for (int i = 0; i < str1.length(); i++) {
//             Integer a = map.get(str1.charAt(i));
//             if(a == null) {
//                 a = 0;
//             }
//             map.put(str1.charAt(i), a + 1);
             map.compute(str1.charAt(i), (k,v) -> v == null ? 0 : v + 1);
         }
         for (int i = 0; i < str2.length(); i++) {
             if(map.containsKey(str2.charAt(i))){
                 map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
             } else {
                 return false;
             }
         }
        for(Integer a : map.values()){
            if(a > 0) {
                return false;
            }
        }
        // Replace this placeholder return statement with your code
       return true;
    }
}