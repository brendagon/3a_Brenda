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
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 *
 * @author 04999521202
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtnum1, txtnum2, txtResult;
    
  
 
 
    @FXML
    private Label label;
    @FXML
    private Label lblnum2;
    @FXML
    private Label lblResult;
    @FXML
    private Label lblnum;
    @FXML
    private Button btnsoma;
    
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

    @FXML
    private void abrirCadastro(ActionEvent event) {
        try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Cliente");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
}
