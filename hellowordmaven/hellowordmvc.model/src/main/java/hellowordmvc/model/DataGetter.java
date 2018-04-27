package hellowordmvc.model;

public class DataGetter {

	private static DataGetter self;
	private DataGetter() {
		
	}
	
	public static DataGetter getDataGetter() {
		
		if(self == null) {
			self = new DataGetter();
			
		}
		return self;
	}
	
	public String getText() {
		return "Je suis un Singleton";
	}
}
