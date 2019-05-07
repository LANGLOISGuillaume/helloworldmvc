package hellowworldmvc.main;

import helloworldmvc.model.Model;
import helloworldmvc.view.View;
import hellowworldmvc.controller.Controller;

public class Main {

	public static void main(String[] args) {
		
		new Controller(new View(), new Model()).run();

	}

}
