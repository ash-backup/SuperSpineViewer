package com.QYun.SuperSpineViewer.GUI;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.image.ImageView;

public class Controller {

    public static SpineController spineController;
    public static ExporterController exporterController;
    public static ImageView spineRender;
    public static int width = 912;
    public static int height = 697;
    public static int format = 1;
    public static boolean isFX = true;
    public static String path;
    public static SimpleBooleanProperty isLoad = new SimpleBooleanProperty(false);

}
