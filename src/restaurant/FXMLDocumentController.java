/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

/**
 *
 * @author 16473
 */
public class FXMLDocumentController implements Initializable { 
    
      @FXML
    private TextField resNameTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private ComboBox<String> cityComboBox;

    @FXML
    private TextField phoneTextField;

    @FXML
    private DatePicker startDate;

    @FXML
    private RadioButton burgerRadioButton;

    @FXML
    private RadioButton pizzaRadioButton;

    @FXML
    private RadioButton burritoRadioButton;

    @FXML
    private RadioButton subRadioButton;
    
    private ToggleGroup setResType ;

    @FXML
    private CheckBox uberEatsCheckBox;

    @FXML
    private CheckBox skipTheDishesCheckBox;

    @FXML
    private ImageView photo;

    @FXML
    private Button saveButton;

    @FXML
    private Label errMsg;

    @FXML
    void radioBtnChanged(ActionEvent event) {

    }

    @FXML
    void saveButtonPressed(ActionEvent event) {

    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        /**
         * this code makes the error message label disappear until error is triggered
         */
        errMsg.setText("");
        
        
        /**
         * this code configure the combo box and populate it with barrie , Toronto and Orillia .
         */
        cityComboBox.getItems().addAll("Barrie" , "Toronto" , "Orillia");
        cityComboBox.setValue("Barrie");
        
        /**
         * this code setup the radio button and introduce the toggle group
         */
        setResType = new ToggleGroup() ;
        this.burgerRadioButton.setToggleGroup(setResType);
        this.burgerRadioButton.setToggleGroup(setResType);
        this.pizzaRadioButton.setToggleGroup(setResType);
        this.subRadioButton.setToggleGroup(setResType);
        
    }     
    
    
    
}
