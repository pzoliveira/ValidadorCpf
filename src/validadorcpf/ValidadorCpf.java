/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcpf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pzapata
 */
public class ValidadorCpf extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("validador_cpf.fxml"));
        
        Scene scene = new Scene(root, 325, 275);
        
        stage.setTitle("Validador de CPF");
        
        stage.setScene(scene);
        stage.show();
    }
}