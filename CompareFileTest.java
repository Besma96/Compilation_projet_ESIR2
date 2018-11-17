package org.xtext.example.mydsl.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompareFileTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

// Methode permettant de tester notre foction de comparaison 
	@Test
	public void test() throws Exception {
		
		assertTrue(CompareFile.compare("Input.wh","Output.wh"));
		
	}

}