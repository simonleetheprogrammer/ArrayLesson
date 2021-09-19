package arrayLessonSolutions;

/**
 * Array in an array
 */
public class ArrayInArray {
    public static void main(String[] args) {
        //python example
        // list1 = [[1,2,3],[1,2,4],[3,2,1]]
        //                   i=0       i=1           i=2
        int[][] numInNum = {{1,2,3} ,{3,2,1} ,{11,22,33,44,55,66} };
        //       j index=    0,1,2    0,1,2     0, 1, 2, 3, 4, 5

        for (int i = 0; i < numInNum.length; i++) {    // iterate to look at i = 0 , 1 , 2

            for (int j = 0; j < numInNum[i].length; j++) { // match i and j up top. for example. if i=2 and j=3, numInNum[2][3] = 44

                System.out.println("array# "+ i + " : "+ numInNum[i][j]);
            }
        }

    }
}
