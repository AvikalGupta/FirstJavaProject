package Avikal.JavaMasterClass;

public class DeskPhoneMain {

	public static void main(String[] args) {
		ITelephone avikalPhone;
		avikalPhone = new DeskPhone(1234567);
		avikalPhone.powerOn();
		avikalPhone.callPhone(567890);
		avikalPhone.answer();
		avikalPhone.dial(1234567);
		
		avikalPhone = new MobilePhone1(234567, true);
		avikalPhone.powerOn();
		avikalPhone.callPhone(908765);
		avikalPhone.dial(98765);
		avikalPhone.answer();
	}
}
