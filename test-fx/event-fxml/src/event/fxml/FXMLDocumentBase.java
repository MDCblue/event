package event.fxml;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class FXMLDocumentBase extends Pane {

    protected final Pane pane;
    protected final Text text;
    protected final ImageView imageView;
    protected final Pane pane0;
    protected final Text text0;
    protected final ImageView imageView0;
    protected final Pane pane1;
    protected final Text text1;
    protected final ImageView imageView1;
    protected final Pane pane2;
    protected final ImageView imageView2;
    protected final JFXTextField jFXTextField;
    protected final Pane pane3;
    protected final Text text2;
    protected final ImageView imageView3;
    protected final Pane pane4;
    protected final Text text3;
    protected final ImageView imageView4;
    protected final Pane pane5;
    protected final Text text4;
    protected final Text text5;
    protected final Text text6;
    protected final Text text7;
    protected final Text text8;
    protected final Text text9;
    protected final Text text10;
    protected final Text text11;
    protected final Text text12;
    protected final JFXDatePicker jFXDatePicker;
    protected final JFXDatePicker jFXDatePicker0;
    protected final Text text13;
    protected final JFXButton jFXButton;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final TextField textField2;
    protected final TextField textField3;
    protected final TextField textField4;
    protected final TextField textField5;
    protected final TextField textField6;

    public FXMLDocumentBase() {

        pane = new Pane();
        text = new Text();
        imageView = new ImageView();
        pane0 = new Pane();
        text0 = new Text();
        imageView0 = new ImageView();
        pane1 = new Pane();
        text1 = new Text();
        imageView1 = new ImageView();
        pane2 = new Pane();
        imageView2 = new ImageView();
        jFXTextField = new JFXTextField();
        pane3 = new Pane();
        text2 = new Text();
        imageView3 = new ImageView();
        pane4 = new Pane();
        text3 = new Text();
        imageView4 = new ImageView();
        pane5 = new Pane();
        text4 = new Text();
        text5 = new Text();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();
        text9 = new Text();
        text10 = new Text();
        text11 = new Text();
        text12 = new Text();
        jFXDatePicker = new JFXDatePicker();
        jFXDatePicker0 = new JFXDatePicker();
        text13 = new Text();
        jFXButton = new JFXButton();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        textField4 = new TextField();
        textField5 = new TextField();
        textField6 = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(700.0);
        setPrefWidth(900.0);
        setStyle("-fx-background-color: #1175f7;");

        pane.setPrefHeight(700.0);
        pane.setPrefWidth(304.0);
        pane.setStyle("-fx-background-color: #1175f7;");

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(98.0);
        text.setLayoutY(672.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Event © MDC Blue");

        imageView.setFitHeight(96.0);
        imageView.setFitWidth(79.0);
        imageView.setLayoutX(117.0);
        imageView.setLayoutY(542.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../../../event-o/src/images/event/event-logo.png").toExternalForm()));

        pane0.setLayoutY(137.0);
        pane0.setPrefHeight(46.0);
        pane0.setPrefWidth(303.0);

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(83.0);
        text0.setLayoutY(30.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("New Event");
        text0.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView0.setFitHeight(24.0);
        imageView0.setFitWidth(24.0);
        imageView0.setLayoutX(45.0);
        imageView0.setLayoutY(11.0);
        imageView0.setImage(new Image(getClass().getResource("../../../../../event-o/src/images/icons/icons8-joyent.png").toExternalForm()));

        pane1.setLayoutX(7.0);
        pane1.setLayoutY(192.0);
        pane1.setPrefHeight(46.0);
        pane1.setPrefWidth(303.0);

        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setLayoutX(83.0);
        text1.setLayoutY(30.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Edit Event");
        text1.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView1.setLayoutX(45.0);
        imageView1.setLayoutY(9.0);
        imageView1.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Editing/25/ffffff/icons8-pencil_tip.png").toExternalForm()));

        pane2.setLayoutY(45.0);
        pane2.setPrefHeight(46.0);
        pane2.setPrefWidth(303.0);

        imageView2.setLayoutX(27.0);
        imageView2.setLayoutY(12.0);
        imageView2.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Popular%20Icons/25/ffffff/icons8-search.png").toExternalForm()));

        jFXTextField.setLayoutX(62.0);
        jFXTextField.setLayoutY(10.0);

        pane3.setLayoutY(259.0);
        pane3.setPrefHeight(46.0);
        pane3.setPrefWidth(303.0);

        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setLayoutX(83.0);
        text2.setLayoutY(30.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Instructions");
        text2.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView3.setLayoutX(45.0);
        imageView3.setLayoutY(9.0);
        imageView3.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Editing/25/ffffff/icons8-bulleted_list.png").toExternalForm()));

        pane4.setLayoutY(312.0);
        pane4.setPrefHeight(46.0);
        pane4.setPrefWidth(303.0);

        text3.setFill(javafx.scene.paint.Color.WHITE);
        text3.setLayoutX(83.0);
        text3.setLayoutY(30.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("View Event ");
        text3.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView4.setLayoutX(45.0);
        imageView4.setLayoutY(9.0);
        imageView4.setImage(new Image(getClass().getResource("../../../../../Documents/com.visualpharm.Icons8/android_l/Messaging/25/ffffff/icons8-star.png").toExternalForm()));

        pane5.setLayoutX(304.0);
        pane5.setPrefHeight(700.0);
        pane5.setPrefWidth(599.0);
        pane5.setStyle("-fx-background-color: #ffffff;");

        text4.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text4.setLayoutX(60.0);
        text4.setLayoutY(110.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Event Name");
        text4.setFont(new Font(17.0));

        text5.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text5.setLayoutX(60.0);
        text5.setLayoutY(158.0);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Organization");
        text5.setFont(new Font(17.0));

        text6.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text6.setLayoutX(60.0);
        text6.setLayoutY(211.0);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Advisor");
        text6.setFont(new Font(17.0));

        text7.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text7.setLayoutX(60.0);
        text7.setLayoutY(262.0);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Transportation");
        text7.setFont(new Font(17.0));

        text8.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text8.setLayoutX(60.0);
        text8.setLayoutY(319.0);
        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Number of Students in Organization");
        text8.setFont(new Font(17.0));

        text9.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text9.setLayoutX(60.0);
        text9.setLayoutY(382.0);
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Number of Students Attending Event");
        text9.setFont(new Font(17.0));

        text10.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text10.setLayoutX(60.0);
        text10.setLayoutY(443.0);
        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("Number of Chaperones Attending Event");
        text10.setFont(new Font(17.0));

        text11.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text11.setLayoutX(60.0);
        text11.setLayoutY(512.0);
        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Date");
        text11.setFont(new Font(17.0));

        text12.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text12.setLayoutX(299.0);
        text12.setLayoutY(509.0);
        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("to");
        text12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text12.setFont(new Font(17.0));

        jFXDatePicker.setLayoutX(122.0);
        jFXDatePicker.setLayoutY(489.0);

        jFXDatePicker0.setLayoutX(335.0);
        jFXDatePicker0.setLayoutY(491.0);

        text13.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text13.setLayoutX(63.0);
        text13.setLayoutY(574.0);
        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("Location");
        text13.setFont(new Font(17.0));

        jFXButton.setLayoutX(479.0);
        jFXButton.setLayoutY(614.0);

        textField.setLayoutX(207.0);
        textField.setLayoutY(83.0);

        textField0.setLayoutX(207.0);
        textField0.setLayoutY(126.0);

        textField1.setLayoutX(207.0);
        textField1.setLayoutY(182.0);

        textField2.setLayoutX(207.0);
        textField2.setLayoutY(233.0);

        textField3.setLayoutX(405.0);
        textField3.setLayoutY(290.0);
        textField3.setPrefHeight(26.0);
        textField3.setPrefWidth(61.0);

        textField4.setLayoutX(405.0);
        textField4.setLayoutY(353.0);
        textField4.setPrefHeight(26.0);
        textField4.setPrefWidth(61.0);

        textField5.setLayoutX(405.0);
        textField5.setLayoutY(414.0);
        textField5.setPrefHeight(26.0);
        textField5.setPrefWidth(61.0);

        textField6.setLayoutX(60.0);
        textField6.setLayoutY(588.0);
        textField6.setPrefHeight(26.0);
        textField6.setPrefWidth(213.0);

        pane.getChildren().add(text);
        pane.getChildren().add(imageView);
        pane0.getChildren().add(text0);
        pane0.getChildren().add(imageView0);
        pane.getChildren().add(pane0);
        pane1.getChildren().add(text1);
        pane1.getChildren().add(imageView1);
        pane.getChildren().add(pane1);
        pane2.getChildren().add(imageView2);
        pane2.getChildren().add(jFXTextField);
        pane.getChildren().add(pane2);
        pane3.getChildren().add(text2);
        pane3.getChildren().add(imageView3);
        pane.getChildren().add(pane3);
        pane4.getChildren().add(text3);
        pane4.getChildren().add(imageView4);
        pane.getChildren().add(pane4);
        getChildren().add(pane);
        pane5.getChildren().add(text4);
        pane5.getChildren().add(text5);
        pane5.getChildren().add(text6);
        pane5.getChildren().add(text7);
        pane5.getChildren().add(text8);
        pane5.getChildren().add(text9);
        pane5.getChildren().add(text10);
        pane5.getChildren().add(text11);
        pane5.getChildren().add(text12);
        pane5.getChildren().add(jFXDatePicker);
        pane5.getChildren().add(jFXDatePicker0);
        pane5.getChildren().add(text13);
        pane5.getChildren().add(jFXButton);
        pane5.getChildren().add(textField);
        pane5.getChildren().add(textField0);
        pane5.getChildren().add(textField1);
        pane5.getChildren().add(textField2);
        pane5.getChildren().add(textField3);
        pane5.getChildren().add(textField4);
        pane5.getChildren().add(textField5);
        pane5.getChildren().add(textField6);
        getChildren().add(pane5);

    }
}
