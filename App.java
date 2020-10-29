import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row number: ");
		int row=sc.nextInt();
		int col=row+(row-1);
		
		sc.close();
		
		int inc=col,dec=1;
		
		for(int i=1;i<=row;i++) {
			int count=1;
			for(int j=1;j<=col;j++) {
				if(j<=inc && j>=dec) {
					System.out.print(count);
					count++;
				}
				else {
					System.out.print(" ");
				}
			}
			inc--;
			dec++;
			System.out.println();	
		}
		
	}

}
