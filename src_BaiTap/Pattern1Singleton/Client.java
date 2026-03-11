package Pattern1Singleton;

public class Client {

	public static void main(String[] args) {
		   PrintSpooler ps1 = PrintSpooler.getInstance();
	        PrintSpooler ps2 = PrintSpooler.getInstance();

	        ps1.print("Document A");
	        ps2.print("Trần Bảo Vệ");
	     

	}

}
