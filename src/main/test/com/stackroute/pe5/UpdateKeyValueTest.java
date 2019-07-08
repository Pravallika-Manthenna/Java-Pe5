package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UpdateKeyValueTest {


        UpdateKeyValue value;

        @Before
        public void setUp() {
            value = new UpdateKeyValue();
        }

        @After
        public void tearDown() {
            value = null;
        }
        @Test
        public void givenMapContainsValuesPairShouldReturnReplacedValuesPair() {

            Map<String,String> expected = new HashMap<>();
            expected.put("val1"," ");
            expected.put("val2","java");

            Map<String, String> map=new HashMap<>();
            map.put("val1","java");
            map.put("val2","c++");

            Map result = value.updateValues(map);

            assertEquals(expected,result);

        }
    @Test
    public void givenMapContainsAnotherValuesPairShouldReturnReplacedValuesPair() {

        Map<String,String> expected = new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","java");

        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map result = value.updateValues(map);

        assertEquals(expected,result);

    }

    }

