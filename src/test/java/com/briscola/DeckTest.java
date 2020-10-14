package com.briscola;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

// @QuarkusTest
// public class DeckTest {

//     @Test
//     public void test() {
//         Deck deck = new Deck();
//         assertEquals(1, deck.returnOne());
//     }

//     public static void printCards(ArrayList cards){
// 		for(int k=0; k < cards.size(); k++){
// 			System.out.println(cards.get(k));
// 		}
//     }
    
//     public static boolean isSorted(ICard[] list){
// 		for(int k=1; k < list.length; k++){
// 			if (list[k-1].compareTo(list[k]) > 0){
// 				return false;
// 			}
// 		}
// 		return true;
//     }
    
//     @Test
//     public void testDeck() {
//         Deck d = new Deck();
// 		ArrayList list = new ArrayList();
// 		while (d.hasNext()){
// 			list.add(d.next());
// 		}
// 		printCards(list);
// 		Collections.sort(list);
// 		printCards(list);
// 		ICard[] clist = (ICard[]) list.toArray(new ICard[0]);
// 		System.out.println("sorted? "+isSorted(clist));
//     }
// }