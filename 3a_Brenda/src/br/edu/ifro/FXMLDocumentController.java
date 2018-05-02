/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 04999521202
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtnum1, txtnum2, txtResult;
    
  
 
 
    @FXML
    private Button btnSoma;
    
    @FXML
    private void Soma(ActionEvent event){
       Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
         Double Resultado = num1 + num2;
       
         txtResult.setText(Resultado.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
