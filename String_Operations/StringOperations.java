
public class StringOperations {

	public static void main(String[] args) {
		
	//String is Class
		
		
		// length of string
		String str="  This is Java Class  ";
		int i=str.length();
		System.out.println(i);
		
		//trim
		i=str.trim().length();
		System.out.println(i);
		
		//Concat or +
		String str1= str.trim() +" "+ "July";
		System.out.println(str1);
		
		String str2= str.trim().concat(" ").concat("July");
		System.out.println(str2);
		
		//Split
		String str3="This is java class from 17 July 2022 at westmore dr and fee is $600";
		String[] spl=str3.split(" ");
		int count=0;
		for(String s:spl)
		{
			System.out.println("["+count+"]-->"+s);
			count++;
		}
		
		
		//Substring
		
		String course = spl[2];
		System.out.println("["+course+"]-->"+ course);
		String date= spl[5]+" - "+spl[6].substring(0,3)+" - "+spl[7];
		System.out.println("["+date+"]-->"+date);
		String loc = spl[9]+ " "+spl[10];
		System.out.println("["+loc+"]-->"+loc);
		String fee= spl[14].substring(1);
		System.out.println("["+fee+"]-->"+fee);
		double tax= Double.parseDouble(fee)* 0.13 +Double.parseDouble(fee) ;
		System.out.println(tax);
		
		System.out.println(fee+(tax+100+80));
		
	
		//compare
		
		
		//equals, EqualsIgnorecare, lowercasem, Uppercase,Startswith, Endwith

	}

}
