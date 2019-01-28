import java.util.Arrays;

public class Main {

	int[] currentSelected = null;

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5}; 
        int n = arr.length; 
        int sum = 10; 
        boolean[] currentPath = new boolean[arr.length]; 
		
        subset(arr, n-1, sum, currentPath);
		
	}

	public static void subset(int[] input, int n, int sum, boolean[] currentPath) {
		if (sum == 0) {
			System.out.println("Hurrayyyy");
			printMeSubset(input , currentPath);
		}
		if (n < 0 || sum < 0) {
			return ;
		}
		
		currentPath[n] = true;
		subset(input, n - 1, sum - input[n], currentPath);
		currentPath[n] = false;
		
		subset(input, n - 1, sum, currentPath);
	}

	public static void printMeSubset(int[] input, boolean[] selectedNumbers) {
		/*for (int i = 0; i < input.length; i++) {
			if(selectedNumbers[i]){
				System.out.print(input[i]);
			}
		}*/
			System.out.print(Arrays.toString(input));
			System.out.println(Arrays.toString(selectedNumbers));
		
		System.out.println();
	}
	
	

}
