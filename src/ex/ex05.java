package ex;
import java.util.*;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 *  * Author: 105021030 張廷毓
 */
public class ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
			System.out.print(fun1(x));	
				
	}
	public static long fun1(long n) {
		long sum=0;
		while(n>0){
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;

	}
	
	
}
