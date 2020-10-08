package com.briscola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck implements Iterator{
    private ArrayList<ICard> myCardList;
    private int myIndex;

    public Deck() {
        myCardList = new ArrayList<ICard>();
        for(int suit = ICard.SPADES; suit <= ICard.CLUBS; suit++){
            for (int rank = 1; rank <= 13; rank++){
                myCardList.add(new Card(suit,rank));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(myCardList);
        myIndex = 0;
    }

    public boolean hasNext() {
        return myIndex < myCardList.size();
    }

    public Object next() {
        ICard card = (ICard) myCardList.get(myIndex);
        myIndex++;
        return card;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public int returnOne() {
        return 1;
    }
}

class Card implements ICard{
	private final int mySuit;     // ensure immutable, make final
	private final int myRank;
	private static final String[] suitStrings = {
		"spades", "hearts", "diamonds", "clubs"	
	};
	
	private String myName;
	
	private static final String[] rankStrings = {
		"dummy","ace","two","three","four","five",
		"six","seven","eight","nine","ten",
		"jack","queen","king"	
	};
	public Card(int suit, int rank){
		mySuit = suit;
		myRank = rank;
		myName = rankStrings[getRank()]+" of "+
	             suitStrings[getSuit()];
	}
	public int getSuit() {
		return mySuit;
	}
	
	public int getRank() {
		return myRank;
	}
	public String toString(){
		return myName;
	}
	
	public int compareTo(Object o) {
		ICard other = (ICard) o;
		int rdiff = getRank() - other.getRank();
		if (rdiff == 0) {
			return getSuit() - other.getSuit();
		}
		else {
			return rdiff;
		}
	}
	
	public boolean equals(Object o){
	    return compareTo(o) == 0;
	}
	
}
