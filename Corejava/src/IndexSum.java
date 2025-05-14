import java.util.*;
import java.util.Arrays;
public class IndexSum {

	public static void main(String[] args) {
		int[] arr= {2,13,7,11};
		int target=9;
		System.out.println(Arrays.toString(returnIndex(arr,target)));
	}
	public static int[] returnIndex(int[] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			int diff=target-arr[i];
			for(int j=i+1;j<arr.length;j++) {
			if(arr[j]==diff) {
				return new int[] {i,j};
			
		}
			}
		

	}
		return null;
	}
}


