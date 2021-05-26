public class App {
    public static void main(String[] args) throws Exception {

        String x = removeVowels(args[0]);
        System.out.println(x);
    }

    public static String removeVowels(String x) {

        return x.replaceAll("[aeiou]", "");
    }
}