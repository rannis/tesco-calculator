package tesco.calculator;

/**
 * Created by remyannis on 14/01/15.
 */
public class OneNumber implements Addition {

    private final String[] numbersArray;

    public OneNumber(String[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    @Override
    public int add() {
        return Integer.parseInt(numbersArray[0]);
    }
}
