package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
//Program to find whether the strings are repeating for more than two times

public class CharacterCount {

        public Map<String,Boolean> countOfCharacters(String[] input)
        {
            Map<String,Boolean> resultMap = new HashMap<>();
            for(int i=0;i<input.length;i++)
            {
                String word = input[i];
                if(resultMap.containsKey(word))
                    resultMap.put(word,true);
                else
                    resultMap.put(word,false);
            }
            return resultMap;
        }
    }


