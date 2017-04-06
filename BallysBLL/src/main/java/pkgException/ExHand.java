package pkgException;

import pkgPokerBLL.Hand;

public class ExHand extends Exception{
	private Hand h;

	public ExHand(Hand h) {
		super();
		this.h = h;
	}

	public Hand getH() {
		return h;
	}

}
