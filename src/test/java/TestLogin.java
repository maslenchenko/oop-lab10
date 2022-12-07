import adapter.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestLogin {
    @Test
    public void testLogin() {
        TwitterUser t = new TwitterUser("o.maslenchenko@ucu.edu.ua", "Ukraine", "10/11/2022");
        FacebookUser f = new FacebookUser("o.maslenchenko@ucu.edu.ua", Country.Ukraine, LocalDate.ofYearDay(2022, 11));
        Login login = new Login();
        Assertions.assertEquals(true, login.login(t));
        Assertions.assertEquals(true, login.login(FacebookAdapter.adapt(f)));
    }
}
