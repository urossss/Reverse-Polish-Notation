package RPN;

import java.util.*;

public class main {

    public static void main(String[] args) {
        
        // nebitan komentar
        Scanner reader = new Scanner(System.in);
        ArrayList<String> exp = new ArrayList<String>();
        
        String s = reader.nextLine();
        do {
            exp.add(s);
            s = reader.nextLine();
        } while (!s.equals("zz"));
        
        PostfixEvaluator.setExpression(exp);

        System.out.print(printExpression(exp));
        System.out.println("= " + PostfixEvaluator.evaluateExpression());

    }

    public static String printExpression(ArrayList<String> str) {
        String returnString = "";

        for (String s : str) {
            returnString += s + " ";
        }

        return returnString;
    }
}
