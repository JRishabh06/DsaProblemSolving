package LinearSearch;

public class FindMax2D {
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
        int max = 0;
        for (int[] ints : array) {

            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

}

