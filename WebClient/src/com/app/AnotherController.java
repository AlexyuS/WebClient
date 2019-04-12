package com.app;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

import com.src.CustomController;
import com.src.CustomGET;

@CustomController(basePath="secondPage")
public class AnotherController {
	
	@CustomGET(endpoint="doSomething")
	public String doSomething1() {
			return "Resources/test.html";	
	}
	
	@CustomGET(endpoint="doSomething2")
	public String doSomething2() {
			return "Resources/test.html";	
	}
	@CustomGET(endpoint="doSomething3")
	public String doSomething3() {
		return "Resources/test.html";	
	}
	@CustomGET(endpoint="doSomething4")
	public String doSomething4() {
		return "Resources/test.html";	
	}
	
	public PrintWriter doSomething2(InputStream stream) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new String("DoSomething2"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return writer;
	}
	
	
}
