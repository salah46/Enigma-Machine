/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essay2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author salah
 */
public class EditController implements Initializable {
ObservableList<String> value=FXCollections.observableArrayList("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25");
ObservableList<String> v=FXCollections.observableArrayList("UKW-B","UKW-C");
ObservableList<String> va=FXCollections.observableArrayList("1","2","3");
    
@FXML
    private AnchorPane editStage;
    @FXML
    private ComboBox<String> ref;
    @FXML
    private ComboBox<String> R3;
    @FXML
    private ComboBox<String> pr1;
    @FXML
    private ComboBox<String> R2;
    @FXML
    private ComboBox<String> pr2;
    @FXML
    private ComboBox<String> R1;
    @FXML
    private ComboBox<String> pr3;
@FXML
    private TextArea t1;
    String t11;
    String t22;
    String RRP;
    String MRP;
    String LRP;
    String ol;
    String om;
    String or;
    private Button cls;

   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ref.setItems(v);
        ref.setValue("UKW-B");
        pr3.setItems(value);
        pr3.setValue("0");
        pr2.setItems(value);
        pr2.setValue("0");
        pr1.setItems(value);
        pr1.setValue("0");
        R1.setItems(va);
        R1.setValue("1");
        R2.setItems(va);
        R2.setValue("2");
        R3.setItems(va);
        R3.setValue("3");
    }    
Stage stage;
    @FXML
    private void test(ActionEvent event) {
     t11 = ref.getValue();
     LRP=pr3.getValue();
     MRP=pr2.getValue();
     RRP=pr1.getValue();
     ol=R1.getValue();
     om=R2.getValue();
     or=R3.getValue();
     stage = (Stage)t1.getScene().getWindow();
    stage.close();
    }
String buttontext;
    @FXML
    private void close(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
    Parent root = loader.load();

        FXMLDocumentController controller = loader.getController();
     buttontext = ((Button)event.getSource()).getText();   
     t11=controller.refl;   
     LRP=Integer.toString(FXMLDocumentController.pot1);
     MRP=Integer.toString(FXMLDocumentController.pot2);
     RRP=Integer.toString(FXMLDocumentController.pot3);
     ol=String.valueOf(controller.r1);
     om=String.valueOf(controller.r2);
     or=String.valueOf(controller.r3);
       stage = (Stage)t1.getScene().getWindow();
    stage.close();  
    }

   
    
}
