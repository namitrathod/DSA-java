package Backtracking;
import java.util.ArrayList;

public class L81_phonePad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padret("", "12"));
        System.out.println(padCount("", "12"));
        
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i= (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
    static ArrayList<String> padret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans= new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> ans= new ArrayList<>();
        for(int i= (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            ArrayList<String> ansprevious = padret(p+ch, up.substring(1));
            ans.addAll(ansprevious);
        }
        return ans;
    }

    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit = up.charAt(0)-'0';
        for(int i= (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            count = count + padCount(p+ch, up.substring(1));
        }
        return count;
    }
}
