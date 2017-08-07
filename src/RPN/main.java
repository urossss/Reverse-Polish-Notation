package RPN;

import java.util.*;

public class main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        
        String s = reader.nextLine();
        do {
            arr.add(s);
            s = reader.nextLine();
        } while (!s.equals("zz"));
        
        PostfixEvaluator.setExpression(arr);

        System.out.print(printExpression(arr));
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
