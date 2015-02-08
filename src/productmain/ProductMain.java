package productmain;

import java.util.List;

import printer.ZahyouPrinter;
import utils.ArrayBuilder;
import utils.ArrayChecker;

/*
 * 仕様：
 * 実行時引数で与えた整数値i*iの盤上に、i個のクイーンを並べた時
 * どの駒も取られないよう配置できる座標をすべて列挙するプログラム。
 * */

/*アルゴリズム：
 * クイーンが条件を満たすような配置をとるには、x,y,斜めの座標が重複してはならない。
 * x,yが重複しないように配置するには、
 * 座標は(1,a1)(2,a2)…(n,an)の組み合わせであり、a1~anの値の取り方はn!個ある。
 * 求める組み合わせはn!の順列組み合わせをチェックすれば良いことが分かる。
 * ８！の順列を配列として列挙した値をリストとしてもらう。
 * 値のチェック
 * OK→プリンターを動かす→最初にもどる
 * NG→最初に戻る
 * 
 * 最終行→プリンターでFinishと個数を算出。
 * 
 * */
public class ProductMain {

	public static void main(String[] args) {
		//配列から値を取得する用意
		int count =Integer.parseInt(args[0]);
		
		//
		ArrayBuilder arrayBuilder= new ArrayBuilder(count);
		ArrayChecker arrayChecker=new ArrayChecker();
		ZahyouPrinter zahyouPrinter=new ZahyouPrinter();
		//配列の用意
		List<int[]> intArrayList=arrayBuilder.getList();
		
		//デバッグ用
		//System.out.println(intArrayList.size());
		
		//配列のチェック
		//初期パターンは当てはまらないので、次のパターンから計算する。
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
