package LinearSearch;

public class linearSearch{
   /* public static void main(String[] args) {
         int[] arr = {4,5,3,6,10,12,23,435,89};
         int target = 1;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr , int target){
        // this loop will iterate till the element found
        for (int i = 0 ; i < arr.length ; i++){
            //to check if the element is present or not
            if(arr[i] == target){
                return i;
            }
        }
        // It will run when no index match with the target
        return -1;
    }


 *//*   // Another way to find the element is >>>>> For Each loop

    static boolean UsingForeach(int[] arr, int target){
        for (int element: arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }*//*
*/

   public static void main(String[] args){
       int[] arr = {23,43,12,44,56};
       int target = 48;
       System.out.println(foreach(arr,target));

   }

   static boolean foreach(int[] arr,int target){
       for(int ele: arr){
           if(ele==target) {
               return true;
           }
       }
       return false;
    }
}
