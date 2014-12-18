/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableviewornek;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author ecir
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private TextField txt_no;
    @FXML
    private TextField txt_adi;
    @FXML
    private TextField txt_soyadi;
    @FXML
    private TableView<Ogrenci> tablo;
    
    private final  ObservableList<Ogrenci> liste=FXCollections.observableArrayList(); 
    @FXML
    private TableColumn numara;
    @FXML
    private TableColumn adi;
    @FXML
    private TableColumn soyadi;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        numara.setCellValueFactory(new PropertyValueFactory<>("ogrno"));
        adi.setCellValueFactory(new PropertyValueFactory<>("ogradi"));
        soyadi.setCellValueFactory(new PropertyValueFactory<>("ogrsadi"));
        tablo.setItems(liste);
    }    

    @FXML
    private void kayitEkle(ActionEvent event) {
       liste.add(new Ogrenci(txt_no.getText(), txt_adi.getText(), txt_soyadi.getText()));

    }

    @FXML
    private void silmeIslemi(ActionEvent event) {
        tablo.getItems().remove(tablo.getSelectionModel().getSelectedIndex());
    }
    
}
