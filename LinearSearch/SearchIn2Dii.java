package LinearSearch;

public class SearchIn2Dii {
    public static void main(String[] args) {

        int[][] array = {
                {1,3,4},
                {2,5,7},
                {8,12,16}
        };
        int target = 5;

        int ans = search(array,target);
        System.out.println(ans);

    }
    static int search(int[][]array,int target){

        for(int row = 0 ; row<array.length;row++){

            for(int col = 0 ; col<array[row].length;col++){
                if(array[row][col]==target){
                    return array[row][col];
                }
            }
        }
        return -1;
    }
}
