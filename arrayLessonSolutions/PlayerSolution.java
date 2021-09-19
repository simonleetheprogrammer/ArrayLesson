package arrayLessonSolutions;

import java.util.Arrays;

/**
 * Works with Die Class.
 * This class is basically a watered down version of the Player Class from our Assignment 2.
 * the GameView class is basically just our psvm here
 * dieArray, we can think of it like a fistfull of dice, or a yahtzee cupfull of dice.
 * we can change the numberOfDice variable to be whatever number we want.
 */
public class PlayerSolution {
    /** Default number of dice is 3 **/
    private static int numberOfDice = 3;
    /** Default number of dice instantiated is 3 **/
    private DieSolution[] dieArray = new DieSolution[3];
    private int score = 0;

    /** Default constructor with 3 dice **/
    public PlayerSolution(){
        for (int i = 0; i<numberOfDice; i++){
            dieArray[i] = new DieSolution();
        }
    }
    // Here is an alternate way of doing this. It works too, and is in fact more efficient I think.
    // But this won't work when we have variables like down below.
//    public PlayerSolution(){
//        dieArray[0] = new DieSolution();
//        dieArray[1] = new DieSolution();
//        dieArray[2] = new DieSolution();
//    }

    /** We can change moreDice to be higher or lower for more dice **/
    public PlayerSolution(int numberOfDice){
        this.numberOfDice = numberOfDice;
        dieArray = new DieSolution[numberOfDice];
        for (int i = 0; i<numberOfDice; i++){
            dieArray[i] = new DieSolution();
        }
    }

    public void rollAllDice(){
        for (int i = 0; i<numberOfDice; i++){
            dieArray[i].roll();
            score+= dieArray[i].getShowing();
        }
// this only works if there are 3 dice, we need a loop to accommodate a variable number of dice.
//        dieArray[0].roll();
//        dieArray[1].roll();
//        dieArray[2].roll();
//        score += dieArray[0].getShowing();
//        score += dieArray[1].getShowing();
//        score += dieArray[2].getShowing();
    }

    @Override
    public String toString() {
        return "Player{" +
                "dieArray=" + Arrays.toString(dieArray) +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        // 3 dice rolled only
        PlayerSolution threeDiceRolled = new PlayerSolution();
        threeDiceRolled.rollAllDice(); // roll da dice
        System.out.println(threeDiceRolled.score);

        // 10 dice or more dice
        PlayerSolution manyDiceRolled = new PlayerSolution(10);
        manyDiceRolled.rollAllDice(); // roll da dice
        System.out.println(manyDiceRolled.score);
    }
}
