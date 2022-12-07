package adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Login {

    public boolean login(User user){
        return true;
    }

//    public static void main(String[] args) {
//        TwitterUser t = new TwitterUser("o.maslenchenko@ucu.edu.ua", "Ukraine", "10/11/2022");
//        FacebookUser f = new FacebookUser("o.maslenchenko@ucu.edu.ua", Country.Ukraine, LocalDate.ofYearDay(2022, 11));
//        Login login = new Login();
//        if (login.login(t) == true){
//            System.out.println("User successfully logged in");
//        }
//        if (login.login(FacebookAdapter.adapt(f)) == true){
//            System.out.println("User successfully logged in");
//        }
//    }
}
