package FarihaChowdhury;

public  class TestGenerics{


    public static void main(String[] args) {
	// write your code here
        Gen<Integer> m = new Gen<Integer>(88);
        m.showType();
        //m.add(2);
      //  m.add(239);

        int v = m.get();
        System.out.println("Value : "+v);

        Gen<String > s = new Gen<>("Home");
        s.showType();
         String  str = s.get();
        System.out.println("Value : "+str);


    }
}
