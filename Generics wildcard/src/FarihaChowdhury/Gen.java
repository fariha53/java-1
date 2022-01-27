package FarihaChowdhury;

public class Gen<T extends Number> {
    T[] num;
    Gen(T[] num)
    {
        this.num = num;
    }
    double average()
    {
        double sum = 0.0;
        for (int i=0;i<num.length;i++)

            sum+=num[i].doubleValue();
            return sum/ num.length;

    }
}

