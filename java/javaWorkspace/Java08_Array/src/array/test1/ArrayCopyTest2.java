package array.test1;
/*
 * �迭�� ����� ������ �� ������
 * ����� �ٸ� �迭�� ��Ҹ� copy ���� ������ ���� �ִ�.
 */

public class ArrayCopyTest2 {

	public static void main(String[] args) {
		int [ ] target = {1,2,3,4,5,6};
		int [ ] source = {10,9,8,7,6,5,4,3,2,1};
		
		System.arraycopy(source, 2, target, 1, 3);
		// �迭 source���� �����ؿ� �ǵ� 2��° �ε������� ������ ���̴�.
		// �׸��� �װ� �迭 target�� �ٿ��ֱ� �� �ǵ� 1��° �ε������� �ٿ����� ���̸� ���޾Ƽ� 3���� �ٿ����� ���̴�. 
		// �̷��� �Ǹ� �迭 target���� -> 0,4,5��° �ε����� �״����.
		for(int i : target) System.out.print(i + " ");
		//1 8 7 6 5 6  ���
	}
}