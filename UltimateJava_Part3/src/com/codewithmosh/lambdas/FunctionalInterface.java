package com.codewithmosh.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public interface FunctionalInterface {
    public static void show() {
        // consumer interface and chaining
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUppercase = item -> System.out.println(item.toUpperCase());
        list.forEach(print.andThen(printUppercase));

        // we could pass lambda expression directly into the parameter, not explicitly
        // assign it to a Consumer Interface type
        list.forEach(item -> System.out.println(item));

        // supplier interface
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);

        // function interface
        Function<String, Integer> map = str -> str.length();
        var len = map.apply("abc");
        System.out.println(len);

        // composing function
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        var r = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(r);

        // Predicate interface
        Predicate<String> isLongThanFive = str -> str.length() > 5;
        var outcome = isLongThanFive.test("sky");

        // composing Predicates
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.startsWith("}");
        Predicate<String> both = hasLeftBrace.and(hasRightBrace);

        // UnaryOperator Interface
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }

    public static void main(String[] args) {
        show();
    }
}