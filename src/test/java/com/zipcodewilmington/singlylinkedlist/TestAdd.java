package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestAdd {

    @Test
    public void testAdd(){
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList();
        String str = "One";
        Integer expected = 1;
        //When
        list.add(str);
        Integer actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd2(){
        //Given
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        String str1, str2, str3, str4;
        str1 = "one"; str2 = "two"; str3 = "three"; str4 = "four";
        Integer expected = 4;
        //When
        list.add(str1); list.add(str2); list.add(str3); list.add(str4);
        Integer actual = list.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd3(){
        //Given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        Integer expected = 10;
        //When
        for (int i = 0; i < expected; i++) {
            list.add(i);
        }
        Integer actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
