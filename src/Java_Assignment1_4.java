import java.util.*;
public class Java_Assignment1_4 
{


	public static void main(String[] args)	
	{
		//byte, short, int, long, float and double. Initialize only byte
		//and short asking the value from the user.
		byte VarByte;
		short VarShort;
		int VarInt;
		long VarLong;
		float VarFloat;
		double VarDouble;
		
		Scanner Sc;
		Sc=new Scanner(System.in);
		System.out.print(" Enter a byte value: ");
		VarByte = Sc.nextByte();
		System.out.print(" Enter a short value: ");
		VarShort = Sc.nextShort();
		
		VarInt= (int)VarByte + (int)VarShort;
		System.out.println(" Sum of "+VarByte+" and "+ VarShort+ " in int variable: "+ VarInt);
		
		VarLong= (long)VarInt + (long)VarShort;
		System.out.println(" Sum of "+VarInt+" and "+ VarShort+ " in long variable: "+ VarLong);
		
		VarFloat= (float)VarLong + (float)VarInt;
		System.out.println(" Sum of "+VarLong+" and "+ VarInt+ " in float variable: "+ VarFloat);
		
		VarDouble= (double)VarFloat + (double)VarLong;
		System.out.println(" Sum of "+VarFloat+" and "+ VarLong+ " in double variable: "+ VarDouble);
		
		Sc.close();
	}

}
