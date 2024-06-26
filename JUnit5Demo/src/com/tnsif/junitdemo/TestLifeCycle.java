//to demonstrate Testing life cycle

package com.tnsif.junitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {
	
	
	@BeforeEach
	public void openCalc()
	{
		System.out.println("Calc is opening");
	}
	
	@AfterEach
	public void closeCalc()
	{
		System.out.println("Calc is closing");
	}
	
	@BeforeAll
	public void openBrowser()
	{
		System.out.println("Browser is opening");
	}
	
	
	@AfterAll
	public void closeBrowser()
	{
		System.out.println("Browser is closing");
	}

}
