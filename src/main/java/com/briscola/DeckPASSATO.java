package com.briscola;

import java.util.List;

public interface DeckPASSATO<T extends Card> {
    List<T> draw();

    List<T> draw(int number);

    void shuffle();

    int size();
}
