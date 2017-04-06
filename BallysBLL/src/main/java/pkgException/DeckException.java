package pkgException;

import java.util.ArrayList;

import pkgPokerBLL.Deck;

public class DeckException extends Exception{
	private Deck d;

	public DeckException(Deck d) {
		super();
		this.d = d;
	}

	public Deck getD() {
		return d;
	}
	
	
	
}
