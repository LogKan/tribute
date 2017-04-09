package lottoClient.source.splashScreen;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lottoClient.source.abstractClasses.View;

/**
 * Copyright 2015, FHNW, Prof. Dr. Brad Richards. All rights reserved. This code
 * is licensed under the terms of the BSD 3-clause license (see the file
 * license.txt).
 * 
 * @author Brad Richards
 */

public class SplashView extends View<SplashModel>{
	ProgressBar progress;
	private Label lblStatus;

	public SplashView(Stage stage, SplashModel model) {
		super(stage, model);
		stage.initStyle(StageStyle.TRANSPARENT);
	}

	@Override
	protected Scene createGUI() {
		BorderPane root = new BorderPane();
		root.setId("splashScreen");
		
		lblStatus = new Label("Please Wait");
		root.setCenter(lblStatus);
		
		progress = new ProgressBar();
		HBox bottomBox = new HBox();
		bottomBox.setId("progressbox");
		bottomBox.getChildren().add(progress);
		root.setBottom(bottomBox);
		
		Scene scene = new Scene(root, 300, 300, Color.TRANSPARENT);
		scene.getStylesheets().addAll(
				this.getClass().getResource("splash.css").toExternalForm());
		
		return scene;
	}
	
	

}
