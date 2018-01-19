package Others;

public class SeparatingStudents {
	
	public int minMoves(int[] list) {
		int swap1 = 0, count1 = 0, count0 = 0, swap0 = 0;
		int length = list.length;
		for (int j = length - 1 ; j >= 0; j--) {
			if(list[j] == 0)
				count0++;
			else
				swap0 += count0;
		}
		
		for (int j = length - 1 ; j >= 0; j--) {
			if(list[j] == 1)
				count1++;
			else
				swap1 += count1;
		}
		
		return Math.min(swap0, swap1);
	
	}
}
