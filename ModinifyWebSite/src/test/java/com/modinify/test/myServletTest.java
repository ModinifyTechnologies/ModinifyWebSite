package com.modinify.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.modinify.text.ParseText;

public class myServletTest {

	@Test
	public void testSetLanguage(){
		String language = "pt_BR";
		String lanResult[] = ParseText.parseTextToArray(language);
		
		// first tests....
		assertTrue(("pt".equals(lanResult[0])));
		assertTrue(("BR".equals(lanResult[1])));
		
		// testing null
		lanResult = ParseText.parseTextToArray(null);
		assertTrue(lanResult == null);
		
	}

}
