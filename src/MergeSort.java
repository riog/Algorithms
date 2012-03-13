import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeSort {
	int[] mergeSort(int[] a) {
		
		if(a.length <= 1) {
			return a;
		}
		int mid = a.length / 2 ;
		int[] left = new int[mid];
		int[] right = new int[a.length - mid];
		System.arraycopy(a, 0, left, 0, mid - 1);
		System.arraycopy(a, mid, right, 0, a.length - mid);
		return merge( mergeSort( left) , mergeSort(right));
	}
	int[] merge(int[]left, int[]right) {
		if(left.length == 0) {
			return left;
		}
		if(right.length == 0) {
			return right;
		}
		if(left[0] <= right[0]) {
			int[] m = new int[1 + left.length - 1 + right.length];
			m[0] = left[0];
			System.arraycopy(left, 1, m, 1, left.length - 1);
			return m;
		} else {
			int[] m = new int[1 + left.length - 1 + right.length];
			m[0] = left[0];
			System.arraycopy(left, 1, m, 1, left.length - 1);
			return m;
		}
	}
}
