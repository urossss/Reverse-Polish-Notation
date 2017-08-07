package RPN;

import java.util.*;

public class PostfixEvaluator {

    private static ArrayList<String> expression;
    private static String operators = "+-*/";
    private static Stack<String> stack = new Stack<String>();

    public static void setExpression(ArrayList<String> exp) {
        expression = exp;
    }

    public static int evaluateExpression() {
        for (String s : expression) {
            if (s.equals(null)) break;
            if (operators.contains(s)) {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                
                int r = performOperation(operators.indexOf(s), a, b);
                
                stack.push(String.valueOf(r));
            } else {
                stack.push(s);
            }
        }
        
        int returnValue = Integer.valueOf(stack.pop());

        return returnValue;
    }

    public static int performOperation(int operation, int num1, int num2) {
        switch (operation) {
            case 0:
                return num1 + num2;
            case 1:
                return num2 - num1;
            case 2:
                return num1 * num2;
            case 3:
                return num2 / num1;
            default:
                return -1;
        }
    }

}
