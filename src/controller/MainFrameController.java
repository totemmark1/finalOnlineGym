package controller;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import java.util.ResourceBundle;

public class MainFrameController implements Initializable {

    // components for root panel
    private FadeTransition switchPanelFadeOutTrans = new FadeTransition(Duration.millis(500));
    private FadeTransition switchPanelFadeInTrans = new FadeTransition(Duration.millis(500));


    @FXML
    private Pane current_pane;

    @FXML
    private AnchorPane anchorPaneMain;
    @FXML
    private Button btn_home, btn_courses, btn_live_sessions, btn_calendar, btn_my_account, btn_about, btn_exit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initPanel();
    }

    //initialize the main panel
    private void initPanel(){
        switchPanelFadeOutTrans.setFromValue(1.0);   // 设置起始透明度为1.0，表示不透明
        switchPanelFadeOutTrans.setToValue(0.0);     // 设置结束透明度为0.0，表示透明
        switchPanelFadeOutTrans.setCycleCount(1);     // 设置循环周期为无限
        switchPanelFadeOutTrans.setAutoReverse(false);    // 设置自动反转
        switchPanelFadeInTrans.setFromValue(0.0);   // 设置起始透明度为1.0，表示不透明
        switchPanelFadeInTrans.setToValue(1.0);     // 设置结束透明度为0.0，表示透明
        switchPanelFadeInTrans.setCycleCount(1);     // 设置循环周期为无限
        switchPanelFadeInTrans.setAutoReverse(false);    // 设置自动反转
        switchPanelFadeOutTrans.setNode(anchorPaneMain);
        switchPanelFadeInTrans.setNode(anchorPaneMain);

        try{
            current_pane = FXMLLoader.load(getClass().getResource("../fxml/HomePanel.fxml"));
        }catch (IOException e){
            e.printStackTrace();
        }
        anchorPaneMain.getChildren().add(current_pane);
    }

    @FXML
    private void switchPanel(ActionEvent event) {
        Pane dest_pane = current_pane;
        String name = "";
        if(event.getSource() == btn_home) name = "../fxml/HomePanel.fxml";

        if(event.getSource() == btn_courses) name = "../fxml/CoursesPanel.fxml";


        if(event.getSource() == btn_calendar) name = "../fxml/CalendarPanel.fxml";


        if(event.getSource() == btn_live_sessions) name = "../fxml/LiveSessionsPanel.fxml";


        if(event.getSource() == btn_about) name = "../fxml/AboutPanel.fxml";


        if(event.getSource() == btn_my_account) name = "../fxml/MyAccountPanel.fxml";

        try{
            dest_pane = FXMLLoader.load(getClass().getResource(name));
        }catch (IOException e){
            e.printStackTrace();
        }

        if(current_pane != dest_pane){
            switchPanelFadeOutTrans.play();
            anchorPaneMain.getChildren().remove(current_pane);
            switchPanelFadeInTrans.play();
            current_pane = dest_pane;
            anchorPaneMain.getChildren().add(current_pane);
            switchPanelFadeInTrans.play();
        }
    }



}
