package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayElementsTest {

  UpdateArrayElements updateArrayElements;

  @Before
  public void setUp() {
    updateArrayElements = new UpdateArrayElements();
  }

  @After
  public void tearDown() {
    updateArrayElements = null;
  }

  @Test
  public void givenListContainsArrayShouldReturnUpdated(){
    ArrayList<String> actual = new ArrayList();
    actual.add("Apple");
    actual.add("Grape");
    actual.add("Melon");
    actual.add("Berry");

    ArrayList<String> expected = new ArrayList();
    expected.add("Kiwi");
    expected.add("Grape");
    expected.add("Melon");
    expected.add("Berry");

    ArrayList result = updateArrayElements.updateElements(0, "Kiwi", actual);
    assertEquals(expected,result);

  }
  @Test
  public void givenStringContainsEmptyShouldReturnErrorMessage(){
    ArrayList<String> actual1 = new ArrayList();


    ArrayList result = updateArrayElements.updateElements(0, " ", actual1);
    assertEquals(null,result);

  }
  @Test
  public void givenStringContainsIntegersShouldReturnErrorMessage(){
    ArrayList<String> actual1 = new ArrayList();


    ArrayList result = updateArrayElements.updateElements(0, "123", actual1);

  assertNotEquals(" ",result);
  }
  @Test
  public void givenStringContainsSpecialCharacterShouldReturnErrorMessage(){
    ArrayList<String> actual1 = new ArrayList();


    ArrayList result = updateArrayElements.updateElements(0, "@#$", actual1);

    assertNotEquals(" ",result);
  }
  @Test
  public void givenStringContainsNullShouldReturnErrorMessage(){
    ArrayList<String> actual1 = new ArrayList();


    ArrayList result = updateArrayElements.updateElements(0, null, actual1);

    assertNotEquals(" ",result);
  }
}
