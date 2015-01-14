package tesco.calculator;

/**
 * Created by remyannis on 14/01/15.
 */
public class MoreThanOneNumber implements Addition {

    private final String[] numbersArray;

    public MoreThanOneNumber(String[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    @Override
    public int add() {

        int sum = 0;
        for(String number : numbersArray){
            if(number.matches("\\d+") && Integer.parseInt(number)< 1001) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}
