package arrayLessonSolutions;

/**
 * A basic runthrough of arrays
 */
public class ArrayExample {
    public static void main(String[] args) {
        /** An uninitialized array **/
        int[] numberArray;
        /** Array set at 5 **/
        int[] numberArray2 = new int[5];
        //numberArray[0] = 1; // this will cause an error because it is not initiated.

        // To add arrays
        numberArray2[0] = 1;
        numberArray2[1] = 2;
        numberArray2[2] = 3;
        numberArray2[3] = 4;
        numberArray2[4] = 5;

        // These wont work
        numberArray2[6] = 4; // out of range. We cannot extend
        numberArray2[-1] = 4; // out of range, only works in python


        // Here is a quicker way to create arrays
        int[] numberArray3 = {1,2,34,5,6,74,2,123};
        // We can change numberArray2 to a different array like this.
        // Notice how it has more numbers in it.
        numberArray2 = new int[]{1,2,3,4,5,6,7,8};

        // to access
        System.out.println(numberArray2[0]);

        // to access everything (there are methods you can grab online)
        for (int i = 0; i < 5; i++){
            System.out.println(numberArray2[i]);
        }

        // changing
        numberArray2[0]= 100;
        System.out.println(numberArray2[0]);//proof

        // show cool stuff to do with arrays
    }
    // can swap
    public static void swap(int[] numArray, int index1, int index2){
        int copy = numArray[index1]; // need this to hold a duplicate backup
        numArray[index1] = numArray[index2];
        numArray[index2] = copy;   // put backup into index2
    }

}