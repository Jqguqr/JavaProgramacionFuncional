package functional.demo;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {

    public static void main(String[] args) {

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(square.apply(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 ==1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4); // true

        Predicate<Student> isApproved = student -> student.getCalification() >= 6.0;

        Student Adrian = new Student(10);

        System.out.println(isApproved.test(Adrian));

    }

    static class Student{

        private double calification;

        public Student(double calification){
            this.calification = calification;
        }

        public double getCalification() {
            return calification;
        }
    }

}
