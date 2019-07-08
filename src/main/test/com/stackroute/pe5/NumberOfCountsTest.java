package com.stackroute.pe5;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import java.util.HashMap;
        import java.util.Map;

        import static org.junit.Assert.*;

public class NumberOfCountsTest {

    NumberOfCounts numberOfCounts;

    @Before
    public void setUp() {
        numberOfCounts = new NumberOfCounts();
    }

    @After
    public void tearDown() {
        numberOfCounts = null;
    }

    @Test
    public void givenStringContainsStringShouldReturnCount()
    {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("one",5);
        maps.put("two",2);
        maps.put("three",2);

        Map<String,Integer> result = numberOfCounts.counts("one one -one___two,,three,one @three*one?two","one","two", "three");
        assertEquals(maps,result);
    }
    @Test
    public void givenStringContainsNullShouldReturnNull()
    {
        Map<String,Integer> result = numberOfCounts.counts(null, "one","two", "three");
        assertEquals(null, result);
    }
    @Test
    public void givenStringContainsEmptyStringShouldReturnNull()
    {
        Map<String,Integer> result = numberOfCounts.counts(" ", "one","two", "three");
        assertEquals(null, result);
    }
}