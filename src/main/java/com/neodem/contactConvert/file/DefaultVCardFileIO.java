/**
 * 
 */
package com.neodem.contactConvert.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.neodem.contactConvert.beans.VCard;
import com.neodem.contactConvert.beans.VCardSet;

/**
 * @author Vince
 * 
 */
public class DefaultVCardFileIO implements VCardFileIO {

	private final static String BEGIN_TOKEN = "BEGIN:VCARD";

	private final static String END_TOKEN = "END:VCARD";

	private final static String LINE_SEP = System.getProperty("line.separator");

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.neodem.contactConvert.file.VCardFileIO#getSetFromFile(java.io.File)
	 */
	public VCardSet getSetFromFile(File file) throws IOException {
		if (file == null) {
			throw new IllegalArgumentException("File should not be null.");
		}
		if (!file.exists()) {
			throw new FileNotFoundException("File does not exist: " + file);
		}
		if (!file.isFile()) {
			throw new IllegalArgumentException("Should not be a directory: "
					+ file);
		}

		VCardSet set = new VCardSet();

		// declared here only to make visible to finally clause
		BufferedReader input = null;
		try {

			input = new BufferedReader(new FileReader(file));
			String line = null; // not declared within while loop
			while ((line = input.readLine()) != null) {
				if (line.equals(BEGIN_TOKEN)) {
					VCard card = readCard(input);
					set.addCard(card);
				}
			}
		} finally {
			if (input != null) {
				// flush and close both "input" and its underlying FileReader
				input.close();
			}
		}

		return set;

	}
	

	/**
	 * read the file into the raw field of the card up to and including the end
	 * token
	 * 
	 * @param input
	 * @return
	 * @throws IOException
	 */
	private VCard readCard(BufferedReader input) throws IOException {
		VCard card = new VCard();

		StringBuffer contents = new StringBuffer(BEGIN_TOKEN);
		contents.append(LINE_SEP);

		String line = null; // not declared within while loop
		line = input.readLine();
		while (!line.equals(END_TOKEN)) {
			contents.append(line);
			contents.append(System.getProperty("line.separator"));
			line = input.readLine();
		}

		contents.append(END_TOKEN);
		card.setRawCard(contents.toString());

		return card;
	}

}
