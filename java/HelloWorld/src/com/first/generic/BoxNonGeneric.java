package com.first.generic;

import com.first.inheritance.Child;
import com.first.inheritance.Parent;

public class BoxNonGeneric {
	Object obj;
	void setObj(Object obj) {
		this.obj = obj;
	}
	Object getObj() {
		return obj;
	}
}

class ClientForNonGenericBox{
	public static void main(String[] args) {
		BoxNonGeneric box = new BoxNonGeneric();
		box.setObj(new Parent());
		
		Child obj = (Child)box.getObj();
	}
}
