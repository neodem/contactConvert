package com.neodem.contactConvert.fields;

import com.neodem.common.beans.Name;

import junit.framework.TestCase;

public class NameFieldTest extends TestCase {
	private static final String FIRSTNAME = "Joe";
	private static final String LASTNAME = "Smith";
	private static final String MIDDLENAME = "Bago";
	private static final String PREFIX = "Mr.";
	private static final String SUFFIX = "Jr.";
	private static final String DELIMITER = ";";
	private static final String EMPTY = "";
	
	public void testSimpleRead() {
		
		String value = LASTNAME + DELIMITER + FIRSTNAME + DELIMITER + MIDDLENAME + DELIMITER + PREFIX + DELIMITER + SUFFIX;
		
		NameField nf = new NameField();
		nf.setValue(value);
		
		Name result = nf.getName();
		assertNotNull(result);
		
		assertEquals(FIRSTNAME, result.getFirstName());
		assertEquals(LASTNAME, result.getLastName());
		assertEquals(MIDDLENAME, result.getMiddleName());
		assertEquals(PREFIX, result.getPrefix());
		assertEquals(SUFFIX, result.getSuffix());
	}
	
	public void testMissingLastName() {
		
		String value = DELIMITER + FIRSTNAME + DELIMITER + MIDDLENAME + DELIMITER + PREFIX + DELIMITER + SUFFIX;
		
		NameField nf = new NameField();
		nf.setValue(value);
		
		Name result = nf.getName();
		assertNotNull(result);
		
		assertEquals(FIRSTNAME, result.getFirstName());
		assertEquals(EMPTY, result.getLastName());
		assertEquals(MIDDLENAME, result.getMiddleName());
		assertEquals(PREFIX, result.getPrefix());
		assertEquals(SUFFIX, result.getSuffix());
	}
	
	public void testOnlyMiddleName() {
		String value = DELIMITER + DELIMITER + MIDDLENAME + DELIMITER + DELIMITER ;
		
		NameField nf = new NameField();
		nf.setValue(value);
		
		Name result = nf.getName();
		assertNotNull(result);
		
		assertEquals(EMPTY, result.getFirstName());
		assertEquals(EMPTY, result.getLastName());
		assertEquals(MIDDLENAME, result.getMiddleName());
		assertEquals(EMPTY, result.getPrefix());
		assertEquals(EMPTY, result.getSuffix());
	}
	
	public void testOnlyMiddleNameAndSuffix() {
		String value = DELIMITER + DELIMITER + MIDDLENAME + DELIMITER + DELIMITER + SUFFIX;
		
		NameField nf = new NameField();
		nf.setValue(value);
		
		Name result = nf.getName();
		assertNotNull(result);
		
		assertEquals(EMPTY, result.getFirstName());
		assertEquals(EMPTY, result.getLastName());
		assertEquals(MIDDLENAME, result.getMiddleName());
		assertEquals(EMPTY, result.getPrefix());
		assertEquals(SUFFIX, result.getSuffix());
	}
	
	public void testNull() {
		String value = null;
		
		NameField nf = new NameField();
		nf.setValue(value);
		
		Name result = nf.getName();
		assertNotNull(result);
		
		assertEquals(EMPTY, result.getFirstName());
		assertEquals(EMPTY, result.getLastName());
		assertEquals(EMPTY, result.getMiddleName());
		assertEquals(EMPTY, result.getPrefix());
		assertEquals(EMPTY, result.getSuffix());
	}
	
	public void testBlank() {
		String value = "";
		
		NameField nf = new NameField();
		nf.setValue(value);
		
		Name result = nf.getName();
		assertNotNull(result);
		
		assertEquals(EMPTY, result.getFirstName());
		assertEquals(EMPTY, result.getLastName());
		assertEquals(EMPTY, result.getMiddleName());
		assertEquals(EMPTY, result.getPrefix());
		assertEquals(EMPTY, result.getSuffix());
	}
	
	
}
