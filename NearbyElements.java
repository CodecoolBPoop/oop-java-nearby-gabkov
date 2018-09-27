import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class NearbyElements{
	
	private int[][] multi = new int[][]{
        { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
        { 1, 3, 5, 7 },
        { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
	};
	
	public int[] nearby(int x, int y, int range){
		int[] theRow = multi[x];
		int[] rightResult = ArrayUtils.subarray(theRow, y+1, range+y+1);
		
		ArrayUtils.reverse(theRow);
		
		int[] leftResult = ArrayUtils.subarray(theRow, theRow.length-y, range+theRow.length-y+1);
		ArrayUtils.reverse(leftResult);
		
		int[] result = ArrayUtils.addAll(leftResult, rightResult);
		
		return result;
	}

   public static void main(String []args) {
	   NearbyElements obj = new NearbyElements();
	   System.out.println(Arrays.toString(obj.nearby(0, 2, 2)));
	   
	   NearbyElements obj1 = new NearbyElements();
	   System.out.println(Arrays.toString(obj1.nearby(1, 0, 1)));
	   
	   NearbyElements obj2 = new NearbyElements();
	   System.out.println(Arrays.toString(obj2.nearby(1, 3, 5)));
	   
	   NearbyElements obj3 = new NearbyElements();
	   System.out.println(Arrays.toString(obj3.nearby(0, 2, 50)));
   }
}