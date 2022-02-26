package org.lang;

public class StateDetails extends LanguageInfo {
	
	private void southIndia() {
		// TODO Auto-generated method stub
		System.out.println("south");
	}
	
	public void northIndia() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
		StateDetails s =  new StateDetails();
		s.englishLanguage();
		s.hindilanguage();
		s.tamilLanguage();
		s.northIndia();
		s.southIndia();
		
		System.out.println("Done");
	}

}
