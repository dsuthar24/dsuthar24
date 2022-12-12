
public class MethodClass {

	static int a;  // Instance Variable / Object Variable
	static int b;
	static String s; //Static variable or Class variable 
	
	//How to write methods
	// Non- return type methods
	//Void name(){} --> No parameter
	//void name (DataType a) -->  one parameter with data type
	static void sumTwoNumber()
	{
		int tot= a+b;// Local Variable
		System.out.println(tot);
	}	
	
	static void sumTwoNumberwithParam(int a, int b)
	{
		int tot= a+b;
		System.out.println(tot);
	}
	// Return type methods
	//<Data Type> name (){}--> No parameter 
	//<Data Type> name (Data Type var){} --> one parameter
	
	
	static int getSumOfNumber()
	{
		int tot=a+b;
		return tot;
	}
	
	static int subTwoNumberwithParam(int a, int b)
	{
		int tot= a-b;
		return tot;
	}
	// return type can be int, string,char,double float.
	
	
	public static void main(String[] args) {
			
		
		MethodClass.a=100;
		MethodClass.b=200;
		sumTwoNumber();
		sumTwoNumberwithParam(120,150);
		int ii=getSumOfNumber();
		System.out.println(ii);
		int aa=subTwoNumberwithParam(80,23);
		System.out.println(aa);
	
		
	}

}
