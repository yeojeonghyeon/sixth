package com.first.covariant;
public class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class Client{
	public static void main(String[] args) {
		MyNode mn = new MyNode(5);
		Node n = (MyNode)mn;         // A raw type - compiler throws an unchecked warning
		n.setData("Hello");
		Integer x = (String)mn.data;
	}
}