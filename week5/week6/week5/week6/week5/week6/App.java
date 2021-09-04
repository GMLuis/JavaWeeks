package week5.week6;

public class App {
    public static void main(String[] args){
        Deck deck = new Deck();
        Player player1 = new Player("Mickey Mouse");
        Player player2 = new Player("Donald Duck");
       
        deck.shuffle();
        for(int i=0; i<52; i++)
        {
            if(i%2==0)
                player1.draw(deck);
            else
                player2.draw(deck);
        }
        for(int i=0; i<26; i++)
        {
            Card p1Card = player1.flip();
            Card p2Card = player2.flip();
            if (p1Card.getValue() > p2Card.getValue())
                player1.incrementScore();
            else
                player2.incrementScore();
        }
        System.out.println(player1.getName() + "'s Score: " + player1.getScore());
        System.out.println(player2.getName() + "'s Score: " + player2.getScore());
       
        if(player1.getScore() > player2.getScore())
            System.out.println(player1.getName() + " is the winner!");
        else if(player1.getScore() < player2.getScore())
            System.out.println(player2.getName() + " is the Winner!");
        else
            System.out.println("Draw. No Winner");
    }
}
