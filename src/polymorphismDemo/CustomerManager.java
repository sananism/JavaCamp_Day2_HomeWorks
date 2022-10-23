package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger  ;
	
	public CustomerManager(BaseLogger logger) {  //constructor // nesne olarak Main classinda tanimlandi
	this.logger = logger;
	}
	
	
	public void add() {
		this.logger.log("Log mesajiii");   //yeni BaseLogger.log
	}

}
