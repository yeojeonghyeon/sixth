package com.scci.edu.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Television {
	@Autowired
	@Qualifier("ssSpeaker")
	private Speaker speaker;
	
	public void turnOn() {
		speaker.turnOn();
	}
}
