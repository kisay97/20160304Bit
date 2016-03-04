
public class ArrayUtil {
	
	public static int[] concat(final int a[], final int b[]){
		int c[];
		int arrayLength;
		
		if(a == null && b != null){
			arrayLength = b.length;
		}
		else if(a != null && b == null){
			arrayLength = a.length;
		}
		else if(a == null && b == null){
			arrayLength = 0;
		}
		else{
			arrayLength = a.length+ b.length;
		}
		
		c = new int[arrayLength];
		
		if(a == null && b != null){
			for(int i=0; i<b.length; i++){
				c[i] = b[i];
			}
			return c;
		}
		
		if(b == null && a != null){
			for(int i=0; i<a.length; i++){
				c[i] = a[i];
			}
			return c;
		}
		
		if(a == null && b == null){
			return null;
		}
		
		for(int i=0; i<a.length; i++){
			c[i] = a[i];
		}
		for(int i=a.length; i<arrayLength; i++){
			c[i] = b[(i-a.length)];
		}
		
		return c;
	}
	
	public static boolean equals(int a[], int b[]){
		if(a == null || b == null){
			return false;
		}
		
		if(a.length != b.length){
			return false;
		}
		
		for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				return false;
			}
		}
		
		return true;
	}
}
