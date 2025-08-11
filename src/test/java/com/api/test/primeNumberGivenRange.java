ipackage com.api.test;

public class primeNumberGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start =2, last =100;
		
		int sum = 0; // only when need to find average 
		for (int i=start;i<=last;i++)
		{
			int check =0;
			for (int j=1;j<=i;j++)
			{
				if (i%j ==0)
				{
					check++;
				}
			}
			if (check ==2)
			{
				System.out.println(i);
				sum+=i; // to find the average of prime number 
			}
		}

		System.out.println("Average of prime : "+ sum);
	}

}
