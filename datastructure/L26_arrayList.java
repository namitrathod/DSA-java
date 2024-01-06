import java.util.ArrayList;
import java.util.Scanner;

public class L26_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner in = new Scanner(System.in);

        // slower then normal array
        list.add(23);
        list.add(78);
        list.add(55);
        list.add(22);
        list.add(73);
        list.add(63);
        list.add(93);
        list.add(53);
        list.add(21);
        list.add(33);
        list.add(33);

        System.out.println(list);
        System.out.println(list.contains(22));
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

        //input through loop
        for (int i=0; i<5;i++){
            list.add(in.nextInt());
        }
        // output through loop
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        

    }
    
}
