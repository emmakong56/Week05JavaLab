package videoCurriculum.interfaces;


public class SpacedLogger implements Logger{

	@Override
	public void log(String greeting) {
		StringBuilder spacedGreeting = new StringBuilder();
		for(int i = 0; i < greeting.length(); i++) {
			spacedGreeting.append(greeting.charAt(i)).append("");
		}
		System.out.println(spacedGreeting.toString().trim());
		
	}

	@Override
	public void error(String massage) {
		StringBuilder spacedmassage = new StringBuilder();
		for(int i = 0; i < massage.length(); i++) {
			spacedmassage.append(massage.charAt(i)).append("");
		}
		System.out.println(spacedmassage.toString().trim());
		
	}

}
