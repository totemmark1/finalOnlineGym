package controller;
import javafx.animation.FadeTransition;

import java.net.URL;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import java.util.ResourceBundle;
public class CoursesPanelController implements Initializable{
    // components for main frame
    private FadeTransition fadeOutTrans;
    private FadeTransition fadeInTrans;
    @FXML
    private ImageView imageview_cate_strength, imageview_cate_hiit, imageview_cate_pilates, imageview_cate_yoga, imageview_cate_streching, imageview_cate_aero;
    @FXML
    private Button btn_cate_strength, btn_cate_hiit, btn_cate_pilates, btn_cate_yoga, btn_cate_streching, btn_cate_aero;
    @FXML
    private ImageView currentImageView;
    @FXML
    private AnchorPane pane_cate, pane_playback, pane_search;

    private AnchorPane current_pane;

    @FXML
    private Button btn_on_cate_pane_show_playback_pane, btn_on_cate_pane_show_search_pane;

    @FXML
    private Button btn_on_playback_pane_show_search_pane, btn_on_playback_pane_show_cate_pane;
    @FXML
    private Button btn_on_search_pane_show_playback_pane, btn_on_search_pane_show_cate_pane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        current_pane = pane_cate;
        pane_cate.setVisible(true);
        pane_playback.setVisible(false);
        pane_search.setVisible(false);
        initCatePanel();
        setTrans();
    }

    // initialize the transition class
    private void setTrans(){
        fadeOutTrans = new FadeTransition(Duration.millis(300));
        fadeInTrans = new FadeTransition(Duration.millis(300));

        fadeOutTrans.setFromValue(1.0);   // 设置起始透明度为1.0，表示不透明
        fadeOutTrans.setToValue(0.0);     // 设置结束透明度为0.0，表示透明
        fadeOutTrans.setCycleCount(1);     // 设置循环周期为无限
        fadeOutTrans.setAutoReverse(false);    // 设置自动反转
        fadeInTrans.setFromValue(0.0);   // 设置起始透明度为1.0，表示不透明
        fadeInTrans.setToValue(1.0);     // 设置结束透明度为0.0，表示透明
        fadeInTrans.setCycleCount(1);     // 设置循环周期为无限
        fadeInTrans.setAutoReverse(false);    // 设置自动反转
    }


    //initialize the category panel
    private void initCatePanel(){
        imageview_cate_strength.setVisible(true);
        imageview_cate_streching.setVisible(false);
        imageview_cate_pilates.setVisible(false);
        imageview_cate_aero.setVisible(false);
        imageview_cate_hiit.setVisible(false);
        imageview_cate_yoga.setVisible(false);


        currentImageView = imageview_cate_strength;

    }

    @FXML
    private void onHoverCatePics(MouseEvent event) {
        if(currentImageView != imageview_cate_strength) {
            fadeOutTrans.setNode(currentImageView);
            fadeOutTrans.play();
            currentImageView = imageview_cate_strength;
        }
        if(event.getSource() == btn_cate_aero){
            currentImageView = imageview_cate_aero;
        }

        if(event.getSource() == btn_cate_hiit){
            currentImageView = imageview_cate_hiit;
        }

        if(event.getSource() == btn_cate_pilates){
            currentImageView = imageview_cate_pilates;
        }

        if(event.getSource() == btn_cate_streching){
            currentImageView = imageview_cate_streching;
        }

        if(event.getSource() == btn_cate_yoga){
            currentImageView = imageview_cate_yoga;
        }

        if(currentImageView != imageview_cate_strength){
            currentImageView.setVisible(true);
            fadeInTrans.setNode(currentImageView);
            fadeInTrans.play();
        }
    }


    @FXML
    private void requestAllVideosOfCate(MouseEvent event) {
        if(currentImageView != imageview_cate_strength) {
            fadeOutTrans.setNode(currentImageView);
            fadeOutTrans.play();
            currentImageView = imageview_cate_strength;
        }
        if(event.getSource() == btn_cate_aero){
            currentImageView = imageview_cate_aero;
        }

        if(event.getSource() == btn_cate_hiit){
            currentImageView = imageview_cate_hiit;
        }

        if(event.getSource() == btn_cate_pilates){
            currentImageView = imageview_cate_pilates;
        }

        if(event.getSource() == btn_cate_streching){
            currentImageView = imageview_cate_streching;
        }

        if(event.getSource() == btn_cate_yoga){
            currentImageView = imageview_cate_yoga;
        }

        if(currentImageView != imageview_cate_strength){
            currentImageView.setVisible(true);
            fadeInTrans.setNode(currentImageView);
            fadeInTrans.play();
        }
    }

    @FXML
    private void switchPane(ActionEvent event) {
        AnchorPane dest_pane = null;
        if(event.getSource() == btn_on_cate_pane_show_playback_pane || event.getSource() == btn_on_search_pane_show_playback_pane){
            dest_pane = pane_playback;
        }

        if(event.getSource() == btn_on_playback_pane_show_cate_pane || event.getSource() == btn_on_search_pane_show_cate_pane){
            dest_pane = pane_cate;
        }

        if(event.getSource() == btn_on_cate_pane_show_search_pane || event.getSource() == btn_on_playback_pane_show_search_pane){
            dest_pane = pane_search;
        }


        fadeOutTrans.setNode(current_pane);
        fadeOutTrans.play();
        current_pane.setVisible(false);
        dest_pane.setVisible(true);
        fadeInTrans.setNode(dest_pane);
        fadeInTrans.play();
        current_pane = dest_pane;
    }
}
