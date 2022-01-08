package by.epam.java_introduction.basic_of_oop.task1;


public class View {
	
	public void printContentDirectory(Directory directory) {
		System.out.println("Directory \"" + directory.getTitle() + "\" contains:");
		
		for (Directory directoryInner : directory.getDirectoryList()) {
			System.out.println("directory: \"" + directoryInner.getTitle() + "\"");
		}
		
		for (File fileInner : directory.getFileList()) {
			System.out.println("file: \"" + fileInner.getTitle() + "\"");
		}
		System.out.println();
	}
	
	public void printTextFile(TextFile textFile) {
		System.out.println("File \"" + textFile.getTitle() + "\" contains text:");
		System.out.println(textFile.getText() + "\n");		
	}

}
