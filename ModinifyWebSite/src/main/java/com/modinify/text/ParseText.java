package com.modinify.text;

public class ParseText {

	public static String[] parseTextToArray(String value){
		String language = null;
		String strCountry = null;
		
		try{
			String strLocale = value;
			String val[] = strLocale.split("_");
			language = val[0];
			strCountry = val[1];
		}catch(Throwable th){
			return null;
		}
		
		return new String[] { language, strCountry };
	}

}
