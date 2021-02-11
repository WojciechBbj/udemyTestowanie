import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void newAccountShouldNotBeActiveAfterCreation() {
        //given
        //when
        Account newAccount = new Account();
        //then
        assertThat(newAccount.isActive()).isFalse();
    }

    @Test
    void accountShouldBeActiveAfterActivation()  {
        //given
        Account newAccount = new Account();
        //when
        newAccount.activate();
        //then
        assertThat(newAccount.isActive()).isTrue();
    }

    @Test
    void newCreatedAccountShouldNotHaveDefaultDeliveryAddressSet() {
        //given
        Account newAccount = new Account();

        //when
        Address address = newAccount.getDefaultDeliveryAddress();

        //then
        //assertThat(address).isNull();
        assertThat(address).isNull();
    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet() {
        //given
        Address address = new Address("Main", 9);
        Account newAccount = new Account();

        newAccount.setDefaultDeliveryAddress(address);

        //when
        Address defaultAddress = newAccount.getDefaultDeliveryAddress();

        //then
        assertThat(defaultAddress).isNotNull();
    }
}
