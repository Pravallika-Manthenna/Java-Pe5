package com.stackroute.pe5;

import java.util.Map;

public class UpdateKeyValue {

        public Map<String,String> updateValues(Map<String,String> map) {
            String temp;
            if (map == null) {
                return null;
            }

//Swap the values for key1 and key2 and make key1 value as " "

            temp = map.get("val1");

            map.put("val1"," ");
            map.put("val2",temp);

            return map;
        }
}
