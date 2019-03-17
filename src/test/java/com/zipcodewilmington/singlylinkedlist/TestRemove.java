package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestRemove {

    @Test
    public void testRemove1() throws Exception{
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        Integer expectedSize = 3;
        //When
        list.remove(0);
        Integer actual = list.size();
        //Then
        Assert.assertEquals(expectedSize, actual);
    }

    @Test
    public void testRemove2() throws Exception{
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        Integer expectedSize = 3;
        //When
        list.remove(2);
        Integer actual = list.size();
        //Then
        Assert.assertEquals(expectedSize, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove3() throws Exception{
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, expected, str4;
        str1 = "one"; str2 = "two"; expected = "three"; str4 = "four";
        list.add(str1); list.add(str2); list.add(expected); list.add(str4);
        Integer expectedSize = 3;
        //When
        list.remove(6);

    }
}
