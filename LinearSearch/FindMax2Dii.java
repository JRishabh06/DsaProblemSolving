package LinearSearch;

public class FindMax2Dii {
    public static void main(String[] args) {
        int[][] array = {
                {1,3,4},
                {2,25,7},
                {8,12,16}
        };

        int ans = Maximum(array);
        System.out.println(ans);

    }
    static int Maximum(int[][]array){
        int max = array[0][0];
        for(int[] RowElement : array){

            for(int ColElement : RowElement){
                if(ColElement>max){
                    max = ColElement;
                }
            }
        }
        return max;
    }
}
