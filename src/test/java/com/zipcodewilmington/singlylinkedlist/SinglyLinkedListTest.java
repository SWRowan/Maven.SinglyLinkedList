package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testNodeConstructor(){
        //Given

        Integer expected = 5;
        SinglyLinkedList.Node node = new SinglyLinkedList.Node(expected);
        //When
        Object actual = node.getValue();
        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertNull(node.getNextNode());

    }









}
