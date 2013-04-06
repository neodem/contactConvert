package com.neodem.contactConvert.beans;

import java.util.HashSet;
import java.util.Set;

public class VCardSet {
	private Set cards;
	
	public VCardSet() {
		cards = new HashSet();
	}

	public Set getCards() {
		return cards;
	}

	public void addCard(VCard card) {
		if(card == null) return;
		cards.add(card);
	}

	public String display() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("VCard Set contains ");
		buffer.append(cards.size());
		buffer.append(" cards.");
		
		return buffer.toString();
	}
	
}		
