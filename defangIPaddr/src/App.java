public class App {
    public static void main(String[] args) throws Exception {
        
        String ipAddr = "127.0.0.1";
        System.out.println(defangIPaddr(ipAddr));

    }

    public static String defangIPaddr(String addr) {

        return addr.replaceAll("[.]", "[.]");
    }
}
