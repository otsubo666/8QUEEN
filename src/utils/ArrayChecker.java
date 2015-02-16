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
			result = checkColumn(array, result, upper, downer, i);
			if(result) { 
				break;
				}
		}
		return result;
	}
	
	private boolean checkColumn(int[] array, boolean result, int upper,int downer, int i) {
		for(int j=i+1;j<array.length;j++) {
			result=(upper==array[j] || downer==array[j]);
			if(result) {
				break;
				}
			else{
				upper++;
				downer--;
				}
		}
		return result;
	}
}
