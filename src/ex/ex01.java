package ex;
import java.util.*;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 *  * Author: 105021030 張廷毓
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入數字,字元:");
		System.out.print(square(sc.nextInt(), sc.next().charAt(0))		);

	}
	public static String square(int n,char c) {
		String a="";
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(c);		
			}
				System.out.println();
		}
		return a;
			
			
	}
	
	
	
}
