
package com.stackroute.pe5;
//program to count number of counts in the given string
        import java.util.HashMap;
        import java.util.Map;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class NumberOfCounts {


    public Map<String,Integer> counts(String input , String str1, String str2, String str3){

        if(input == null || input == " " ){
            return null;
        }

        int num1=0, num2=0, num3=0;

// Create a pattern to be searched
        Pattern pattern1 = Pattern.compile(str1);

//Search for the given sequence in the given pattern
        Matcher m1 = pattern1.matcher(input);

        while(m1.find()){
            num1++;
        }

// Create a pattern to be searched
        Pattern pattern2 = Pattern.compile(str2);

//Search for the given sequence in the given pattern
        Matcher m2 = pattern2.matcher(input);

        while(m2.find()){
            num2++;
        }

// Create a pattern to be searched
        Pattern pattern3 = Pattern.compile(str3);

//Search for the given sequence in the given pattern
        Matcher m3 = pattern3.matcher(input);

        while(m3.find()){
            num3++;
        }

        Map<String,Integer> map = new HashMap<>();
        map.put(str1,num1);
        map.put(str2,num2);
        map.put(str3,num3);

        return map;
    }
}