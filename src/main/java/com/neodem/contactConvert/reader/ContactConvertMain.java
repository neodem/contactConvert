package com.neodem.contactConvert.reader;

import java.io.File;
import java.io.IOException;

import com.neodem.contactConvert.beans.VCardSet;
import com.neodem.contactConvert.file.DefaultVCardFileIO;
import com.neodem.contactConvert.file.VCardFileIO;

public class ContactConvertMain {

	private VCardSet set;
	private VCardFileIO io;
	
	public ContactConvertMain() {
		io = new DefaultVCardFileIO();
	}
	
	public void go(String filename) {
		// get file
		File file = getFile(filename);
		
		// get card set
		try {
			 set = io.getSetFromFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// display set
		displaySet(set);
	}

	private void displaySet(VCardSet set) {
		System.out.println(set.display());
	}

	/** assumes filename is on the source path
	 * 
	 * @param filename
	 * @return
	 */
	private File getFile(String filename) {
		File file = new File(filename);
		return file;
	}

}
