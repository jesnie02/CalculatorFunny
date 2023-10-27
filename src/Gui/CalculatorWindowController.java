package Gui;

import BLL.CalculatorManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorWindowController {

    @FXML
    private TextField txtLeftField;


    @FXML
    private Label lblResult;

    private int operatorUseNumber;

    private CalculatorManager manager = new CalculatorManager();


    public void btnCalculate(ActionEvent actionEvent) {
        String expression = txtLeftField.getText();

        // Deler udtrykket i to dele ved hjælp af operatorerne +, -, *, % og ^
        String[] elements = expression.split("[\\+\\-\\*\\/\\^\\√]");

        char operator = expression.charAt(elements[0].length());
        if (operator == '√') {

            double Value = Double.parseDouble(elements[1]);
            double result = manager.calculate(Value, 0,'√');
            lblResult.setText("Resultat: " + result);
            return;
        }

        if (elements.length != 2) {
            lblResult.setText("Ugyldigt udtryk");
            return;
        }

        double leftValue = Double.parseDouble(elements[0]);
        double rightValue = Double.parseDouble(elements[1]);

        double result = manager.calculate(leftValue, rightValue, operator);
        lblResult.setText("Resultat: " + result);
    }

    public void btnTimes(ActionEvent actionEvent) {
        operatorUseNumber = 1;
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "*");

    }

    public void btnDivide(ActionEvent actionEvent) {
        operatorUseNumber = 2;
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "/");

    }

    public void btnPlus(ActionEvent actionEvent) {
        operatorUseNumber = 3;
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "+");

    }

    public void btnMinus(ActionEvent actionEvent) {
        operatorUseNumber = 4;
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "-");

    }

    public void btnsquare(ActionEvent actionEvent) {
        operatorUseNumber =5;
        String currentText = txtLeftField.getText();
        txtLeftField.setText("√"+currentText  );

    }

    public void btnPow(ActionEvent actionEvent){
        operatorUseNumber=6;
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "^");

    }

    public void btnOne(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "1");
    }

    public void btnTwo(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "2");
    }

    public void btnThree(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "3");
    }

    public void btnFour(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "4");
    }

    public void btnFive(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "5");
    }

    public void btnSix(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "6");
    }

    public void btnSeven(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "7");
    }

    public void btnEight(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "8");
    }

    public void btnNine(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "9");
    }

    public void btnZero(ActionEvent actionEvent){
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + "0");
    }


    public void btnComma(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText(currentText + ".");
    }

    public void btnPlusMinus(ActionEvent actionEvent) {
        String currentText = txtLeftField.getText();
        txtLeftField.setText("-" + currentText  );
    }

    public void btnErase(ActionEvent actionEvent) {

        txtLeftField.setText(""); // Clear the text in txtLeftField
        lblResult.setText("");   // Clear the text in lblResult
    }

    //deletes latest number
    public void btnDel(ActionEvent actionEvent) {

        String currentText = txtLeftField.getText();
        if(currentText.length() >0) {
            txtLeftField.setText(currentText.substring(0, currentText.length() - 1));
        }
    }
}