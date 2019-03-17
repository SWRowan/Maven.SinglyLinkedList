package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<V> {
    private Node headNode = null;
    private Integer size = 0;


    public Integer size() {
        return size;
    }

    public void add(V value) {
        if (headNode == null) {
            headNode = new Node(value);
        } else {
            Node newNode = headNode;
            while (newNode.nextNode != null) {
                newNode = newNode.nextNode;
            }
            newNode.nextNode = new Node(value);
        }
        size++;
    }

    public Integer find(V value) {
        Node node = headNode;
        for (int index = 0; index < size; index++) {

            if (node.getValue().equals(value)) {
                return index;
            }
            node = node.getNextNode();

        }
        return -1;
    }

    public V get(Integer index) throws Exception {

        if (index == -1) {
            throw new Exception("Value does not exist");
        }
        Node node = headNode;
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
        }
        return (V) node.getValue();
    }


    public Boolean contains(V value) {
        Node node = headNode;
        for (int i = 0; i < size; i++) {

            if (node.getValue().equals(value)) {
                return true;
            }
            node = node.getNextNode();

        }
        return false;
    }

    public void remove(int index) throws Exception {
        if(index == -1 || index >size){
            throw new IndexOutOfBoundsException();
        }else if(index == 0){
            headNode = headNode.nextNode;
            size--;
        }else{
            Node node = headNode;
            for (int i = 1; i < index ; i++) {
                node = node.nextNode;
            }
            node.setNextNode(node.nextNode.nextNode);
            size--;
        }
    }

    public SinglyLinkedList<V> copy(){
        SinglyLinkedList copiedList = new SinglyLinkedList();
        Node node = headNode;
        for(int i = 0; i < size; i++){
            copiedList.add(node.getValue());
            node = node.getNextNode();
        }
        return copiedList;
    }



    static class Node<V> {
        private V value;
        private Node nextNode;

        protected Node(V value) {
            this.value = value;
            this.nextNode = null;
        }

        protected V getValue() {
            return value;
        }

        protected Node getNextNode() {
            return nextNode;
        }

        protected void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

    }
}
