package Avikal.JavaMasterClass;

public class DeskPhone implements ITelephone{

	private boolean isRinging;
	private int myNumber;
	
	
	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken bcz desk phone does not have power button.");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskPhone");
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the call");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring Ring");
		}
		else{
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}
	
}
