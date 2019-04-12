//Лямбда-выражение, принимающее 1 параметр

        interface NumericTest {boolean test ( int n) ;}

public class LambdaDemo2
{
    public static void main(String[] args)
    {
        System.out.println("\nЛямбда-выражение, принимающее 1 параметр: ");
        NumericTest isEven = (n) -> (n % 2) == 0;
        if(isEven.test(10)) System.out.println("Число 10 четное");
        if(isEven.test(9)) System.out.println("Число 9 нечетное");
        NumericTest isNonNeg = (n) -> n >= 0;
        if(isNonNeg.test(1)) System.out.println("Число 1 неотрицательное");
        if(isNonNeg.test(-1)) System.out.println("Число -1 отрицательное");
    }
}
