public class Mathclass {
    public static void main(String[] args) {
        System.out.println(oddorEven(4));
        System.out.println(oddorEven(9));
    }

    public static String oddorEven(int n) {
        if (n % 2 == 0) {
            return "Even";

        } else {
            return "Odd";
        }
    }

}
