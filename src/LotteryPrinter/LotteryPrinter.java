package LotteryPrinter;
import java.util.Random;

public class LotteryPrinter
{
	public static void main(String[] args)
	{
		Random randomNumber = new Random();
		int n1 = randomNumber.nextInt(49)+1;
		int n2 = randomNumber.nextInt(49)+1;
		int n3 = randomNumber.nextInt(49)+1;
		int n4 = randomNumber.nextInt(49)+1;
		int n5 = randomNumber.nextInt(49)+1;
		int n6 = randomNumber.nextInt(49)+1;
		System.out.println("Play this combination! it'll make you rich!");
		System.out.println(n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6 + ".");
	}
}
