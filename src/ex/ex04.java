package ex;
import java.util.*;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 *  * Author: 105021030 張廷毓
 */
public class ex04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String str=a.replaceAll(" ","");
		square(str);
	}
	public static void square(String arr) {
		int data[]=new int[arr.length()];
		int num=Integer.parseInt(arr);
		//data從i=arr.length()-1開始排----->0       用%10 /10
		for(int i=arr.length()-1;i>=0;i--){
			data[i]=(int)Math.pow(num%10, 2);
			num=num/10;
		}
		
		for(int i=0;i<arr.length();i++)
			System.out.print(data[i]+"\t");
		
	}
}
