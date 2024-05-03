package LinearSearch;

public class linearsearch {
    public static void main(String[] args) {
        int[] num = {3,6,9,12,15};
        int target = 6;
        int ans = linerSearch(num,target);
        System.out.println(ans);
    }

    static int linerSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
//    static int linerSearch2(int[] arr,int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
//        return -1;
//    }


}
