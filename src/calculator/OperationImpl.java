package calculator;

public class OperationImpl implements Operation{


    @Override
    public double addition(double firstNum, double secondNum) {
        return Operation.super.addition(firstNum, secondNum);
    }

    @Override
    public double division(double firstNum, double secondNum) {
        return Operation.super.division(firstNum, secondNum);
    }

    @Override
    public double subtraction(double firstNum, double secondNum) {
        return Operation.super.subtraction(firstNum, secondNum);
    }

    @Override
    public double multiplication(double firstNum, double secondNum) {
        return Operation.super.multiplication(firstNum, secondNum);
    }
}
