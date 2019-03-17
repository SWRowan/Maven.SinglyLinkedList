package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestGet {
    @Test
    public void testGet() throws Exception{
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        //when
        Integer index = list.find("three");
        Object actual = list.get(index);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test(expected = Exception.class)
    public void testGetException()throws Exception{
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        //when
        Integer index = list.find("five");
        Object actual = list.get(index);

    }

}
