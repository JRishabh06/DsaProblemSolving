package LinearSearch;

// To find targeted character in a string

public class FindChar {
    public static void main(String[] args){
        String name = "Rishabh";
        char target = 'h';
        System.out.println(Search(name,target));
    }

    static boolean Search(String name, char target){
        for(int i = 0 ; i<name.length() ; i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
