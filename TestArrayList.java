import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size: " + cityList.size());
        System.out.println("Is Tokyo in the list? " + cityList.contains("Tokyo"));
        System.out.println("The index of Denver: " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        cityList.add(2, "Xian");
        System.out.println("After adding Xian at index 2: " + cityList);

        cityList.remove("Miami");
        System.out.println("After removing Miami: " + cityList);

        cityList.remove(0);
        System.out.println("After removing element at index 0: " + cityList);

        System.out.println("City at index 1: " + cityList.get(1));
        cityList.set(1, "Chicago");
        System.out.println("After setting index 1 to Chicago: " + cityList);
    }
}
