package functional.demo;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {

        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";


        System.out.println(addMark.apply("Hola"));
        System.out.println(quote.apply("Hola amigos!"));

        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftPad.apply("Java", 10));

        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;
        System.out.println(multiplicacion.apply(5,4));

        BinaryOperator<Integer> mult = (x, y) -> x * y;
        System.out.println(mult.apply(5,5));


        List<BiFunction<String, Integer, String>> formateadores;

    }

}
