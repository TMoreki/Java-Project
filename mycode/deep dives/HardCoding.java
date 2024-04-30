public class HardCoding{
	public static void main(String [] args){

		int[][][] array3D = new int[10][8][6];
		int[][]   array2D = new int[10][8];

		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				for(int k = 0; k < 6; k++){
				}
				array3D[i][j][k] = (int)(Math.random() * 100);
			}
			array2D[i][j] = (int)(Math.random() * 100);

		}
		System.out.println("3D");
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				for(int k = 0; k < 6; k++){
					System.out.print(array3D[i][j][k] + " ");
				}
				System.out.print();
			}
			System.out.print();
		}
		System.out.println("2D");
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}

	}
}