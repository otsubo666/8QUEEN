package printer;

public class BoardPrinter {
	private int lineCounter;
	//private static String SPACE=" ";
	public BoardPrinter(){
		this.lineCounter=0;
	}
	public void printOneLine(int array[]){
		this.lineCounter++;
		System.out.print(lineCounter+":");
		for(int i=0;i<array.length;i++) {
			if(i==array.length-1) {
				System.out.println("("+(i+1)+","+array[i]+")");
				}
			else{ 
				System.out.print("("+(i+1)+","+array[i]+")");
			}
		}
	}
	
	public void printFinalLine(){
		System.out.println("finished");
		System.out.println("total case is="+lineCounter);
	}

}
