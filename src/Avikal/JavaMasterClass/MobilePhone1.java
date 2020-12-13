package Avikal.JavaMasterClass;

public class MobilePhone1 implements ITelephone {
	private boolean isRinging;
	private int myNumber;
	private boolean isOn = false;
	
	
	public MobilePhone1(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
	public MobilePhone1(int myNumber, boolean isOn) {
		super();
		this.myNumber = myNumber;
		this.isOn = isOn;
	}

	@Override
	public void powerOn() {
		if(isOn)
			System.out.println("Mobile Phone is On");
		else
			System.out.println("Mobile Phone is off.");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on Mobile Phone");
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
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Ring Ring");
		}
		else{
			isRinging = false;
			System.out.println("Mobile is off or number is incorrect.");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}
	

}
