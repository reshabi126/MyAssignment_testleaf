package assignmentsOfTestleaf.week1;

public class Browser {

	void launchBrowser(String browserName) {
		System.out.println("browsername    --" + browserName);
	}
	
	String loadUrl() {
		
		return" Url Loaded Sucessfully";	
	}

	public static void main(String[] args) {
		
		Browser sstem = new Browser();
		sstem.launchBrowser("chrome");
		String returni_Word = sstem.loadUrl();
		System.out.println("loadUrl -- "+ returni_Word);
		
	}
}
