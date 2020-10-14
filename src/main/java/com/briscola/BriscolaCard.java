package com.briscola;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BriscolaCard implements Card<BriscolaCard> {

    private int suit;
    private int rank;

    public enum suit {
        COINS, SWORDS, CUPS, CLUBS;
    }

    public enum ranks {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, KNAVE, KNIGHT, KING
    }

    private int getOrderValue(int rank) {
        switch (rank) {
            case 1:
                return 10;
            case 2:
                return 1;
            case 3:
                return 9;
            default:
                return rank - 2;
        }
    }

    private int compareRanks(int rank2) {
        int result = getOrderValue(rank) - getOrderValue(rank2);
        if (result < 0)
            return -1;
        if (result > 0)
            return 1;
        return result;
    }

    public int getScore() {
        switch (rank) {
            case 1:
                return 11;
            case 3:
                return 10;
            case 8:
                return 2;
            case 9:
                return 3;
            case 10:
                return 4;
            default:
                return 0;
        }
    }

    @Override
    public int compareTo(BriscolaCard other) {
        if (suit != other.getSuit())
            return 0;
        return compareRanks(other.getRank());
    }
}
