/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorcontroller;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class MainClassController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private SplitPane pane2;

    @FXML
    private ImageView IV2;

    @FXML
    private SplitPane pane1;

    @FXML
    private ImageView IV1;

    @FXML
    private SplitPane pane0;

    @FXML
    private ImageView IV0;

    @FXML
    private Button open2;

    @FXML
    private Button close2;

    @FXML
    private Button f02;

    @FXML
    private Button f12;

    @FXML
    private Button f22;

    @FXML
    private Button open1;

    @FXML
    private Button close1;

    @FXML
    private Button f01;

    @FXML
    private Button f11;

    @FXML
    private Button f21;

    @FXML
    private Button open0;

    @FXML
    private Button close0;

    @FXML
    private Button f00;

    @FXML
    private Button f10;

    @FXML
    private Button f20;
    
    @FXML
    private TextField tb2;

    @FXML
    private TextField tb1;

    @FXML
    private TextField tb0;

    String IC;
    FiniteAutomata FA = new FiniteAutomata();

    Image img = new Image("/view/Images/close.jpg");
    Image img1 = new Image("/view/Images/open.jpg");
    int CS = 0;

    @FXML
    void CLOSE0(ActionEvent event) {
        CS = FA.transition(CS, "00");
        if (CS == 0) {
            tb0.setText("");
            IV0.setImage(img);
        }
    }

    @FXML
    void CLOSE1(ActionEvent event) {
        CS = FA.transition(CS, "10");
        if (CS == 2) {
            tb1.setText("");
            IV1.setImage(img);
        }
    }

    @FXML
    void CLOSE2(ActionEvent event) {
        CS = FA.transition(CS, "20");
        if (CS == 4) {
            tb2.setText("");
            IV2.setImage(img);
        }
    }

    @FXML
    void F00(ActionEvent event) {
        CS = FA.transition(CS, "01");
        if (CS == 1) {
            f00.setVisible(true);
            f10.setVisible(true);
            f20.setVisible(true);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb0.setText("DOOR OPEN");
            IV0.setImage(img1);
        }
    }

    @FXML
    void F01(ActionEvent event) {
        CS = FA.transition(CS, "01");
        if (CS == 1) {
            f00.setVisible(true);
            f10.setVisible(true);
            f20.setVisible(true);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb1.setText("");
            tb0.setText("DOOR OPEN");
            IV0.setImage(img1);
        }
    }

    @FXML
    void F02(ActionEvent event) {
        CS = FA.transition(CS, "01");
        if (CS == 1) {
            f00.setVisible(true);
            f10.setVisible(true);
            f20.setVisible(true);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb2.setText("");
            tb0.setText("DOOR OPEN");
            IV0.setImage(img1);
        }
    }

    @FXML
    void F10(ActionEvent event) {
        CS = FA.transition(CS, "11");
        if (CS == 3) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(true);
            f11.setVisible(true);
            f21.setVisible(true);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb0.setText("");
            tb1.setText("DOOR OPEN");
            IV1.setImage(img1);
        }
    }

    @FXML
    void F11(ActionEvent event) {
        CS = FA.transition(CS, "11");
        if (CS == 3) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(true);
            f11.setVisible(true);
            f21.setVisible(true);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb1.setText("DOOR OPEN");
            IV1.setImage(img1);
        }
    }

    @FXML
    void F12(ActionEvent event) {
        CS = FA.transition(CS, "11");
        if (CS == 3) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(true);
            f11.setVisible(true);
            f21.setVisible(true);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb2.setText("");
            tb1.setText("DOOR OPEN");
            IV1.setImage(img1);
        }
    }

    @FXML
    void F20(ActionEvent event) {
        CS = FA.transition(CS, "21");
        if (CS == 5) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(true);
            f12.setVisible(true);
            f22.setVisible(true);
            tb0.setText("");
            tb2.setText("DOOR OPEN");
            IV2.setImage(img1);
        }
    }

    @FXML
    void F21(ActionEvent event) {
        CS = FA.transition(CS, "21");
        if (CS == 5) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(true);
            f12.setVisible(true);
            f22.setVisible(true);
            tb1.setText("");
            tb2.setText("DOOR OPEN");
            IV2.setImage(img1);
        }
    }

    @FXML
    void F22(ActionEvent event) {
        CS = FA.transition(CS, "21");
        if (CS == 5) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(true);
            f12.setVisible(true);
            f22.setVisible(true);
            tb2.setText("DOOR OPEN");
            IV2.setImage(img1);
        }
    }

    @FXML
    void OPEN0(ActionEvent event) {
        CS = FA.transition(CS, "01");
        if (CS == 1) {
            f00.setVisible(true);
            f10.setVisible(true);
            f20.setVisible(true);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb0.setText("DOOR OPEN");
            IV0.setImage(img1);
        }
    }

    @FXML
    void OPEN1(ActionEvent event) {
        CS = FA.transition(CS, "11");
        if (CS == 3) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(true);
            f11.setVisible(true);
            f21.setVisible(true);
            f02.setVisible(false);
            f12.setVisible(false);
            f22.setVisible(false);
            tb1.setText("DOOR OPEN");
            IV1.setImage(img1);
        }
    }

    @FXML
    void OPEN2(ActionEvent event) {
        CS = FA.transition(CS, "21");
        if (CS == 5) {
            f00.setVisible(false);
            f10.setVisible(false);
            f20.setVisible(false);
            f01.setVisible(false);
            f11.setVisible(false);
            f21.setVisible(false);
            f02.setVisible(true);
            f12.setVisible(true);
            f22.setVisible(true);
            tb2.setText("DOOR OPEN");
            IV2.setImage(img1);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        f00.setVisible(false);
        f10.setVisible(false);
        f20.setVisible(false);
        f01.setVisible(false);
        f11.setVisible(false);
        f21.setVisible(false);
        f02.setVisible(false);
        f12.setVisible(false);
        f22.setVisible(false);
    }
}
