import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Supplier<Integer> s = () -> (int)(Math.random()*10);
        System.out.println("Supplier :: " + s.get());

        Consumer<String> c = i -> System.out.println("Consumer :: " + i); 
        c.accept("RRS108");

        Function<Integer, Double> f = i -> i/100.0;
        System.out.println("Function :: " + f.apply(90));

        Predicate<Integer> p = i -> i == 0; 
        System.out.println("Predicate :: " + p.test(10));
        // default, static method 가 존재한다.
        Predicate<Integer> p1 = i -> i < 10;
        Predicate<Integer> p2 = i -> i < 20;
        Predicate<Integer> p3 = p.and(p1.negate().and(p2));
        System.out.println("Predicate2 :: " + p3.test(10));
        Predicate<String> pS = Predicate.isEqual("isOk!");
        System.out.println("Predicate3 :: " + pS.test("isOk!"));
        System.out.println("Predicate3 :: " + pS.test("isGood!"));

        Callable<Integer> C = () -> (int)(Math.random()*10);
        System.out.println("Callable :: " + C.call());
    }
}
