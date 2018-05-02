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
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04999521202
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField txtNome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fechar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aula");
        EntityManager em = emf.createEntityManager();      
                
                
                
    
                
    }

    @FXML
    private void salvar(ActionEvent event) {
    }
    
}
