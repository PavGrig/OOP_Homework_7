package Calculator.Operation;

public class DivisionOperation extends ArithmeticOperation implements Operation{
    public DivisionOperation(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        return num1 / num2;
    }
}
