package com.briscola;

public interface Card extends Comparable<Card> {
    public int getSuit();

    public int getRank();
}

// public static final int SPADES = 0;
// public static final int HEARTS = 1;
// public static final int DIAMONDS = 2;
// public static final int CLUBS = 3;