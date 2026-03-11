	package Pattern1Singleton;

public class PrintSpooler {
	 private static PrintSpooler instance;
	 
	  private PrintSpooler() {
	        init();
	    }
	  
	  public void init() {
		  System.out.println("Đang khởi tạo ");
		  
	  }
	  
	    public static PrintSpooler getInstance() {
	        if (instance == null) {
	            instance = new PrintSpooler();
	        }
	        return instance;
	    }

		public void print(String string) {
		 System.out.println("In" + string);
			
		}
	  
}
