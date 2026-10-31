package com.example.actividad1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraC {

    @FXML
    private TextField Numero1;

    @FXML
    private TextField Numero2;

    @FXML
    private ComboBox<String> Operacion;
    @FXML
    public void initialize() {

        Operacion.getItems().addAll(
                "Suma",
                "Resta",
                "Multiplicación",
                "División");
    }

    @FXML
    private Label Resultado;

    @FXML
    private Button boton;

    @FXML
    void onHelloButtonClick(ActionEvent event) {

        try {

            double num1 = Double.parseDouble(Numero1.getText());
            double num2 = Double.parseDouble(Numero2.getText());

            double resultado = 0;

            switch (Operacion.getValue()) {

                case "Suma":
                    resultado = num1 + num2;
                    break;

                case "Resta":
                    resultado = num1 - num2;
                    break;

                case "Multiplicación":
                    resultado = num1 * num2;
                    break;

                case "División":
                    if (num2 == 0) {
                        Resultado.setText("No se puede dividir entre 0");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
            }

            Resultado.setText("Resultado: " + resultado);
            Numero1.clear();
            Numero2.clear();

        } catch (NumberFormatException e) {
            Resultado.setText("Ingrese sólo números");

        } catch (NullPointerException e) {
            Resultado.setText("Seleccione una operación");

        }
    }

}



