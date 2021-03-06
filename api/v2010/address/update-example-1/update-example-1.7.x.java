// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Address;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Address address = Address.updater("AD2a0747eba6abf96b7e3c3ff0b4530f6e")
            .setCustomerName("Customer 456")
            .setStreet("2 Hasselhoff Lane")
            .update();

        System.out.println(address.getCustomerName());
    }
}