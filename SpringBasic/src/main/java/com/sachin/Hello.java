package com.sachin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	@Autowired
	Bello bello;
	public void sayHello()
	{
		bello.sayBello();
	}

}
