interface NumericFunc{int func(int n);}
public class BlockLambdaDemo {
    public static void main(String[] args){
        System.out.println("\nБлочное Лямбда-выражение: ");
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
        System.out.println("Факториал числа 3 равен " + factorial.func(3));
    }
}
