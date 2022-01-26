package by.epam.java_introduction.final_module.library.presentation;



public class PresentationProvider {
	private static final PresentationProvider instance = new PresentationProvider();
	
	private ConsolePresentation console = new ConsolePresentation();
	private PrintPresentation print = new PrintPresentation();
	
	public PresentationProvider() {	
	}
	
	
	
	
}
