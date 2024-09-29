package LeetCodeProblems.java;

public class Problem1ii {

    public static void main(String[] args) {
        int[] arr = {12, 14, 155, 6, 1234, 1234561};
        System.out.println(findDigits(arr));


    }

    static int findDigits(int[] nums){
        int count=0;
        for(int ele : nums){

            if(isEven(ele)){
                count++;

            }

        }

        return count;

    }

    static boolean isEven(int number){
        int numofdigits = countDigit(number);
        return numofdigits % 2 == 0;
    }
    static int countDigit(int num){
        int count=0;

        while ((num>0)){
            num=num/10;
            count++;
        }
        return count;
    }



}