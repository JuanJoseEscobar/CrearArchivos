/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionararchivos;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Estudiante;

/**
 *
 * @author juan_jose.escobar
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField Nombrefl;
    @FXML
    private TextField telefonofl;
    @FXML
    private TextField correofl;
    @FXML
    private TextField codigofl;
    @FXML
    private TextField carrerafl;
    
    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    
    
    @FXML
    private Button buttonAE;
    @FXML
    private Button buttonGA;
    
    
    
    
    LinkedList<Estudiante> ListaE;
    
    @FXML
    private void CrearE(ActionEvent event) {
        String nombre = Nombrefl.getText();
        String telefono = telefonofl.getText();
        String correo = correofl.getText();
        String codigo = codigofl.getText();
        String carrera = carrerafl.getText();
        
        Estudiante objEstudiante = new Estudiante(codigo, carrera, nombre, telefono, correo);
        ListaE.add(objEstudiante);
    }
     @FXML
     private void GuardarXML(ActionEvent event){
        Estudiante objeV = new Estudiante();
        boolean guardar = objeV.creacionArchivoXML(ListaE);
        
        
        
    }
             
             
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        ListaE = new LinkedList<>();
    }    
    
}
