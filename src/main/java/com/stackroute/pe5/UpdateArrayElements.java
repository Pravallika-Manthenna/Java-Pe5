package com.stackroute.pe5;
// program to update the existing array list elements by the given elements

import java.util.ArrayList;

public class UpdateArrayElements
{
  ArrayList<String> result = new ArrayList();
  public ArrayList updateElements (int index, String update, ArrayList list1) {
    if (list1.isEmpty()) // if list is empty
    {
      result = null;
    }
    else
    {
      list1.set(index, update);

      result = list1;
    }
    return result;

  }
}
