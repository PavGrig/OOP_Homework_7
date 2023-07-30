package Calculator.Operation;

public class MultiOperation extends ArithmeticOperation implements Operation {
    public MultiOperation(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        return num1 * num2;
    }
}
