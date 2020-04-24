package rotate;

public class RotateArray {
	
	public static void rotate(int[] A, int N, int K) {
		
		K %= N;
		reverse(A, 0, N-1);
		reverse(A, 0, K-1);
		reverse(A, K, N-1);
	}
	
	private static void reverse(int[] A, int left, int right) {
		while(left < right) {
			A[left] = A[left]^A[right];
			A[right] = A[left]^A[right];
			A[left] = A[left++]^A[right--];
		}
	}
	
	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,5,6};
		
		rotate(A, 6, 3);
		
		for(int i = 0; i < 6; i++) {
			System.out.println(A[i]);
		}
	}
}
