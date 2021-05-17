  
/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package unoonline;
/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */

public abstract class Card {
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    /**10 per color (0-9 x 2) + 
     * 4 action cards per color (2 [reverse, +2] action cards x 2)
     * Wild Cards: Wild (change color) Wild Draw 4  
     * 
     */
    private String color;
    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public Card(String color, String rank){
        color = this.color;
        rank = this.rank;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        color = this.color;
    }
    
    @Override
    public abstract String toString();
       
}
