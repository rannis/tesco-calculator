package tesco.calculator;

/**
 * Created by remyannis on 13/01/15.
 */
public class Calculator {
    public int add(String numbers) {
        Addition addition = AdditionFactory.getAddition(numbers);
        return addition.add();

    }
}
