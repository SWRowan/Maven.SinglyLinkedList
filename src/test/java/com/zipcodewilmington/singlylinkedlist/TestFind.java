package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestFind {

    @Test
    public void testIndex(){
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, str3, str4;
        str1 = "one"; str2 = "two"; str3 = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(str3); list.add(str4);
        Integer expected = 1;
        //When
        Integer actual = list.find("two");
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFind(){
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, str3, str4;
        str1 = "one"; str2 = "two"; str3 = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(str3); list.add(str4);
        Integer expected = -1;
        //When
        Integer actual = list.find("seven");
        //Then
        Assert.assertEquals(expected, actual);
    }
}
