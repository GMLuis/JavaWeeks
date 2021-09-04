package week5.week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck{

    public ArrayList<Card> cards = new ArrayList<>();
    public String inValue[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public String inName[] = {"Heart", "Diamond", "Spade", "Club"};

    public Deck()
    {
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<13; j++)
            {
            String name = inValue[j] + " of " + inName[i];
            Card card = new Card(name, j);
            cards.add(card);
            }
        }
    }
    public void shuffle()
    {
        Collections.shuffle(cards, new Random());
    }
    public Card draw()
    {
        Card onTop = cards.get(cards.size()-1);
        cards.remove(onTop);

        return onTop;
    }  
}