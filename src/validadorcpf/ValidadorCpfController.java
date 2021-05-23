/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcpf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
public class ValidadorCpfController {
    @FXML private Text qualstatus;
    @FXML private Text estadocpf;
    @FXML private Text textocpf;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        String cpftexto;
        int comprcpf;
        long numcpf;
        long numaux;
        long numacum = 0;
        cpftexto = textocpf.toString();
        comprcpf = cpftexto.length();
        numcpf = Long.parseLong(cpftexto);
        do {
            numaux = numcpf % 10;
            numacum = numacum + numaux;
            numcpf = (numcpf - numaux)/10;
            comprcpf--;
        } while (comprcpf != 0);
        if (numacum % 11 ==0)
            qualstatus.setText("O CPF pode ser válido!");
        else
            qualstatus.setText("O CPF não é válido!");
        estadocpf.setText("Não sei ainda o Estado!");
    }

}

