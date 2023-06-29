package HW10;

import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        String example1 = "(2 + 3) * (5 - 2)";
        String example2 = "(2 + 3 * (5 - 2)";
        String example3 = "(2 + 3) * 5 - 2)";
        String example4 = "((2 + 3) * 5 - 2)";

        System.out.println(example1 + "   " + checkBrackets(example1));
        System.out.println(example2 + "   " + checkBrackets(example2));
        System.out.println(example3 + "   " + checkBrackets(example3));
        System.out.println(example4 + "   " + checkBrackets(example4));
    }
    public static String checkBrackets(String example){
        Stack<Character> stack = new Stack<>();

        for (char ch: example.toCharArray()){
            if (ch == '('){
                stack.push(ch);
            }
            if (ch == ')'){
                if (stack.isEmpty()){
                    return "скобка не открыта";
                }else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()){
            return "скобка не закрыта";
        }
        return "все верно";


    }
}
