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
		
		//�迭��ü�� ������
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
		
//		�̷������� �迭 �ʱ�ȭ �Ұ�.
//		int intArray4[];
//		intArray4 = {10,20,30,40,50};
		
		//�迭 �ƿ�����ٿ ����
		try{
			intArray[10] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out of Bound Error");
		}
		
		System.out.println("here");
		
		//Array ��ƿ��Ƽ Ŭ���� ���
		int intArray5[] = {30,20,15,10,9,0};
		int index = Arrays.binarySearch(intArray5, 15);
		System.out.println("���� �˻� ��� : " + index);
		
		int intArray6[] = {100,20,1500,20,1,5,6};
		Arrays.sort(intArray6);
		System.out.println(intArray6);
		System.out.println(Arrays.toString(intArray6));
		
		int intArray7[] = {1,5,6,20,20,100,1500};
		boolean b = Arrays.equals(intArray6, intArray7);
		System.out.println(b);
		
		Arrays.fill(intArray7, -10);
		System.out.println(Arrays.toString(intArray7));
		
		//�迭 ����
		int src[] = {10,20,30,40,50};
		int dest[] = src; //�̰� ���簡 �ƴ϶� ���۷��� ������ �ϳ� �� �����
		int dest2[] = new int[src.length]; //�迭 ����
		System.arraycopy(src, 0, dest2, 0, src.length);
		
		//My ArrayUtil �׽�Ʈ �غ���
		boolean b2 = ArrayUtil.equals(src, dest2);
		System.out.println(b2);
		
		int concatTestArray1[] = {1,2,3,4,5};
		int concatTestArray2[] = {6,7,8,9,0};
		int concatTestArray3[] = ArrayUtil.concat(concatTestArray1, concatTestArray2);
		System.out.println(Arrays.toString(concatTestArray3));
	}
}
