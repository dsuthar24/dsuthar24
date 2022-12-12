
public class LoopClass {

	public static void main(String[] args) {
		// Loops

		//1. Initialization 2. Condition 3. increment/ Decrement
		
		for(int i=0; i<=50; i++)
		{
			System.out.println("Good morning");
			System.out.println(i);
		}
		
		int count=0;
		for(int i=0;i<50;i++)
		{
			//System.out.println("Good morning");
			//System.out.println(i);
			count=count +1;
			System.out.println(i);
		}
		
		//2. While Loop
		int d=0;
	    int countdown=0;
		while(d<50)
		{
			countdown = countdown+d;
			System.out.println(count);
			d++;
		}
		
		//3.Do while loop
		
		int k=0;
		int counter =0;
		do {
			counter=counter+k;
			System.out.println(counter);
			k++;
		}while(k<50);
		
		// 4. Enhanced for loop.
		int[] arr= {10,20,1,3,50,60,70,80};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		for(int ii=0;ii<arr.length;ii++)
		for (int kk:arr)
			// Arrays and arraylist 
		{
			System.out.println(kk);
		}
	}

}
