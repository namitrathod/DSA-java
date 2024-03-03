package Search;
public class L31_searchInString {
    public static void main(String [] arg){
        String str = "Namit rathod";
        char targret = 'v';
        System.out.println(search(str, targret));
        System.out.println(searchForeach(str, targret));
    }
    static boolean search(String str , char target){
        if(str.length() == 0){                          ////////// we are using length()
            return false;
        }
        for(int i =0; i < str.length(); i++){
            int element = str.charAt(i);
            if(element==target){
                return true;
            }
        }
        return false;
    }
    
    static boolean searchForeach(String str , char target){
        if(str.length() == 0){                          ////////// we are using length()
            return false;
        }
        for(char stri : str.toCharArray()){ /// here we have used "tocharArray()" to convet the string to character array 
            if(stri==target){
                return true;
            }
        }
        return false;
    }
    
}
