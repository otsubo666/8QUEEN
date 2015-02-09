package productmain;

import java.util.List;

import printer.ZahyouPrinter;
import utils.ArrayBuilder;
import utils.ArrayChecker;


public class ProductMain {

	public static void main(String[] args) {

		int count =Integer.parseInt(args[0]);
		

		ArrayBuilder arrayBuilder= new ArrayBuilder(count);
		ArrayChecker arrayChecker=new ArrayChecker();
		ZahyouPrinter zahyouPrinter=new ZahyouPrinter();

		List<int[]> intArrayList=arrayBuilder.getList();

		for(int[] array:intArrayList){
			if(!arrayChecker.doCheck(array)){
				zahyouPrinter.printOneLine(array);
			}
			else{
				//System.out.println("failed");
			}
		}
		zahyouPrinter.printFinalLine();
	}

}
