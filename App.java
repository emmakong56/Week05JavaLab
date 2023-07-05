package videoCurriculum.interfaces;

public class App {

	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.error("***Error: Hello***");
		
		Logger loggers = new SpacedLogger();
		loggers.log("H e l l o ");
		logger.error("***ERROR: H e l l o***");
		
		
		

	}

}
