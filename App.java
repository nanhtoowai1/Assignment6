public class App {

	public static void main(String[] args) {
		int inc=10,dec=0;
		
		for(int i=1;i<=5;i++) {
			int count=1;
			for(int j=1;j<=9;j++) {
				if(j<inc && j>dec) {
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
