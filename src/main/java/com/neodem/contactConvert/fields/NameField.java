package com.neodem.contactConvert.fields;

import com.neodem.common.beans.Name;

/**This is a name field.. has the following format:
 * 
 * Name
This property specifies a structured representation of the name of the person, 
place or thing associated with the vCard object.

This property is identified by the property name N. This property is defined to 
encapsulate the individual components of an object's name. The property value 
consists of the components of the name specified as positional fields separated 
by the Field Delimiter character (ASCII decimal 59). The property value is a 
concatenation of the Family Name (first field), Given Name (second field), 
Additional Names (third field), Name Prefix (fourth field), and Name Suffix 
(fifth field) strings. The following is an example of the Name property for a 
person:
N:Public;John;Quinlan;Mr.;Esq.
The following is an example of the Name property for a resource or place:
N:Veni, Vidi, Vici;The Restaurant.
Support for this property is mandatory for vCard Writers conforming to this 
specification. All vCard data streams should include this property to facilitate 
a common property for collating and sorting of vCard objects.
 * 
 * @author Vince
 *
 */
public class NameField extends SemiColonParseableVCardField {
	private static final String FIELDNAME = "N";
	
	public NameField() {
		super(FIELDNAME);
	}
	
	public Name getName() {
		Name name = new Name();
		reset();
		
		name.setLastName(getNextToken());
		name.setFirstName(getNextToken());
		name.setMiddleName(getNextToken());
		name.setPrefix(getNextToken());
		name.setSuffix(getNextToken());
		
		return name;
	}
}
