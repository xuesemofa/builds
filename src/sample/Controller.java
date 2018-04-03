package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import static javafx.scene.input.MouseButton.SECONDARY;


public class Controller {

    @FXML
    private VBox jzy;

    @FXML
    private Button cj_button;

    @FXML
    private Button zj_button;

    @FXML
    private Button gj_button;

    @FXML
    private Pane huabu;

    private String names;

    private Button button;

    @FXML
    public void cj(ActionEvent event) {
        cj_button.setStyle("-fx-background-color:red;");
        zj_button.setStyle("-fx-background-color:white;");
        gj_button.setStyle("-fx-background-color:white;");
//        清理按钮
        jzy.getChildren().clear();
//        生成新的按钮
        Button button1 = new Button("初级1");
        button1.setPrefHeight(75.0);
        button1.setPrefWidth(176.0);
        button1.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        Button button2 = new Button("初级2");
        button2.setPrefHeight(75.0);
        button2.setPrefWidth(176.0);
        button2.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        Button button3 = new Button("初级3");
        button3.setPrefHeight(75.0);
        button3.setPrefWidth(176.0);
        button3.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        jzy.getChildren().addAll(button1, button2, button3);
    }

    @FXML
    public void zj(ActionEvent event) {
        cj_button.setStyle("-fx-background-color:white;");
        zj_button.setStyle("-fx-background-color:red;");
        gj_button.setStyle("-fx-background-color:white;");
//        清理按钮
        jzy.getChildren().clear();
        //        生成新的按钮
        Button button1 = new Button("中级1");
        button1.setPrefHeight(75.0);
        button1.setPrefWidth(176.0);
        button1.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        Button button2 = new Button("中级2");
        button2.setPrefHeight(75.0);
        button2.setPrefWidth(176.0);
        button2.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        Button button3 = new Button("中级3");
        button3.setPrefHeight(75.0);
        button3.setPrefWidth(176.0);
        button3.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        jzy.getChildren().addAll(button1, button2, button3);
    }

    @FXML
    public void gj(ActionEvent event) {
        cj_button.setStyle("-fx-background-color:white;");
        zj_button.setStyle("-fx-background-color:white;");
        gj_button.setStyle("-fx-background-color:red;");
//        清理按钮
        jzy.getChildren().clear();
        //        生成新的按钮
        Button button1 = new Button("高级1");
        button1.setPrefHeight(75.0);
        button1.setPrefWidth(176.0);
        button1.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        Button button2 = new Button("高级2");
        button2.setPrefHeight(75.0);
        button2.setPrefWidth(176.0);
        button2.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        Button button3 = new Button("高级3");
        button3.setPrefHeight(75.0);
        button3.setPrefWidth(176.0);
        button3.setOnMouseClicked((MouseEvent e) -> {
            jzwp(e);
        });
        jzy.getChildren().addAll(button1, button2, button3);
    }

    @FXML
    public void shubiaoweizhi(MouseEvent event) {
        huabu.getChildren().remove(button);
        if (names != null) {
            button = new Button();
            button.setStyle("-fx-background-color:green;");
            button.setPrefWidth(100);
            button.setPrefHeight(100);
            button.setStyle("-fx-margin:5px;");
            button.setLayoutX(event.getX());
            button.setLayoutY(event.getY());
            button.setOnMouseClicked((MouseEvent e) -> {
                shubiaodianji(e);
            });
            huabu.getChildren().addAll(button);
        }
    }

    private void shubiaodianji(MouseEvent event) {
//        鼠标非右键
        if (event.getButton() != SECONDARY) {
            Button button = new Button(names);
            button.setPrefWidth(100);
            button.setPrefHeight(100);
            button.setStyle("-fx-margin:5px;");
            button.setLayoutX(this.button.getLayoutX());
            button.setLayoutY(this.button.getLayoutY());
            huabu.getChildren().add(button);
        }
        huabu.getChildren().remove(button);
        names = null;
    }

    public void jzwp(MouseEvent event) {
        if (names == null)
            names = event.getSource().toString();
        else
            names = null;
    }
}
