package Avikal.JavaMasterClass;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		
		if(tonerLevel > -1 && tonerLevel <= 100)
			this.tonerLevel = tonerLevel;
		else
			this.tonerLevel = -1;
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount > 0 && tonerAmount <= 100) {
			if(this.tonerLevel + tonerAmount > 100)
				return -1;
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}
		else {
			return -1;
		}
	}
	
	
	public int printPages(int page) {
		int pagesToPrint = page;
		if(duplex) {
			pagesToPrint = (page / 2) + (page % 2);
			System.out.println("Printing in Duplex Mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
}



//		public static void main(String[] args) {
//			
//			Printer printer = new Printer(50, false);
//			System.out.println("Initial page count = " + printer.getPagesPrinted());
//			int pagesPrinted = printer.printPages(5);
//			System.out.println("Page printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
//			pagesPrinted = printer.printPages(5);
//			System.out.println("Page printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
//			
//		}
