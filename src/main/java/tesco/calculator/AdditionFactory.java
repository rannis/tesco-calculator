package tesco.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by remyannis on 14/01/15.
 */
public class AdditionFactory {

    public static Addition getAddition(String numbers) {

        String[] numbersArray = numbers.split(delimiters(numbers));
        int numbersAmount = numbersArray.length;

        if(numbersAmount == 1 && numbersArray[0].isEmpty()) {
            return new EmptyNumbers();
        }

        if(numbersAmount == 1 && !numbersArray[0].isEmpty()) {
            return new OneNumber(numbersArray);
        }

        if(numbersAmount > 1) {
            return new MoreThanOneNumber(numbersArray);
        }

        return new NullAddition();
    }


    private static String delimiters(String numbers) {
        Pattern pattern = Pattern.compile("^//(.*?)\\n");
        Matcher matcher = pattern.matcher(numbers);
        if(matcher.find()){
            System.out.println("Matching->" +matcher.group(1));
            return "[,\\n" + matcher.group(1)+ "]";
        } else {
            return "[,\\n]";
        }
    }
}
