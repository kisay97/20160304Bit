
public class NumberTriangle {

	public static void printN(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%d",i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printN(15);
	}

}
