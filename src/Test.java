import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		s.nextInt();
		String x=s.nextLine();
		String y=s.nextLine();
		System.out.println("x is"+x);
		System.out.println(y);
		if(x.equals(""))
			System.out.println("yes");
	}

}
