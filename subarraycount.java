import java.util.*;

class subarrayscountk {

	static int countSubarray(int arr[], int n, int k)
	{

		int s = 0;

		int i = 0;
		while (i < n) {
			if (arr[i] > k) {
				i++;
				continue;
			}

			int count = 0;
			while (i < n && arr[i] <= k) {
				i++;
				count++;
			}
			s += ((count * (count + 1)) / 2);
		}

		return (n * (n + 1) / 2 - s);
	}

	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
		int k = 2;
		System.out.print(countSubarray(arr, n, k));
	}
}
