 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class code6_Combination {

	public static int n;
	public static int r;
	public static int depth;
	public static int[] res;
	public static ArrayList<Integer> list;
	public static ArrayList<ArrayList> resarr;
	
	public static void combination(ArrayList<Integer> arr, int n, int r, int dpeth) {

		if (r == depth) {
			ArrayList arr2 = new ArrayList();
			arr2.addAll(arr);
			resarr.add(arr2);
			return;
		}

		for (int i = dpeth; i < n; i++) {
			arr.add(i);
			combination(arr, n, r - 1, i + 1);
			arr.remove(arr.size() - 1);
		}
	}

	public static void main(String[] args) {
		list = new ArrayList<Integer>();
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		n = a.length;
		r = 3;
		depth = 0;
		resarr= new ArrayList<ArrayList>();
		
		res= new int[r];
		combination(list, n, r, depth);
		
		for(int i = 0 ; i < resarr.size(); i ++) {
			System.out.println(resarr.get(i));
		}
		
	}
}