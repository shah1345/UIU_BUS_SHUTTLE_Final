package com.laynezcoder.controller;



import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class MainPcontroler implements Initializable {

    private String USER_Name= "";
    private String USER_ID= "";
    boolean sitBook=false;
    String CurrentSit="";


    private boolean isRunning = false;
    private boolean isBreak = false;
    private Timer timer = new Timer();
    private int counter = 60 * 5;
    boolean Confbtn=false;

    ObservableList<String> Booked_list = FXCollections.observableArrayList("MIM 011201444", "Anika Tabassum 011201412", "Roktim 011201474", "SHAH NEWAZ AZIZ 011201437");



    @FXML
    private WebEngine engine;


    @FXML
    private Button a0;

    @FXML
    private Button a1;

    @FXML
    private Button a2;

    @FXML
    private Button a3;

    @FXML
    private Button a4;

    @FXML
    private Button a5;

    @FXML
    private Button a6;

    @FXML
    private Button a7;

    @FXML
    private Button b0;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button c0;

    @FXML
    private Button c1;

    @FXML
    private Button c2;

    @FXML
    private Button c3;

    @FXML
    private Button c4;

    @FXML
    private Button c5;

    @FXML
    private Button c6;

    @FXML
    private Button c7;

    @FXML
    private Button d0;

    @FXML
    private Button d1;

    @FXML
    private Button d2;

    @FXML
    private Button d3;

    @FXML
    private Button d4;

    @FXML
    private Button d5;

    @FXML
    private Button d6;

    @FXML
    private Button d7;
    @FXML
    private Button e0;


    // msg start
    @FXML
    Button button;
    @FXML
    TextArea showArea;

    @FXML
    private ListView listview;

    @FXML
    private Text timeCounter;


    @FXML
    Text studentshow;

    @FXML
    private Button Confirmedbtn;




    @FXML
    private ImageView img;
    //img.setStyle("-fx-background-image:url('bgimg.jpg')");



    @FXML
    private ComboBox location;


    @FXML // fx:id="buslocationweb"
    private WebView webviewbus;; // Value injected by FXMLLoader


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        engine = webviewbus.getEngine();
        engine.load("https://www.google.com/maps/place/23%C2%B047'50.2%22N+90%C2%B027'00.6%22E/@23.7972742,90.4496248,19z/data=!3m1!4b1!4m6!3m5!1s0x0:0x93d97e78b3df502!7e2!8m2!3d23.797273!4d90.4501719?hl=en");

        ObservableList<String> cityCorp = FXCollections.observableArrayList("UIU Campus", "Natun Bazar", "Sayd Nogor");


        location.setItems(cityCorp);
        listview.setItems(Booked_list);

        // studentshow.setText("Shah Newaz Aziz  011201437");



        String location= "src/com/laynezcoder/TinyDatabase/current.txt";
        String location2= "src/com/laynezcoder/TinyDatabase/SitBook.txt";
        try {
            File myObj = new File(location);
            File myObj2 = new File(location2);
            Scanner myReader = new Scanner(myObj);
            Scanner myReader2 = new Scanner(myObj2);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String Part[] = data.split("_");
                USER_Name=Part[2];
                USER_ID=Part[0];

                studentshow.setText(Part[2]+"  "+ Part[0]);

            }

            while (myReader2.hasNextLine()) {
                String data = myReader2.nextLine();
                data.trim();
                System.out.println(data);
                a0.setStyle("-fx-background-color: #ff0000; ");
                if(data.equals("a0")) {
                    a0.setStyle("-fx-background-color: #ff0000; ");

                }else if(data.equals("b0")){

                    b0.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c0")){

                    c0.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d0")){

                    d0.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("a1")){

                    a1.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("b1")){

                    b1.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c1")){

                    c1.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d1")){

                    d1.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("a2")){

                    a2.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("b2")){

                    b2.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c2")){

                    c2.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d2")){

                    d2.setStyle("-fx-background-color: #ff0000; ");
                }

                else if(data.equals("a3")){

                    a3.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("b3")){

                    b3.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c3")){

                    c3.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d3")){

                    d3.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("a4")){

                    a4.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("b4")){

                    b4.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c4")){

                    c4.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d4")){

                    d4.setStyle("-fx-background-color: #ff0000; ");
                }

                else if(data.equals("a5")){

                    a5.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("b5")){

                    b5.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c5")){

                    c5.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d5")){

                    d5.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("a6")){

                    a6.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("b6")){

                    b6.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c6")){

                    c6.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d6")){

                    d6.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("a7")){

                    a7.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("b7")){

                    b7.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("c7")){

                    c7.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("d7")){

                    d7.setStyle("-fx-background-color: #ff0000; ");
                }
                else if(data.equals("e0")){

                    e0.setStyle("-fx-background-color: #ff0000; ");
                }




            }


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        ClintCon();
        //System.out.println(studentshow.getText());


    }

    @FXML
    void Locklist(ActionEvent event) {

        if(location.getValue().equals("UIU Campus")) {
            engine.load("https://www.google.com/maps/place/23%C2%B047'50.2%22N+90%C2%B027'00.6%22E/@23.7972742,90.4496248,19z/data=!3m1!4b1!4m6!3m5!1s0x0:0x93d97e78b3df502!7e2!8m2!3d23.797273!4d90.4501719?hl=en");

        } else if(location.getValue().equals("Natun Bazar")){


            engine.load("https://www.google.com.bd/maps/place/23%C2%B047'52.1%22N+90%C2%B025'27.0%22E/@23.7978002,90.4236178,19z/data=!3m1!4b1!4m14!1m7!3m6!1s0x3755c7ba919c9e8f:0x74c8c1dc2d04bd18!2z4Kao4Kak4KeB4KaoIOCmrOCmvuCmnOCmvuCmsCDgpqvgp4Hgpp_gppPgpq3gpr7gprAg4Kas4KeN4Kaw4Ka_4KacLCDgpqLgpr7gppXgpr4gMTIxMg!3b1!8m2!3d23.7973082!4d90.4235963!3m5!1s0x0:0x7639390b5219eed0!7e2!8m2!3d23.7977988!4d90.4241647");

        } else if(location.getValue().equals("Sayd Nogor")){

            engine.load("https://www.google.com.bd/maps/place/23%C2%B047'55.2%22N+90%C2%B026'05.9%22E/@23.798774,90.4354431,19z/data=!4m15!1m8!3m7!1s0x0:0x7639390b5219eed0!2zMjPCsDQ3JzUyLjEiTiA5MMKwMjUnMjcuMCJF!3b1!7e2!8m2!3d23.7977988!4d90.4241647!3m5!1s0x0:0x6204ebc13a8386b9!7e2!8m2!3d23.7986552!4d90.4349713");


        }


    }

    void AlertDialog(String msg){


        // Show a Information Alert with header Text

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("WARNING!!!");
        alert.setHeaderText("Multipal Sit Selection!");
        alert.setContentText(msg);

        alert.showAndWait();
        System.out.println(msg);

    }




    public void A0(ActionEvent actionEvent) {

        if(a0.getStyle().equals("-fx-background-color: #ff0000; ")){
            a0.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                a0.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a0";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }

    }
    public void B0(ActionEvent actionEvent) {

        if(b0.getStyle().equals("-fx-background-color: #ff0000; ")){
            b0.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                b0.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b0";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }




    }
    public void C0(ActionEvent actionEvent) {
        if(c0.getStyle().equals("-fx-background-color: #ff0000; ")){
            c0.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                c0.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c0";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void D0(ActionEvent actionEvent) {
        if(d0.getStyle().equals("-fx-background-color: #ff0000; ")){
            d0.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                d0.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d0";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }





    public void A1(ActionEvent actionEvent) {

        if(a1.getStyle().equals("-fx-background-color: #ff0000; ")){
            a1.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                a1.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a1";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void B1(ActionEvent actionEvent) {

        if(b1.getStyle().equals("-fx-background-color: #ff0000; ")){
            b1.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                b1.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b1";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void C1(ActionEvent actionEvent) {


        if(c1.getStyle().equals("-fx-background-color: #ff0000; ")){
            c1.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                c1.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c1";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }


    }
    public void D1(ActionEvent actionEvent) {
        if(d1.getStyle().equals("-fx-background-color: #ff0000; ")){
            d1.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                d1.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d1";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }


    public void A2(ActionEvent actionEvent) {
        if(a2.getStyle().equals("-fx-background-color: #ff0000; ")){
            a2.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                a2.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a1";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void B2(ActionEvent actionEvent) {
        if(b2.getStyle().equals("-fx-background-color: #ff0000; ")){
            b2.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                b2.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b2";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void C2(ActionEvent actionEvent) {
        if(c2.getStyle().equals("-fx-background-color: #ff0000; ")){
            c2.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                c2.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c2";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void D2(ActionEvent actionEvent) {
        if(d2.getStyle().equals("-fx-background-color: #ff0000; ")){
            d2.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                d2.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d2";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }



    public void A3(ActionEvent actionEvent) {
        if(a3.getStyle().equals("-fx-background-color: #ff0000; ")){
            a3.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                a3.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a3";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void B3(ActionEvent actionEvent) {
        if(b3.getStyle().equals("-fx-background-color: #ff0000; ")){
            b3.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                b3.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b3";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void C3(ActionEvent actionEvent) {
        if(c3.getStyle().equals("-fx-background-color: #ff0000; ")){
            c3.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                c3.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c3";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void D3(ActionEvent actionEvent) {
        if(d3.getStyle().equals("-fx-background-color: #ff0000; ")){
            d3.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                d3.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d3";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }

    public void A4(ActionEvent actionEvent) {
        if(a4.getStyle().equals("-fx-background-color: #ff0000; ")){
            a4.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                a4.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a4";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void B4(ActionEvent actionEvent) {
        if(b4.getStyle().equals("-fx-background-color: #ff0000; ")){
            b4.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                b4.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b4";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void C4(ActionEvent actionEvent) {
        if(c4.getStyle().equals("-fx-background-color: #ff0000; ")){
            c4.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                c4.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c4";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void D4(ActionEvent actionEvent) {
        if(d4.getStyle().equals("-fx-background-color: #ff0000; ")){
            d4.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook=false;
            CurrentSit="";
        } else {
            if(!sitBook) {
                d4.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d4";
            } else{
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }


    public void A5(ActionEvent actionEvent) {
        if (a5.getStyle().equals("-fx-background-color: #ff0000; ")) {
            a5.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                a5.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a5";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void B5(ActionEvent actionEvent) {
        if (b5.getStyle().equals("-fx-background-color: #ff0000; ")) {
            b5.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                b5.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b5";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void C5(ActionEvent actionEvent) {
        if (c5.getStyle().equals("-fx-background-color: #ff0000; ")) {
            c5.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                c5.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c5";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void D5(ActionEvent actionEvent) {
        if (d5.getStyle().equals("-fx-background-color: #ff0000; ")) {
            d5.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                d5.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d5";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }

    public void A6(ActionEvent actionEvent) {
        if (a6.getStyle().equals("-fx-background-color: #ff0000; ")) {
            a6.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                a6.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a6";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void B6(ActionEvent actionEvent) {
        if (b6.getStyle().equals("-fx-background-color: #ff0000; ")) {
            b6.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                b6.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b6";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void C6(ActionEvent actionEvent) {
        if (c6.getStyle().equals("-fx-background-color: #ff0000; ")) {
            c6.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                c6.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c6";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void D6(ActionEvent actionEvent) {
        if (d6.getStyle().equals("-fx-background-color: #ff0000; ")) {
            d6.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                d6.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d6";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }


    public void A7(ActionEvent actionEvent) {
        if (a7.getStyle().equals("-fx-background-color: #ff0000; ")) {
            a7.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                a7.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="a7";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void B7(ActionEvent actionEvent) {
        if (b7.getStyle().equals("-fx-background-color: #ff0000; ")) {
            b7.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                b7.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="b7";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void C7(ActionEvent actionEvent) {
        if (c7.getStyle().equals("-fx-background-color: #ff0000; ")) {
            c7.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";
        } else {
            if (!sitBook) {
                c7.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="c7";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void D7(ActionEvent actionEvent) {
        if (d7.getStyle().equals("-fx-background-color: #ff0000; ")) {
            d7.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";

        } else {
            if (!sitBook) {
                d7.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="d7";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void E0(ActionEvent actionEvent) {
        if (e0.getStyle().equals("-fx-background-color: #ff0000; ")) {
            e0.setStyle("-fx-background-color: #ffe6e6; ");
            sitBook = false;
            CurrentSit="";

        } else {
            if (!sitBook) {
                e0.setStyle("-fx-background-color: #ff0000; ");
                sitBook = true;
                CurrentSit="e0";
            } else {
                AlertDialog("You Can't Select Multiple Sit");
            }
        }
    }
    public void Conbtn(ActionEvent actionEvent) {
if(!Confbtn){
        Counter();

    Booked_list.add(USER_Name + "  " + USER_ID);

    listview.setItems(Booked_list);
        if(Confirmedbtn.getStyle().equals("-fx-background-color: #ff0000; ")){
            Confirmedbtn.setStyle("-fx-background-color: #ffe6e6; ");
        } else {
            Confirmedbtn.setStyle("-fx-background-color: #ff0000; ");
            Confbtn = true;

        }
        }
    }





    @FXML
    TextField inputField;
    boolean isConnected = false;
    BufferedReader reader;
    BufferedWriter writer;


    @FXML
    void connectionButton(){
       // ClintCon();

        if(!isConnected) {
            // Client is not connected with the server, lets connect with server
            String inputName = USER_Name; //inputField.getText();
          //  inputField.clear();

            if(inputName == null || inputName.length() == 0){
                showArea.appendText("Enter a valid name!\n");
                return;
            }
            try {
                Socket sc = new Socket("localhost", 6601);

                OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
                writer = new BufferedWriter(o);

                writer.write(inputName+"\n");
                writer.flush();

                InputStreamReader isr = new InputStreamReader(sc.getInputStream());
                reader = new BufferedReader(isr);


                Thread serverListener = new Thread(){
                    @Override
                    public void run() {
                        while(true){
                            try {
                                String data = reader.readLine() + "\n";
                                showArea.appendText(data);
                            }
                            catch (SocketException e){
                                showArea.appendText("Connection lost!\n");
                                break;
                            }
                            catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                };
                serverListener.start();

                showArea.appendText("Connection established!\n");
                button.setText("Send");
                inputField.setPromptText("Write your message.");
                isConnected = true;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         else{
        try {
            String msg = inputField.getText();
            inputField.clear();

            if (msg == null || msg.length() == 0) {
                return;
            }

            writer.write(msg + "\n");
            writer.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
      }


    void ClintCon(){
        if(!isConnected) {
            // Client is not connected with the server, lets connect with server
            String inputName = USER_Name; //inputField.getText();
            //  inputField.clear();

            if(inputName == null || inputName.length() == 0){
                showArea.appendText("Enter a valid name!\n");
                return;
            }
            try {
                Socket sc = new Socket("localhost", 6601);

                OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
                writer = new BufferedWriter(o);

                writer.write(inputName+"\n");
                writer.flush();

                InputStreamReader isr = new InputStreamReader(sc.getInputStream());
                reader = new BufferedReader(isr);


                Thread serverListener = new Thread(){
                    @Override
                    public void run() {
                        while(true){
                            try {
                                String data = reader.readLine() + "\n";
                                showArea.appendText(data);
                            }
                            catch (SocketException e){
                                showArea.appendText("Connection lost!\n");
                                break;
                            }
                            catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                };
                serverListener.start();

                //  showArea.appendText("Connection established!\n");
                button.setText("Send");
                inputField.setPromptText("Write your message.");
                isConnected = true;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }


    void Counter(){

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    counter--;

                    NumberFormat f = new DecimalFormat("00");

                    long min = (counter / 60) % 60;
                    long sec = (counter ) % 60;

                    timeCounter.setText(String.format("%s:%s",f.format(min), f.format(sec)));
                    if(counter==0) {
                        timer.cancel();
                        Booked_list.remove(Booked_list.size()-1);
                        listview.setItems(Booked_list);
                    }

                });
            }
        }, 0, 1000);
    }





    }



