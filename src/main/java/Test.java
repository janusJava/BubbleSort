import java.util.Arrays;
import java.util.List;

public class Test extends BubbleSort{

    public static void main(String[] args) throws Exception {

        List<Integer> listTestOne = Arrays.asList(1,4,5,6,8,3,8);
        List<Double> listTestTwo = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Double> listTestThree = Arrays.asList();
        List<Double> listTestFour = Arrays.asList(null, 5.0001);

        System.out.println("TESTS!");
        System.out.println("TEST | 1");

        sort(listTestOne);
        listTestOne.forEach(System.out::println);

        System.out.println("TEST | 2");
        sort(listTestTwo);
        listTestTwo.forEach(System.out::println);

        System.out.println("TEST | 3");
        sort(listTestThree);
        listTestThree.forEach(System.out::println);

        System.out.println("TEST | 4");
        sort(listTestFour);
        listTestFour.forEach(System.out::println);
    }
}