import java.util.Scanner;

public class counts {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean x = true;
		int y = 0;
		int sum = 0;
		
		while(x){
			System.out.println("Enter a natural number (-3 to print, -2 to reset, -1 to quit)");
			y = scan.nextInt();
			if((y != 0) && (y != -1) && (y != -2) && (y != -3) && (y > 0)){
				sum = sum + y;
				continue;
			}
			
			if(y == -1){
				x = false;
			}
			
			if(y == -2){
				sum = 0;
			}
			
			if(y == -3){
				System.out.println("Sum: " + sum);
			}
	
		}
	}

}
