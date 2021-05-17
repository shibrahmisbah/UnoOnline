/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package unoonline;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <UnoCard> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<UnoCard> showCards()
    {
        return cards;
    }
    
    public ArrayList<UnoCard> getFullDeck()
    {
        //store each possible UnoCard object into ArrayList
        ArrayList<UnoCard> fullDeck = new ArrayList<>(106);
        
        for (int i = 0; i < 4; i++){
            String color = new String();
            
            switch(i){
                case 0:
                    color = "Yellow";
                    break;
                case 1:
                    color = "Red";
                    break;
                case 2:
                    color = "Green";
                    break;
                default:
                    color = "Blue";
            } 
            
            for (int j = 0; j < )
        }//end of first for loop
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    public void setCards(ArrayList<UnoCard> list){
        cards = list;
    }
    
    /**
     * will create another arraylist of UnoCards
     * loops through the takenCards arraylist to store random cards 
     * and remove the first card of the remaining pile and add that to 
     * the taken cards pile and remove the first element of the remaining pile
     * @param numCards
     * @param otherDeck
     * @return 
     */
    public static ArrayList<UnoCard> takeRandomCards(int numCards, ArrayList<UnoCard> otherDeck) {
    
        ArrayList<UnoCard> takenCards = new ArrayList<UnoCard>(numCards);
        
        for(int i=0; i<numCards; i++){
            takenCards.add(otherDeck.get(0));
            otherDeck.remove(0);
        }
        return takenCards;
    }
}//end class