package BLL;

public class CalculatorManager {

    public double calculate(double leftValue, double rightValue, char operator){
        switch (operator) {
            case '+':
                return leftValue + rightValue;
            case '-':
                return leftValue - rightValue;
            case '*':
                return leftValue * rightValue;
            case '/':
                if (rightValue != 0) {
                    return(double) leftValue / rightValue;
                } else {
                    // Hvad så her?
                }
                break;
            case '^':
                return Math.pow(leftValue, rightValue);
            default:
                break;

            case '√':
                return Math.sqrt(leftValue);
        }
        return 0;
    }
}
