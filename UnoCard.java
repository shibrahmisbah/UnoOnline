/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoonline;

import java.util.ArrayList;

/**
 *
 * @author cute_
 */
public class UnoCard extends Card{
    
    public UnoCard(String color, String rank){
        super(color, rank);
    }

    @Override
    public String toString(){ 
        return getColor() + getRank();
    }
    
    public static boolean validRank(String rank, ArrayList<UnoCard> deck) {
        rank = rank.toLowerCase();
        
        if (!validInput(rank))
            return false;
        
        //check if each card in the deck is valid
        for (UnoCard card : deck) {
            if (card.getRank().toLowerCase().equals(rank))
                return true;
        }
        
        return false;
    }
    
    private static boolean validInput(String rank){
        
        switch(rank){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "Skip":
            case "Reverse":
//            case "+2":
//            case "Wild Card":
//            case "Color Change":
               
            return true;
        }
            return false;
    } 
}
