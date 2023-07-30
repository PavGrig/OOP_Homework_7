package Calculator;

import Calculator.Operation.Operation;

public class Calculator {
    private CalcStringParser calcStringParser;

    public Calculator(CalcStringParser calcStringParser) {
        this.calcStringParser = calcStringParser;
    }

    public void calculate(String[] calcArgs) {
       final Operation operation = calcStringParser.parse(calcArgs);
       System.out.println("=" + operation.operate());
    }

}
