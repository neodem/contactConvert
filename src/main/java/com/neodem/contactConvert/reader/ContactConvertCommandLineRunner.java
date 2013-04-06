package com.neodem.contactConvert.reader;

public class ContactConvertCommandLineRunner {
	
//	private final static String FILENAME = "conf/vcsmall.vcf";
//	private final static String FILENAME = "conf/vCards.vcf";
	private final static String FILENAME = "conf/vc.vcf";
	private static ContactConvertMain app;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		app = new ContactConvertMain();
		app.go(FILENAME);
	}

}
