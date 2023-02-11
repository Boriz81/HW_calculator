package calculator;

interface Operation {

    default double addition(double firstNum, double secondNum) {
         return firstNum + secondNum;
    }
    default double division(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }
    default double subtraction(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }
    default double multiplication(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }



}
