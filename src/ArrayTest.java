import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		char c[] = new char[3];
		
		c[0] = '0';
		c[1] = '1';
		c[2] = '2';
		
		System.out.println(c);
		System.out.println(c.length);
		
		//배열객체의 참조값
		System.out.println(System.identityHashCode(c));
		
		//
		String str = new String("Hello");
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		
		int intArray[];
		intArray = new int[10];
		int intArray2[] = new int[20];
		
		int intArray3[] = {0,1,2,3,4,5};
		
//		이런식으로 배열 초기화 불가.
//		int intArray4[];
//		intArray4 = {10,20,30,40,50};
		
		//배열 아웃오브바운스 예외
		try{
			intArray[10] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out of Bound Error");
		}
		
		System.out.println("here");
		
		//Array 유틸리티 클래스 사용
		int intArray5[] = {30,20,15,10,9,0};
		int index = Arrays.binarySearch(intArray5, 15);
		System.out.println("이진 검색 결과 : " + index);
		
		int intArray6[] = {100,20,1500,20,1,5,6};
		Arrays.sort(intArray6);
		System.out.println(intArray6);
		System.out.println(Arrays.toString(intArray6));
		
		int intArray7[] = {1,5,6,20,20,100,1500};
		boolean b = Arrays.equals(intArray6, intArray7);
		System.out.println(b);
		
		Arrays.fill(intArray7, -10);
		System.out.println(Arrays.toString(intArray7));
		
		//배열 복사
		int src[] = {10,20,30,40,50};
		int dest[] = src; //이건 복사가 아니라 레퍼런스 참조를 하나 더 만든것
		int dest2[] = new int[src.length]; //배열 복사
		System.arraycopy(src, 0, dest2, 0, src.length);
		
		//My ArrayUtil 테스트 해보기
		boolean b2 = ArrayUtil.equals(src, dest2);
		System.out.println(b2);
		
		int concatTestArray1[] = {1,2,3,4,5};
		int concatTestArray2[] = {6,7,8,9,0};
		int concatTestArray3[] = ArrayUtil.concat(concatTestArray1, concatTestArray2);
		System.out.println(Arrays.toString(concatTestArray3));
	}
}
