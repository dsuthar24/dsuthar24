
public class FirstJavaClass {

	public static void main(String[] args) {
		
		System.out.println("Hey Dhruv");
		
		byte a=-128; //8 bit
		short sh=-32768; // 2 bytes or 16 bit
		int abc=2147483; //32-bit or 4 byte 2 short
		long lg=55; //64 bit or 8 byte or 2 int or 4 short
		//precision number - Decimal Value
		float fl=100.78f; //32-bit IEEE followed by f
		double dl=100.8989;//64-bit IEE
		//char
		char ch = '9';
		int  d = (int) (ch+dl+fl+abc+a+sh+lg);
		System.out.println(d);
		//boolean
		//boolean b = true;
		
		String str = "java class"+ch+ ((char)65);
		System.out.println(str);
		
		
	}

}
