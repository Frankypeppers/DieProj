public class Yahtzee
{
    /**
     * just make stuff into arrays, this is too jumbled
     * 
     * >:(
     */

    Die6[] dice = new Die6[5];

    /**
     * Constructor
     */
    public Yahtzee()
    {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die6();
        }
    }

    public void roll()
    {
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
        }
    }

    public void roll(int dieNumber)
    {
        if (dieNumber == 1) {
            dice[0].roll();
        } else if (dieNumber == 2) {
            dice[1].roll();
        } else if (dieNumber == 3) {
            dice[2].roll(); 
        } else if (dieNumber == 4) {
            dice[3].roll();
        } else if (dieNumber == 5) {
            dice[4].roll();
        } else if (dieNumber == 6) {
            dice[5].roll();
        } 
    }
}