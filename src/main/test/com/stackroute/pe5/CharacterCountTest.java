package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static junit.framework.TestCase.assertEquals;

public class CharacterCountTest{
    CharacterCount charactercount;
    @Before
    public void setUp() throws Exception {
        charactercount = new CharacterCount();
    }
    @After
    public void tearDown() throws Exception {
        charactercount = null;
    }
    @Test
    public void givenInputAsArrayOfStringsReturnBooleanValueIfRepeatingMoreThanTwoTimes()
    {
        Map<String,Boolean> actualMap;
        actualMap = charactercount.countOfCharacters(new String[] {"a","b","c","d","a","c","c"});
        Map<String,Boolean> expectedMap = new TreeMap<>();
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        assertEquals(expectedMap,actualMap);
    }
    @Test
    public void givenInputAsArrayOfNonRepeatingStringsReturnBooleanValueIfRepeatingMoreThanTwoTimes()
    {
        Map<String,Boolean> actualMap;
        actualMap = charactercount.countOfCharacters(new String[] {"a","b","c","d"});
        Map<String,Boolean> expectedMap = new TreeMap<>();
        expectedMap.put("a",false);
        expectedMap.put("b",false);
        expectedMap.put("c",false);
        expectedMap.put("d",false);
        assertEquals(expectedMap,actualMap);
    }
    @Test
    public void givenInputAsNullReturnNull()
    {
        Map<String,Boolean> actualMap;
        actualMap =charactercount.countOfCharacters(new String[] {});
        Map<String,Boolean> expectedMap = new TreeMap<>();
        assertEquals(expectedMap,actualMap);
    }
}