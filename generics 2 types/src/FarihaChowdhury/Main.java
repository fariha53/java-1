package FarihaChowdhury;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gen<Integer, String> m = new Gen<Integer, String>(239,"home");
        m.showTypes();

        int v = m.getObj1();
        System.out.println("Value :"+ v);

        String  str = m.getObj2();
        System.out.println("Value :"+ str);
    }
}
