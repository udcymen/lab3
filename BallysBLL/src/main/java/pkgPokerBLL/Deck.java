package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgException.DeckException;
import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	public Deck() {

		super();
		
		int iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)) {
					DeckCards.add(new Card(rank, suit, ++iCardNbr));
				}
			}
		}
		Collections.shuffle(DeckCards);
	}
	
	public Deck(int NbrOfJokers){
		this();
		int iCardNbr = 52;
		for (int i = 0; i < NbrOfJokers; i++){
			DeckCards.add(new Card(eRank.JOKER, eSuit.JOKER, ++iCardNbr));
		}
		
		Collections.shuffle(DeckCards);
	}

	public Card DrawCard() throws DeckException {
		if (DeckCards.size() == 0){
			throw new DeckException(this);
		}
		return DeckCards.remove(0);
	}
}
