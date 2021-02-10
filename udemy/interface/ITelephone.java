public interface ITelephone {

	void powerOn();
	public abstract	boolean callPhone(int phoneNumber);
	abstract void answer();
	public boolean isRinging();
}