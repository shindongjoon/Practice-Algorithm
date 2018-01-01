import java.util.ArrayList;
import java.util.Arrays;

public class code6_Permutation {

	public static int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	public static int n;
	public static int r;
	public static int res[];
	public static ArrayList<Integer> arr;
	public static ArrayList<int[]> arr2;

	public static void chogi(ArrayList<Integer> arr) {
		n = a.length;
		for (int i : a) {
			arr.add(i);
		}
	}

	public static void perm(ArrayList<Integer> arr, int depth) {
		
		if (depth == r) {
			int res2[] = new int[r];
			System.arraycopy(res, 0, res2, 0, res.length);
			arr2.add(res2);
			return;
		}
		
		for (int i = 0; i < n - depth; i++) {
			res[depth] = arr.remove(i); 
			perm(arr, depth + 1); 
			arr.add(i, res[depth]); 
		}
	}

	public static void main(String[] args) {

		arr = new ArrayList<Integer>();
		arr2 = new ArrayList<int[]>();
		r=3;
		chogi(arr);
		res = new int[r];
		perm(arr, 0);
		
		for(int i = 0 ; i < arr2.size(); i ++) {
			System.out.println(Arrays.toString(arr2.get(i)));
		}
	}
}