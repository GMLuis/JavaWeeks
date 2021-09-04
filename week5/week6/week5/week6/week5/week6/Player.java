package week5.week6;

import java.util.ArrayList;

public class Player{
   
    public ArrayList<Card>  hand = new ArrayList<>();
    public int score;
    public String name;
  
    public Player(String name)
    {
        this.name = name;
        score = 0;
    }
  
    public String getName()
    {
       return name;
    }
    public int getScore()
    {
       return score;
    }

    public void describe()
    {
        System.out.println ("Player name: " + name);
        for(int i=0; i<hand.size(); i++)
        {
            hand.get(i).describe();
        }
    }
  
    public Card flip()
    {
        Card onTop = hand.get(hand.size()-1);
        hand.remove(onTop);
        
        return onTop;
    }
  
    public void draw(Deck deck)
    {
        Card card = deck.draw();
        hand.add(card);
    }
  
    public void incrementScore()
    {
       score = score + 1;
    }
}