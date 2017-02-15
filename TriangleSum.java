import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class TriangleSum{

static int maxSum(int array[][]){
        int out;
	for(int i=1;i<100;i++){
		for(int j=0;j<=i;j++){
			if(j==0){
				array[i][j] = array[i][j] + array[i-1][j];
			}
			else if(j==i){
				array[i][j] = array[i][j] + array[i-1][j-1];
			}
			else{
				array[i][j] = array[i][j] + Math.max(array[i-1][j],array[i-1][j-1]);
			}	
		}
	}

	out = array[99][0];
	for(int i=1;i<100;i++){
	       out = Math.max(out,array[99][i]);
	}
	return out;
}

public static void main(String [] args) throws IOException{
	Scanner s = new Scanner(new File("Triangle.txt"));
	int array[][] = new int[100][];

	for(int i=0;i<100;i++){
	 	array[i] = new int[i+1];
	}
	
	for(int i=0;i<100;i++){
		for(int j=0;j<=i;j++){
			array[i][j] = s.nextInt();
		}
	}

	int sum = maxSum(array);
	System.out.println(sum);
	
	}
}
