public class LC283{
	public static int[] moveZeroes(int[] arr) {
		int current = 0;
		int zeroIndex = arr.length - 1;
		int i = 0;
		while(i<zeroIndex) {
			if (arr[i] == 0) {
				current = i;
				while(current < zeroIndex) {
					arr[current] = arr[current + 1];
					current++;
				}
				arr[zeroIndex] = 0;
				zeroIndex--;
			}
			else {
				i++;
			}
		}
		return arr;
	}
	

    public static void main(String[] args){
	    int[] arr = {0, 1, 0, 3, 12};
	    moveZeroes(arr);
	    int k=0;
	    while(k < arr.length) {
		    System.out.println(arr[k] + " ");
		    k++;
	    }
    }
}
		
	
