import java.util.ArrayDeque;



public class IterativeMergeSort {
	public static void main(String[] args) {
		int[] sort = new int[] { 10, 2, 5, 3, 7, 13, 1, 6 };
		IterativeMergeSort m = new IterativeMergeSort();
		int[] r = m.mergeSort(sort);
		m.log(r, "R");
		
	}

	public int[] mergeSort(int[] a) {
		ArrayDeque<int[]> q = new ArrayDeque<int[]>();
		for(int i = 0; i< a.length; i++) {
			q.push(new int[] { a[i]});
		}
		while(q.size() > 1) {
			q.push(merge(  q.pop() ,   q.pop() ));
		}
		
		return q.pop();
		
	}
	
	private int[] merge(int[]left, int[]right) {
		if( left .length == 0) {
			return right;
		}
		if( right .length == 0) {
			return left;
		}
		int[] m = new int[left.length + right.length];
		if(left[0] <= right[0]) {
			// m = left[0] ::  merge (left[1...k] , right[0...l])
			m[0] = left[0];
			int[] nleft = new int[left.length - 1];
			System.arraycopy(left, 1, nleft, 0, left.length - 1);
			int[] merge = merge(nleft, right);
			System.arraycopy(merge, 0, m, 1, merge.length); 
		} else {
			// m = right[0] :: merge( left[0...k] , right[1...l])
			m[0] = right[0];
			int[] nright = new int[right.length - 1];
			System.arraycopy(right,  1, nright, 0, right.length - 1);
			int[] merge = merge(left,nright);
			System.arraycopy(merge, 0, m, 1, merge.length);
		}
		log(m, "+");
		return m;
	}
	private void log(int[] a, String msg) {
		System.out.print(msg + " ");
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
