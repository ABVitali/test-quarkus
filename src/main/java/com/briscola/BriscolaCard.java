package com.briscola;

public class BriscolaCard implements Card<BriscolaCard> {

    // public static final int SPADES = 0;
    // public static final int HEARTS = 1;
    // public static final int DIAMONDS = 2;
    // public static final int CLUBS = 3;

    private int suite;
    private int rank;

    public BriscolaCard(int suite, int rank) {

    }

    @Override
    public int getSuit() {
        return 1;
    }

    @Override
    public int getRank() {
        return 1;
    }

    @Override
    public int compareTo(BriscolaCard gne) {
        return 1;
    }
}
