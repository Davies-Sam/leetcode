import java.util.Stack;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {


        System.out.println(isValid("{}[]{}[}[{}{}"));
        System.out.println(isValid("{}[]{{[]}}"));
    }

    public static Boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> m = Map.of(
            '}','{',
            ']','[',
            ')','(');
        
        
        for(char c: s.toCharArray()) {
            if (m.containsValue(c)){
                stack.push(c);
            }
            else{
                if(stack.empty()) return false;
                if(stack.pop() != m.get(c)) {
                    return false;
                }
            } 
        }
        
        return stack.empty();

    }
}
