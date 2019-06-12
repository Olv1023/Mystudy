
public class MagicSquare {
	
	// 마방진 그리기
	// 각 행,열(n)의 합 => n(n^2 + 1)/2
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int hang = 0;
		int yeol = 2;
		
		// 처음 시작 위치 (1, 3)
		//arr[0][2] = 1;
		for (int i = 1; i <= 25; i++) {
			arr[hang][yeol] = i;
			int ihang = hang - 1;
			int iyeol = yeol + 1;
			if (ihang == -1) {
				ihang = 4;
			}
			if (iyeol == 5) {
				iyeol = 0;
			}
			if (arr[ihang][iyeol] == 0) {
				hang = ihang;
				yeol = iyeol;
			}
			else hang++;
		}
		for (int ihang = 0; ihang <=4; ihang++) {
			for (int iyeol = 0; iyeol <=4 ; iyeol++ ) {
				System.out.print(arr[ihang][iyeol] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
}
