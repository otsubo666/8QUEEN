package productmain;

import utils.ArrayBuilder;
import utils.ArrayChecker;
import printer.BoardPrinter;

public class ProductMain {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		int count =Integer.parseInt(args[0]);
		ArrayChecker arrayChecker=new ArrayChecker();
		BoardPrinter boardPrinter=new BoardPrinter();
		ArrayBuilder arrayBuilder= new ArrayBuilder(count, boardPrinter, arrayChecker);
		long stop = System.currentTimeMillis(); 
		System.out.println("Às‚É‚©‚©‚Á‚½ŠÔ‚Í" + (stop - start) + "ƒ~ƒŠ•b‚Å‚·"); 
		
	}
}
