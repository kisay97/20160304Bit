
public class Echo {

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		String sArray[] = new String[3];
		for (String sArrayElement : sArray) {
			System.out.println(sArrayElement);
		}
		
		Echo classArray[] = new Echo[3];
		for (Echo echoElement : classArray) {
			System.out.println(echoElement);
		}
	}

}