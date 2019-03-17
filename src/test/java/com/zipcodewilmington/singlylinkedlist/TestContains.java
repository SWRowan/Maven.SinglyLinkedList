package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestContains {

    @Test
    public void testContainsTrue(){
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        //then
        Assert.assertTrue(list.contains("four"));
    }

    @Test
    public void testContainsFalse(){
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        //Then
        Assert.assertFalse(list.contains("five"));
    }
}
