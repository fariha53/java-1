package FarihaChowdhury;
//Bounded types
public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer in[] ={1,2,3,4,5};
        Gen<Integer> io = new Gen<Integer>(in);
        double v = io.average();
        System.out.println("io Average  ="+ v);

        Double dn[] ={1.1,2.2,3.3,4.4,5.5};
        Gen<Double> dob = new Gen<Double>(dn);

        double r = dob.average();
        System.out.println("dob average :"+ r);
    }
}
