package dk;

public class Matrica {
	private int red, kolona;
	private int[][] matrica = new int[red][kolona];

	Matrica(int r, int k) {
		this.red = r;
		this.kolona = k;
		this.matrica = new int[red][kolona];
	}

	public void setElement(int i, int j, int br) {
		matrica[i][j] = br;
	}

	public void getElement(int i, int j) {
		System.out.print(matrica[i][j] + " ");

	}
}
