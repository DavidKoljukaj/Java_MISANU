package paket;

public class FinallyBlokMain {

	public static void main(String[] args) {

		FinallyBlokWithException fbwe = new FinallyBlokWithException();
		try {
			fbwe.procA();
		} catch (Exception e) {
			System.out.println("Exception caught " + e.getMessage());
		}

		fbwe.procB();
		fbwe.procC();
	}

}
