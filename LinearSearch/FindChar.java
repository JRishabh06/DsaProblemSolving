package LinearSearch;

// To find targeted character in a string

public class FindChar {
   /* public static void main(String[] args){
       String str ="Rishabh";
       char target = 't';
        System.out.println(Find(str,target));
    }

    static boolean Find(String str, char target){

        for(int i = 0 ; i < str.length() ; i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }


    // using for each loop;

    static boolean Find_2(String str , char target){

        for (char element : str.toCharArray()){
            if(target == element){
                return true;
            }
        }
        return false;
    }*/

    public static void main(String[] args) {

        String str = "Rishabh";
        char target = 'i';
        System.out.println(str.toCharArray());
        System.out.println(find(str,target));
        System.out.println(find2(str,target));

    }

    static boolean find(String str , char target){
        for(int i=0 ; i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

         static char find2(String str,char target){

             for(char ele : str.toCharArray()){
                 if(ele==target){
                     return ele;
                 }
             }
             return 0;

         }



}
