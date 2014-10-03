public class hrcalc {
public static void main (String[] args){

	int num = 5000;
	int hrs;
	int min;
	int sec;
	int rem1;


	hrs = num / 3600;
	rem1 = num % 3600;
	min =	rem1 / 60;
	sec = rem1 % 60;
			
	System.out.println("hours:" + hrs);
	System.out.println("minuets:" + min);
	System.out.println("seconds:" + sec);
	
		}
	}