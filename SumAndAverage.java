package projetc1;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,avg;
		for(i=0;i<=10;i++) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The sum is: "+sum);
		avg=sum/10;
		System.out.println("The average is:"+avg);
	}

}
