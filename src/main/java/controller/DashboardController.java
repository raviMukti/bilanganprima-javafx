package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DashboardController implements Initializable {

    int batasAtas;

    @FXML
    private AnchorPane paneAnchor;

    @FXML
    private TextField fieldAngkaBatasAtas;

    @FXML
    private Button btnKalkulasi;

    @FXML
    private TextArea textAreaHasil;

    @FXML
    void btnKalkulasiAction(ActionEvent event) {
        batasAtas = Integer.valueOf(fieldAngkaBatasAtas.getText());
        printPrime(batasAtas);
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

//    Method cek apakah bilangan prima atau bukan
    static boolean isPrime(int n){
//        cek bilangan bulat lebih dari 1 atau bukan?
        if (n <= 1){
            return false;
        }
//        kemudian cek dari 2 ke n-1 apakah habis dibagi dua
        for (int i=2; i< n; i++){
            if (n % i == 0){
                return false;
            }
        }
//        Jika bukan maka isPrime akan benar dan mengindikasikan angka itu bilangan prima
        return true;
    }

//    method untuk menampilkan nilai prima
    void printPrime(int n){
        StringBuilder fieldContent = new StringBuilder("");
        for (int j=2; j <= n; j++){
            if (isPrime(j)){
                fieldContent.append(j+" ,");
                textAreaHasil.setText(fieldContent.toString());
                System.out.println(fieldContent.toString());
            }
        }
    }
}
