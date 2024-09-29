package LinearSearch;

public class SearchInrange {
   /* public static void main(String[] args) {
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
    }*/

    public static void main(String[] args){
     int[] arr={18,13,14,15,12};
     int target=12;
        System.out.println(SIR(arr,target,1,4));

    }
    static int SIR(int[]arr,int target,int S,int E){
        for(int i=S;i<=E;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }


}
