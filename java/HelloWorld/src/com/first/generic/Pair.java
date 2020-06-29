package com.first.generic;

public interface Pair<K,V> {
	K getKey();
	V getValue();
	void setKey(K key);
	void setValue(V value);
}
