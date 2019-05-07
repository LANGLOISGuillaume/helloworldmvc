package helloworldmvc.model;

import helloworldmvc.contract.IModel;

public class Model implements IModel{
	
	private DAOHelloWorld hw = new DAOHelloWorld();
	
	public String getHelloWorld() {
		return hw.getHelloWorldMessage();
	}

}
