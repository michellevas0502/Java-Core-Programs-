package projetc1;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] a = {7,3,9,13,18,12};
		int sum=0;
		
		for(int i=0;i<6;i++) 
		{
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
