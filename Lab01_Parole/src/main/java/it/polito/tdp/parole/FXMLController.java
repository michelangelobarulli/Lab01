package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.ParoleArrayList;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	ParoleArrayList elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;
    
    @FXML
    private Button btnCancella;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private TextArea txtTime;

    @FXML
    void doInsert(ActionEvent event) {
    	long inizio = System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	txtResult.clear();
    	txtParola.clear();
    	for(String s: elenco.getElenco()) {
    		txtResult.appendText(s+" ");
    	}
    	long fine = System.nanoTime();
    	txtTime.setText(Long.toString((fine-inizio)/1000)+" microsecondi");
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	long inizio = System.nanoTime();
    	elenco.reset();
    	txtResult.clear();
    	txtParola.clear();
    	long fine = System.nanoTime();
    	txtTime.setText(Long.toString((fine-inizio)/1000)+" microsecondi");
    }
    @FXML
    void doCancella(ActionEvent event) {
    	long inizio = System.nanoTime();
    	elenco.CancellaParola(txtResult.getSelectedText());
    	txtResult.clear();
    	for(String s: elenco.getElenco()) {
    		txtResult.appendText(s+" ");
    	}
    	long fine = System.nanoTime();
    	txtTime.setText(Long.toString((fine-inizio)/1000)+" microsecondi");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new ParoleArrayList() ;
    }
}
