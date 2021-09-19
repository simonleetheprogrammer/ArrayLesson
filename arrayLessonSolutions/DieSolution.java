package arrayLessonSolutions;

/**
 * Works with Player Class
 * This is a watered down version of Assignment 3.
 * We just have the numSides
 * We just have the showing, who's value is only defined after rolling the dice
 */
public class DieSolution {

    private int numSides = 6;

    private int showing = 0;

    public DieSolution(){
        numSides = 6;
    }


    public void roll() {
        showing = (int) ((numSides) * Math.random() + 1); // randomize number
    }

    public int getShowing() {
        return showing;
    }

    public int getNumSides() {
        return numSides;
    }

    @Override
    public String toString() {
        return "Die{" +
                "numSides=" + numSides +
                ", showing=" + showing +
                '}';
    }
}
