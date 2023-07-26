/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice2;

/**
 *
 * @author Harmanpreet Kaur
 * 9917410888
 */
public class cardhand {
    

    private int handSize=60;
    public card[] cards=new card[handSize];
    
    //A method which generate a deck of cards
    
    public void generateHand()
    {
        int countCards=0;
        
        for(card.Color C:card.Color.values())
        {
            for(card.Rank R: card.Rank.values() )
            {
                cards[countCards]=(new card(C,R));
                countCards++;            
            }
        
        
        }
    }
}
