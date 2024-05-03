package LinearSearch;

public class SearchInrange {
    public static void main(String[] args) {
        int [] arr = {21,23,55,67,76,56};
        int target = 67;
        System.out.println(linerSearch(arr,target,1,4));
    }

    static int linerSearch(int[] arr,int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <=end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

}
