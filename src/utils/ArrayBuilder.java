package utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayBuilder {
	private List<int[]> intArrayList;
	
	//コンストラクタ。順列リストを生成。
	public ArrayBuilder(int arrayCount){
		this.intArrayList=new ArrayList<>();
		genereteArrayList(arrayCount);
	}

	
	//数値でできる全順列を収納するリストを生成するメソッド。
	private void genereteArrayList(int arrayCount){
		int[] right = new int[arrayCount];
		for (int i = 0; i < arrayCount; i++) {
			right[i] = i + 1;
		}
		int[] left = new int[0];

		permutation(left, right);
	}
	
	// 再帰用メソッド
		private void permutation(int[] left, int[] right) {
			int[] newLeft = new int[left.length + 1];
			for (int i = 0; i < left.length; i++) {
				newLeft[i] = left[i];
			}
			for (int i = 0; i < right.length; i++) {
				newLeft[newLeft.length - 1] = right[i]; // 1つずつ避けておく
				if (right.length == 1) { // もうありません
					this.intArrayList.add(newLeft);
					//showResult(newLeft);
				} else {
					int[] newRight = new int[right.length - 1];
					for (int j = 0; j < i; j++) { // 取り除いたのより前をコピー
						newRight[j] = right[j];
					}

					for (int j = i + 1; j < right.length; j++) { // 後をコピー
						newRight[j - 1] = right[j];
					}

					permutation(newLeft, newRight);
				}
			}

		}
//      デバッグ用。
//		private void showResult(int[] result) {
//			for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i]);
//			}
//			System.out.println();
//			}
	
	//リストを返すメソッド
	public List<int[]> getList(){
		return this.intArrayList;
	}
	
		
	


}
