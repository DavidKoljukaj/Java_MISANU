package paket;

public class InvalidAgeException extends Throwable {

	private int age;

	public InvalidAgeException(int a) {
		age = a;
	}

	public String toString() {
		return "Age: " + age + " is not a valid age.";
	}
}
