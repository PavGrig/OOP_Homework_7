package Calculator;

import Calculator.Operation.Operation;
import Calculator.Operation.SumOperation;

public class CalcStringParser {

    public Operation parse(String[] calcArgs) {
        final double num1 = Double.valueOf(calcArgs[0]);
        final double num2 = Double.valueOf(calcArgs[2]);
        return new SumOperation(num1, num2);
    }
}
