// https://www.educative.io/answers/the-valid-parentheses-problem

import com.coding.interview.practice.ValidParentheses;

public class Main {
    public static void main(String[] args) {

        //Given a String  S="[{(})[]" , find out whether it contains valid paranthesis or not

        String  s = "[{(})]";
        ValidParentheses valid = new ValidParentheses();
        valid.valid_paren(s);
        int openCounter = 0;
        int closingCounter = 0;
        char [] charArray = s.toCharArray();
        for (int i=0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                openCounter ++;
            }
            if (charArray[i] == ')') {
                closingCounter ++;
            }
        }
        if(openCounter != closingCounter) {
            System.out.println("Invalid number of paranthesis");
        } else if (false){
            System.out.println("Valid!");
        }
    }
}

// SOLID principles
//- Databases
//- Tell me about yourself
//- Design Patterns Structural design patterns
//- GOF
//- SAGA
//- Security
//- PL SQL Joins Union Union all
//- Association and Aggregation and Composition https://www.educative.io/answers/association-vs-composition-vs-aggregation
//- Union Union All
