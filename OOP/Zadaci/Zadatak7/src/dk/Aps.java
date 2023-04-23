package dk;

public class Aps {

	double vrednost;

	Aps(double v) {
		this.vrednost = v;
		if (vrednost < 0)
			vrednost = vrednost * (-1.0);
	}

}
