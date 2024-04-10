import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DeleteDuplicateElement {
	public static void main(String[]args) {
		List<Integer> list = Arrays.asList(1,2,1,3,4);
		ArrayList<Integer> updateList = new ArrayList<Integer>();

		for(int i : list) {

			if(!updateList.contains(i)) {      //updateList la "i"value illa na apdina indha condition ennaku true agum irrundhuchi na false agum..
				updateList.add(i);
			}
		}
System.out.println(updateList);
	}
}