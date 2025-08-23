package assignmentsOfTestleaf.week1;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		
		Browser sstem_1 = new Browser();
		sstem_1.launchBrowser("Edge");
		String returnin_Word = sstem_1.loadUrl();
		System.out.println("loadUrl ----" + returnin_Word);
		
	}

}
