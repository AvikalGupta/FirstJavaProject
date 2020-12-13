package Avikal.JavaMasterClass;

public class PasswordAccess {

    public static void main(String[] args) {
        Password password = new Password(12345);
        password.letMeIn(2345);
        password.letMeIn(98760);
        password.storePassword();
        password.letMeIn(12356);
        password.storePassword();
        password.letMeIn(12345);
        password.changePassword(12346, 89876);
        password.changePassword(12345, 98765);
        password.letMeIn(12345);
        password.letMeIn(98765);
//        ps.storePassword();

    }
}
