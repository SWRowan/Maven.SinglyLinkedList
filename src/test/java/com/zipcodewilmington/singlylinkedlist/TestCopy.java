package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestCopy {

    @Test
    public void testCopy1() throws Exception{
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        int expectedSize = list.size();
        //When
        SinglyLinkedList newList = list.copy();
        int actualSize = newList.size();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
        System.out.println(list.get(1));
        System.out.println(newList.get(1));

    }
}
