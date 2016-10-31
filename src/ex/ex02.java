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
		System.out.print(""+fun(sc.nextInt(),sc.nextInt()));
	}
	public static long fun(int m,int n){
		int sum=1,c=0;
		int sum2=1,sum3=1;
		for(int i=1;i<=m;i++){
			sum=sum*i;
		}
		for(int i=1;i<=n;i++){
			sum2=sum2*i;
		}
		for(int i=1;i<=m-n;i++){
			sum3=sum3*i;
		}
		c=sum/(sum2*sum3);
		
		return c;
	}
	
	
	

}
