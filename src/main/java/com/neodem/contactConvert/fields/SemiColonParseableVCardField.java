package com.neodem.contactConvert.fields;

public class SemiColonParseableVCardField extends VCardField {

	private final static String DELIMITER = ";";

	private String[] tokens;
	private int index;


	public SemiColonParseableVCardField(String name) {
		super(name);
	}

	/**
	 * reset the token feeder
	 * 
	 * 
	 */
	public void reset() {
		index = -1;

		if (value == null) {
			tokens = null;
			return;
		}

		tokens = getValue().split(DELIMITER);

	}

	/**
	 * get the next token, if it exists, else return nothing
	 * 
	 * @return
	 */
	public String getNextToken() {
		if(tokens == null) return "";
		index++;
		if(index >= tokens.length) return "";
		return tokens[index];
	}

}
