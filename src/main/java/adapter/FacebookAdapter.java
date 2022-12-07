package adapter;

import java.time.LocalDate;

public class FacebookAdapter implements User{
    private static String email;
    private static String country;
    private static String userActiveTime;

    public static TwitterUser adapt(FacebookUser user){
        email = user.getEmail();
        country = user.getUserCountry().toString();
        userActiveTime = user.getGetUserActiveTime().toString();
        TwitterUser twitterUser = new TwitterUser(email, country, userActiveTime);
        return twitterUser;
    }

}
