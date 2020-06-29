package com.first.modifier.a;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsePackagePrivate upp = new UsePackagePrivate(new PackagePrivate());
		upp.pp.member = 1;
	}
}
