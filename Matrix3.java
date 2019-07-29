package chap01;
import java.util.Scanner;
public class Matrix3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int kt=1;
		int kt2=1;
		int[][] a = new int[n][n];
		
		for(int i=0; i < a.length; i++) {
			for(int j =0; j < a.length; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		int c = scan.nextInt();
		//Ma trận tam giác trên
		if(c==1) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < i; j++) {
					if(a[i][j]==0) {
						kt = 1;
					}
					else
					kt = 0;
				}
			}
			if(kt==1) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}	
		//in ra Max các cột ma trận
		if(c==2) {
			for(int k=0; k < n; k++) {
				int max = a[k][0];
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n ; j++) {
						if(j==k && max < a[i][j]) {
							max = a[i][j];
						}
					}
				}	
				System.out.print(max + " ");
			}	
		}
		//cấp số nhân hàng 1
		if(c==3) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n-2; j++) {
					if((float) a[0][j+1] / a[0][j] ==  a[0][j+2] / a[0][j+1]) {
						kt2 = 1;
					}
					else 
						kt2 = 0;
				}
			}
			if(kt2 == 1) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}	
		//xóa cột 1
		if(c==4) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(j!=0) {
						System.out.print(a[i][j] +  " ");
					}
				}
			}
		}	
		//bài toán yên ngựa
		if(c==5) {
			int max[] = new int[n];
			int min[] = new int[n];
			for(int i=0; i<n; i++) {
				min[i]=a[i][0];
				for(int j=0; j<n; j++) {
					if(min[i]>a[i][j]) {
						min[i]=a[i][j];
					}
				}
			}
			for(int j=0; j<n; j++) {
				max[j]=a[0][j];
				for(int i=0; i<n; i++) {
					if(max[j]<a[i][j]) {
						max[j]=a[i][j];
					}
				}
			}
			for(int i=0; i<n;i++) {
				for(int j=0; j<n; j++) {
					if(a[i][j]==max[j] && a[i][j]==min[i]) {
						System.out.print(a[i][j]);
					}
				}
			}
		}
		//Chuyen vi
		if(c==6) {
			int [][]b = new int[n][n];
			for(int i=0; i<n;i++) {
				for(int j=0; j<n; j++) {
					b[j][i]=a[i][j];
				}
			}
			for(int i=0; i<n;i++) {
				for(int j=0; j<n; j++) {
					System.out.print(b[i][j]+ " ");
				}
				System.out.print("\n");
			}
		}
		//Cap so cong
		if(c==7) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n-2; j++) {
					if( a[0][j+1] - a[0][j] ==  a[0][j+2] - a[0][j+1]) {
						kt2 = 1;
					}
					else 	
						kt2 = 0;
				}
			}
			if(kt2 == 1) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}	
		//Sắp xếp hàng 1 giảm dần
		if(c==8) {
			for(int i=0; i<n-1;i++) {
				for(int j=0; j<n-1; j++) {
					int chuyen = 0;
					if(a[0][j]<a[0][j+1]) {
						chuyen=a[0][j+1];
						a[0][j+1] = a[0][j];
						a[0][j] = chuyen;
					}
				}
			}
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(a[i][j]+ " ");
				}
				System.out.print("\n");
			}
		}
	}
}

AAAA6XZNbtc: APA91bHZeipwradHqXM7AFvb7OZgJwSj4nEmb-V6E1t211GTvLPSBCaeaMIBhRAqRE3IEcmEqsF0DOLeJI_epVdhWpbep6Y_GLoxg09XEcgHMACuKqcTivEIb8L38Xiwe7kT-irXpCsE


1002712166103

fa217725-3246-467f-b596-5c9a481c2ebf