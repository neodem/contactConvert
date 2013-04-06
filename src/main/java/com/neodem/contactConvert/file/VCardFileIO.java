package com.neodem.contactConvert.file;

import java.io.File;
import java.io.IOException;

import com.neodem.contactConvert.beans.VCardSet;

public interface VCardFileIO {
	
	/** Will read a file and parse the file into a set of VCard objects
	 * 
	 * @param file
	 * @return
	 * @throws IOException 
	 */
	public VCardSet getSetFromFile(File file) throws IOException;
}
