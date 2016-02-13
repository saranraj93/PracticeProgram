package hackerrank.domain.mathematics.fundamental;
import java.util.Scanner;
public class FindPoint {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	//int[] coordinates=new int[4];
	int px,py,qx,qy=0;
	for(int i=0;i<T;i++){
		px=sc.nextInt();
		py=sc.nextInt();
		qx=sc.nextInt();
		qy=sc.nextInt();
		System.out.println((2*qx-px)+" "+(2*qy-py));
	}
}
}
