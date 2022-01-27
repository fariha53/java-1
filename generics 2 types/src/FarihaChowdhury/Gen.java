package FarihaChowdhury;

public class Gen<T, V>{
    T obj1;
    V obj2;
    Gen(T obj1,V obj2)
    {
        this.obj1=obj1;
        this.obj2=obj2;
    }
   void showTypes()
    {
        System.out.println("Types of T: "+obj1.getClass().getName());

        System.out.println("Types of V: "+obj2.getClass().getName());
    }
    T getObj1(){
        return obj1;
    }
    V getObj2()
    {
        return  obj2;
    }
}
