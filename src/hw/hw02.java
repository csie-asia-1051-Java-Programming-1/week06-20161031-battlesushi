package hw;
import java.util.*;
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("輸入男(1)/女(2), 身高:");
		System.out.print(fun(sc.nextShort(),sc.nextFloat()));
	}
	public static float fun(short x, float y) {
		float out=0,b=0,g=0;
		if(x==1){
			b=(y-170)*0.6f+62;
			out=b;
		}
		else if(x==2){
			g=(y-158)*0.5f+52;
			out=g;
		}
		else
			System.out.print("輸入錯誤!!");

		return out;
	}
	
}
