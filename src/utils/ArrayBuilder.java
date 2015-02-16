package utils;

import printer.BoardPrinter;

public class ArrayBuilder {
	//private List<int[]> intArrayList;
	

	public ArrayBuilder(int arrayCount) {
		//this.intArrayList=new ArrayList<>();
		ArrayChecker arrayChecker=new ArrayChecker();
		BoardPrinter boardPrinter=new BoardPrinter();
		genereteArrayList(arrayCount,arrayChecker,boardPrinter);
	}

	
	//数値でできる全順列を収納するリストを生成するメソッド。
	private void genereteArrayList(int arrayCount, ArrayChecker arrayChecker,BoardPrinter boardPrinter){
		int[] right = new int[arrayCount];
		for (int i = 0; i < arrayCount; i++) {
			right[i] = i + 1;
		}
		int[] left = new int[0];
		permutation(left, right,arrayChecker,boardPrinter);
		boardPrinter.printFinalLine();
	}
	
	// 再帰用メソッド
		private void permutation(int[] left, int[] right, ArrayChecker arrayChecker,BoardPrinter boardPrinter) {
			int[] newLeft = new int[left.length + 1];
			for (int i = 0; i < left.length; i++) {
				newLeft[i] = left[i];
			}
			for (int i = 0; i < right.length; i++) {
				newLeft[newLeft.length - 1] = right[i]; // 1つずつ避けておく
				if (right.length == 1) { // もうありません
					if(!arrayChecker.doCheck(newLeft)) {
						boardPrinter.printOneLine(newLeft);
					}
				} else {
					int[] newRight = new int[right.length - 1];
					for (int j = 0; j < i; j++) { // 取り除いたのより前をコピー
						newRight[j] = right[j];
					}

					for (int j = i + 1; j < right.length; j++) { // 後をコピー
						newRight[j - 1] = right[j];
					}

					permutation(newLeft, newRight, arrayChecker,boardPrinter);
				}
			}

		}

	

	
		
	


}
