package utils;

import printer.BoardPrinter;

public class ArrayBuilder {
	private ArrayChecker arrayChecker;
	private BoardPrinter boardPrinter;
	

	public ArrayBuilder(int arrayCount, BoardPrinter boardPrinter, ArrayChecker arraychecker) {
		this.arrayChecker = arraychecker;
		this.boardPrinter = boardPrinter;
		genereteArrayList(arrayCount);
	}

	
	
	private void genereteArrayList(int arrayCount){
		int[] right = new int[arrayCount];
		for (int i = 0; i < arrayCount; i++) {
			right[i] = i + 1;
		}
		int[] left = new int[0];
		permutation(left, right);
		this.boardPrinter.printFinalLine();
	}
	
	
		private void permutation(int[] left, int[] right) {
			int[] newLeft = new int[left.length + 1];
			for (int i = 0; i < left.length; i++) {
				newLeft[i] = left[i];
			}
			for (int i = 0; i < right.length; i++) {
				newLeft[newLeft.length - 1] = right[i]; 
				if (right.length == 1) { 
					if(!this.arrayChecker.doCheck(newLeft)) {
						this.boardPrinter.printOneLine(newLeft);
					}
				} else {
					int[] newRight = new int[right.length - 1];
					for (int j = 0; j < i; j++) { 
						newRight[j] = right[j];
					}

					for (int j = i + 1; j < right.length; j++) { 
						newRight[j - 1] = right[j];
					}

					permutation(newLeft, newRight);
				}
			}

		}

	

	
		
	


}
