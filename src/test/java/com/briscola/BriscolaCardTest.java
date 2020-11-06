package com.briscola;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class BriscolaCardTest {

    @Test
    void compareOnDifferentSuit() {
        BriscolaCard card1 = new BriscolaCard(1, 2);
        BriscolaCard card2 = new BriscolaCard(2, 3);

        assertEquals(0, card1.compareTo(card2));

        card1 = new BriscolaCard(1, 6);
        card2 = new BriscolaCard(3, 2);

        assertEquals(0, card1.compareTo(card2));
    }

    @Test
    void compareOnSameSuit() {
        BriscolaCard card1 = new BriscolaCard(1, 2);
        BriscolaCard card2 = new BriscolaCard(1, 3);

        assertEquals(-1, card1.compareTo(card2));

        card1 = new BriscolaCard(1, 1);
        card2 = new BriscolaCard(1, 3);

        assertEquals(1, card1.compareTo(card2));

        card1 = new BriscolaCard(1, 3);
        card2 = new BriscolaCard(1, 4);

        assertEquals(1, card1.compareTo(card2));

        card1 = new BriscolaCard(1, 5);
        card2 = new BriscolaCard(1, 4);

        assertEquals(1, card1.compareTo(card2));

        card1 = new BriscolaCard(1, 5);
        card2 = new BriscolaCard(1, 6);

        assertEquals(-1, card1.compareTo(card2));

        card1 = new BriscolaCard(1, 6);
        card2 = new BriscolaCard(1, 6);

        assertEquals(0, card1.compareTo(card2));
    }
}