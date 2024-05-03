package LinearSearch;

public class FindminAndmax {
    public static void main(String[] args) {

        int[] arr ={12,14,20,34,44,87,1};

        int small_element = MinElement(arr);
        int large_element = MaxElement(arr);

        System.out.println("this is min element from an array: "+small_element);
        System.out.println("this is max element from an array: "+large_element);

    }

    static int MinElement(int[] arr){
        int temp = arr[0];
        for (int index=1;index<arr.length;index++){
            if(arr[index]<temp){
               temp = arr[index];
            }
        }
        return temp;
    }

    static int MaxElement(int[] arr){
        int temp = arr[0];
        for (int index=1;index<arr.length;index++){
            if(arr[index]>temp){
                temp = arr[index];
            }
        }
        return temp;
    }

}
