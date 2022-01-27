package FarihaChowdhury;

public class Gen<T> {
    T obj;
    Gen(T obj)
    {
        this.obj=obj;
    }
    T get()
    {
        return obj;
    }

    void  showType(){
        System.out.println("Type of T is "+ obj.getClass().getName() );
    }

}
