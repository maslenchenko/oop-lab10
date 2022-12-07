package adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TwitterUser implements User{
    private String userMail;
    private String country;
    private String lastActiveTime;
}
