package staticExample;

public class innerclass {
    static class Test {
        String name;
        public Test (String name){
            this.name =name;
        }
        // @Override
        // public static toString (){
        //     return name;
        // }                                          // NOt worked
        
    }
    public static void main(String[] args) {
        Test a = new Test("Namit");
        Test b = new Test("Amit");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);

    }
}

