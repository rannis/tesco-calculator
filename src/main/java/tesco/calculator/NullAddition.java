package tesco.calculator;

/**
 * Created by christeleannis on 14/01/15.
 */
public class NullAddition implements Addition {
    @Override
    public int add() {
        throw new RuntimeException("Unrecognized addition business rule!");
    }
}
