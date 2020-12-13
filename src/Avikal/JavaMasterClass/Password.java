package Avikal.JavaMasterClass;

public class Password {
    private static final int key = 78987654;
    private int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Opppss!! Wrong Password.");
            return false;
        }
    }

    public boolean changePassword(int oldPassword, int newPassword){
        if(letMeIn(oldPassword)){
            this.encryptedPassword = encryptDecrypt(newPassword);
            System.out.println("Password changed to " + this.encryptedPassword);
            return true;
        }
        return false;
    }
}
