interface NumericTest2{boolean test (int n,int d);}

public class LambdaDemo3 {

    public static void main(String args []) {
        System.out.println("\nЛямбда-выражение, принимающее два параметра: ");
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2))
            System.out.println("Число 2 является множителем числа 10");
        if (!isFactor.test(10, 3))
            System.out.println("Число 3 неявляется множителем числа 10");
        }
    }
