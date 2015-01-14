package tesco.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by remyannis on 13/01/15.
 */
public class Calculator {
    public int add(String numbers) {
        checkForNegativeNumbers(numbers);
        Addition addition = AdditionFactory.getAddition(numbers);
        return addition.add();

    }

    private void checkForNegativeNumbers(String numbers) {
        Pattern p = Pattern.compile("-\\d+");
        Matcher m = p.matcher(numbers);
        String negativeNumbers = "";
        while (m.find()) {
            negativeNumbers +=  m.group() + ",";
        }
         if(!negativeNumbers.equals("")) {
             throw new NumberFormatException("Negative numbers: " + negativeNumbers);
         }
    }

}
