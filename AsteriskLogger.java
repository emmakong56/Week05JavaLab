package videoCurriculum.interfaces;


public class AsteriskLogger implements Logger {
	
	@Override
	public void log(String greeting) {
		String specialGreeting = "***" + greeting + "***";
		System.out.println(specialGreeting);
		
	}

	@Override
	public void error(String massage) {
		String specialmassage = massage ;
		System.out.println(specialmassage);
	}

}

