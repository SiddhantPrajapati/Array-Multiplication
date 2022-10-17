import java.util.*;
public class ArrayMultiplication {
		
		Scanner sc = new Scanner(System.in);
		void getMatrix(int p){
			ArrayMultiplication mul1 = new ArrayMultiplication();
			int x, y;
			int [][]a = new int [p][p];
			int [][]b = new int [p][p];
			
			System.out.println("Enter the 1st Matrix:");
			for(int i = 0; i < p ; i++ ) {
				for(int j = 0 ; j < p ; j++ ) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the 2nd Matrix:");
			for(int i = 0; i < p ; i++ ) {
				for(int j = 0 ; j < p ; j++ ) {
					b[i][j] = sc.nextInt();
				}
			}
			mul1.arrayMultiplication(a, b, p);
		}
		void arrayMultiplication(int[][] x, int[][] y, int m) {
			int [][]c = new int [m][m];
			for(int i = 0; i < m ; i++ ) {
				for(int j = 0 ; j < m ; j++ ) {
					for(int k = 0 ; k < m ; k++) {
						c[i][j] += x[i][k]*y[k][j];
					}
				}
			}
			System.out.println("Array Multiplication:");
			for(int i = 0; i < m ; i++ ) {
				for(int j = 0 ; j < m ; j++ ) {
					System.out.println(c[i][j]);
				}
			}
		}
		
		public static void main(String []args) {
			Scanner sc = new Scanner(System.in);
			ArrayMultiplication mul = new ArrayMultiplication();
			System.out.println("Enter the number of Row:");
			int x = sc.nextInt();
			mul.getMatrix(x);
		}
	}	