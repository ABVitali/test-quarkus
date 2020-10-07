package com.briscola;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class DeckTest {

    @Test
    public void test() {
        Deck deck = new Deck();
        assertEquals(deck.returnOne(), 1);
    }

}