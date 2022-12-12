
public class ConditionClass {

	public static void main(String[] args) {
		
		//Arithmetic operators: ==, <, >, <=, >=, !=
		//logical operators: AND (&&), OR (||)
		//String Operators: equals, equalsIgnoreCase, contains, starts-with, ends-with

		//if: Condition True
		int a=10;
		int b=20;
		if(a==11 || b==21)
		{
			System.out.println("True");	
		}
		//if-else: if is for true, else for false
		String s="Class";
		
		if(a==11 || b==21 || s.equals("Class"))
		{
			System.out.println("True  "+s);
		}else //else will handle false conditions
		{
			System.out.println("False");
		}
		//if-else if-else (ladder codition check)
		String ds="Selenium";
		if(ds.contains("Sell"))
		{
			System.out.println("Contains");
		}
		else if(ds.equals("Selenium"))
		{
			System.out.println("equals");
		}
		else if(ds.startsWith("Sel"))
		{
			System.out.println("Starts with");
		}
		else
		{
			System.out.println("False");
		}
		//nested - if else
		/*if()  break down to different condition
		{
			if() 
			{
				
			}
			else {}
		}
		else
		{}*/
		
		//switch --> Optimized condition check
		//int aa=10;
		char aa='a';
		switch(aa)
		{
		case 1:System.out.println("1:"+aa);
		break;
		case 5:System.out.println("5:"+aa);
		break;
		case 10:System.out.println("10:"+aa);
		break;
		case 20:System.out.println("20:"+aa);
		break;
		case 'a':System.out.println("char:"+aa);
		break;
		case 30:System.out.println("30:"+aa);
		break;
		}
		// break
		
		/*for(int i=0;i<20;i++)
		{
			System.out.println(i);
			if(i==10)
			break;
		}*/
		
		// Continue
		
		for(int i=0;i<20;i++)
		{
			System.out.println(i);
			if(i==10 || i==11 || i==12)
				continue;
			
			System.out.println("Met continue");
			
		}
		
		
	}	

}
