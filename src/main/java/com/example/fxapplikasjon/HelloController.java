package com.example.fxapplikasjon;

import com.example.fxapplikasjon.Repository.ordRepository;
import com.example.fxapplikasjon.model.runde;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {


@FXML
private TextField brukernavninput;
@FXML
private TextField gjettinput;

    ordRepository nyttord = new ordRepository();
    @FXML
    private void onGjettingclick(runde nyrunde, ordRepository nyttord){
    nyrunde.setPlayer(brukernavninput.getText());

    if(nyttord.gjetning(nyrunde.getOrd())){

    }
    }
}