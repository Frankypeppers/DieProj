public class Yahtzee
{
    /**
     * just make stuff into arrays, this is too jumbled
     * 
     * >:(
     */
    
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    Die6 die6;
    
    /**
     * Constructor
     */
    public Yahtzee()
    {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
        die6 = new Die6();
    }
    
    public void roll()
    {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
        die6.roll();
    }
    
    public void rollDie()
    {
        
    }
}