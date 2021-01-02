package com.QYun.SuperSpineViewer.GUI;

import com.QYun.SuperSpineViewer.RuntimesLoader;
import com.badlogic.gdx.files.FileHandle;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ExporterController {

    @FXML
    private StackPane Exporter;

    @FXML
    private Label L_Version;

    @FXML
    private Label L_Skel;

    @FXML
    private Label L_Atlas;

    @FXML
    private Label L_FPS;

    @FXML
    private ToggleGroup Render;

    @FXML
    private ToggleGroup Format;

    @FXML
    private JFXTextField T_Path;

    @FXML
    private JFXProgressBar P_Export;

    @FXML
    void B_Export(ActionEvent event) {

    }

    @FXML
    void B_Open(ActionEvent event) {
        RuntimesLoader runtimesLoader = new RuntimesLoader();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Skeleton");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Skeleton File", "*.json", "*.skel")
        );

        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            runtimesLoader.init(new FileHandle(new File(file.getAbsolutePath())));
        }

        event.consume();
    }

    @FXML
    void B_Path(ActionEvent event) {

    }

    @FXML
    void RB_GIF(ActionEvent event) {

    }

    @FXML
    void RB_LibGDX(ActionEvent event) {

    }

    @FXML
    void RB_MOV(ActionEvent event) {

    }

    @FXML
    void RB_OpenJFX(ActionEvent event) {

    }

    @FXML
    void RB_Sequence(ActionEvent event) {

    }

}
