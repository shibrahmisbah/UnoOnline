/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoonline;

/**
 *
 * @author cute_
 */
public class UnoGame extends Game{
    
    private UnoPlayer player;
    private UnoPlayer cpu;
    
    public UnoGame(String givenName){
        super(givenName);
    }
    
    @Override
    public void play(){
        //1. Create GroupOfCards object to store full deck
        GroupOfCards fullDeck = new GroupOfCards(106);
        fullDeck.setCards(fullDeck.getFullDeck());
        
        //2. Shuffle the full deck
        fullDeck.shuffle();
        
        //3. Generate a deck of 7 cards and assign to player
        
        GroupOfCards playerCards = new GroupOfCards(7);
        playerCards.setCards(GroupOfCards.takeRandomCards(7, fullDeck.showCards()));
        
        
        
        
        
    }

    @Override
    public void declareWinner() {
        
    }
    
    
    
    
}
