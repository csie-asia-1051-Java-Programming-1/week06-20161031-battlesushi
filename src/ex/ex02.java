package ex;
import java.util.*;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 *  * Author: 105021030 張廷毓
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.print(fun(m)/  ( fun(n)*fun(m-n) )	);
	}
	public static int fun(int x){
		int sum=1;
		for(int i=1;i<=x;i++){
			sum=sum*i;
		}
		return sum;
	}
	
	
	

}
