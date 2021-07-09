import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        /**
         * Проблема была в том что при делении не было проверки на деление на 0. Добавил проверку и вывод читабельной ошибки.
         */
        if (y==0){
            throw new ArithmeticException("Вы пытаетесь разделить на 0. Так делать НЕЛЬЗЯ!!!");
        }
        return x/y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
