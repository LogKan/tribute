package Lotto;

import com.sun.media.jfxmedia.logging.Logger;

import Lotto.Source.Controller;
import Lotto.Source.Model;
import Lotto.Source.ServiceLocator;
import Lotto.Source.View;
import javafx.application.Application;
import javafx.stage.Stage;

public class Lotto extends Application {

	private Model model;
	private View view;
	private Controller controller;
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new Model();
		view = new View(primaryStage, model);
		controller = new Controller(model, view);
		
	view.start();
		
	}

}