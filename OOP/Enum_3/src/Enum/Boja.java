package Enum;

public enum Boja {

	Crvena(200), Zelena(150), Plava(100), Crna(250), Bela(179), Zuta(124);

	private int udeo;

	Boja(int u) {
		this.udeo = u;
	}

	int getUdeo() {
		return udeo;
	}
}
