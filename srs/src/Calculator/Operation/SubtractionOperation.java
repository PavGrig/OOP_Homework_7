package Calculator.Operation;

public class SubtractionOperation extends ArithmeticOperation implements Operation {

    public SubtractionOperation(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        return num1 - num2;
    }
}
