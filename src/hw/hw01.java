package hw;
import java.util.*;
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(	fun(sc.nextFloat(),sc.nextShort())	);
	}
	public static float fun(float v1,short type) {
		float sum=0,C=0,F=0;
		if(type==1){
			C=(v1-32)*5/9;
			sum=C;
		}
		else if(type==2){
			F=(v1*9/5)+32;
			sum=F;
		}
		else
			System.out.print("¿é¤J¿ù»~!!");
		return sum;
	}
	

}
