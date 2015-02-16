package productmain;

import utils.ArrayBuilder;


public class ProductMain {

	public static void main(String[] args) {
		//配列から値を取得する用意
		long start = System.currentTimeMillis();
		int count =Integer.parseInt(args[0]);
		ArrayBuilder arrayBuilder= new ArrayBuilder(count);
		long stop = System.currentTimeMillis(); 
		System.out.println("実行にかかった時間は " + (stop - start) + " ミリ秒です。"); 
		
	}
}
