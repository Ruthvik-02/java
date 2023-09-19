package program;

import java.util.Scanner;

public class Maxandoccurofaelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max = 0;
        int occur =0;
       for (int i = 0; i <=n; i++) {

                int count =0;
            for (int j = i+1; j <=n; j++) {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>occur){
                    max = arr[i];
                    occur = count;
            }
        }
        System.out.println(max+" "+occur);
        


        // int a[] = {3,2,6,8,1,3,4,6,5,2,2,4,5,2};
		
	// 	int max = 0;
	// 	int freq = 0;
	// 	for(int i=0;i<a.length;i++){
			
	// 		int count = 0;
	// 		for(int j=0;j<a.length;j++){
	// 			if(a[i]==a[j])
	// 			count++;
	// 		}
			
	// 		if(count>freq){
	// 			max = a[i];
	// 			freq = count;
	// 		}
        // 3 2 6 8 1 3 4 6 5 2 2 4 5 2

	// 	}
	// 	System.out.println(max+" "+freq);
    }
}
