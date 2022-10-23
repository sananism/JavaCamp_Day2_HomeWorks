package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new DataBaseLogger(), new EmailLogger()};
//		for(BaseLogger logger : loggers) {
//			logger.log("Log message");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
											  // constructorun nesne olarak tanimlandigi yer
		customerManager.add();
		

	}

}
