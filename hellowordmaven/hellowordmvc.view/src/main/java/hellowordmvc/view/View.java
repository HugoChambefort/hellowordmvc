package hellowordmvc.view;

import hellowordmvc.Contract.IView;

public class View  implements IView{

	public void displayMessage(String message) {
		
		System.out.println(message);		
	}
	

	
}
