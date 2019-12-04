package com.blbz.designpattern.service;

import com.blbz.designpattern.model.Volt;

public interface SocketAdapter {

	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();
}

