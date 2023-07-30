package Calculator.Operation;

public class SumOperation extends ArithmeticOperation implements Operation {


    public SumOperation(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        return num1 + num2;
    }
}
