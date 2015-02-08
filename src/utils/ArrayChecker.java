package utils;

public class ArrayChecker {
	public ArrayChecker(){
		
	}
	public boolean doCheck(int array[]){
		//配列の要素をチェック。
		//配列の要素を一つずつ取り出し、次の値と比較する。
		boolean result=false;
		int upper,downer;
		for(int i=0;i<array.length;i++){
			upper=array[i]+1;
			downer=array[i]-1;
			for(int j=i+1;j<array.length;j++){
				result=(upper==array[j] || downer==array[j]);
				if(result){
					//System.out.println("not Pattern");
					//System.out.println("i="+i+" "+"j="+j);
					break;}
				else{
					upper++;
					downer--;
					}
			}
			if(result){break;}
		}
		return result;
	}
}
