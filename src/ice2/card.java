/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice2;

/**
 *
 * @author Harmanpreet Kaur
 * 991710888
 */
public class card {
    
    public enum Color{
    RED,YELLOW,GREEN,BLUE
    }
    public enum Rank{
        ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAW_TWO,DRAW_FOUR,WILDCARD
        
    }
    
    private final Color color;
    private final Rank rank;

    public card(Color color,Rank rank)
    {
        this.color=color;
        this.rank=rank;
    }
    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @return the rank
     */
    public Rank getRank() {
        return rank;
}
}
 
