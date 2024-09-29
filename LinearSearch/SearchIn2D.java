package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {

/*
    public static void main(String[] args) {

        int[][] array = {
                {1,3,4},
                {2,5,7},
                {8,12,16}
        };
        int target = 5;

       int[] ans = search(array,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][]array,int target){

        for(int row = 0 ; row<array.length;row++){

            for(int col = 0 ; col<array[row].length;col++){
                if(array[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
*/

    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 2},
                {3, 4, 7},
                {6, 7, 9}
        };
        int target = 8;
        System.out.println(Arrays.toString(Search(array, target)));

    }

    static int[] Search(int[][] array, int target) {

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c] == target) {
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static boolean Search2(int[][] array, int target) {

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c] == target) {
                    return true;
                }
            }
        }
        return false;

    }
}
