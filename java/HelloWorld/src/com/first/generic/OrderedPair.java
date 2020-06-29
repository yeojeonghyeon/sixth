package com.first.generic;

import com.first.inheritance.Parent;

public class OrderedPair<K,V> implements Pair<K,V> {
	private K key;
	private V value;
	OrderedPair(K key, V value){
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public V getValue() {
		return value;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	@Override
	public void setValue(V value) {
		this.value = value;
	}
}

class UnorderedPair implements Pair<String,Integer>{
	@Override
	public String getKey() {
		return null;
	}
	@Override
	public Integer getValue() {
		return null;
	}
	@Override
	public void setKey(String key) {
	}

	@Override
	public void setValue(Integer value) {
	}
}

class Client{
	public static void main(String[] args) {
		Pair<String, Parent> op = new OrderedPair<>("k1", new Parent());
		Pair<String, Parent> op1 = new OrderedPair<>("k2", new Parent());
		Pair<String, String> op2 = new OrderedPair<>("k3", "k3");		
		System.out.println(Client.<String, Parent>compare(op, op1));
		System.out.println(Client.<String, Parent>compare(op, op2));
		Pair<String,Integer> p = new UnorderedPair();
		UnorderedPair up = new UnorderedPair();
	}
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}
