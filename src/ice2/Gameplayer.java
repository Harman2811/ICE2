/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice2;

/**
 *
 * @author Harmanpreet Kaur
 * Student ID 991710888
 */
public class Gameplayer {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cardhand ch=new cardhand();
        ch.generateHand();
        
        for(card c:ch.cards)
        {
            System.out.println(c.getRank()+" of "+c.getColor());
  }
}

   
}
