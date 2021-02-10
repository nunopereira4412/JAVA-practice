public abstract class DeskPhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;

	public void powerOn() {

	}

	public void answer() {

	}

	public boolean callPhone(int phoneNumber) {
		return false;
	}

	public boolean isRinging() {
		return false;
	}
}

// in the main, i can create a variable of interface type isntead of class type
// int order to reuse the variable to make various "new" for differente classes
// , and it will still work. Instead of creating a variable of class type 
// every time i want to use the methods from the interface on each dif class