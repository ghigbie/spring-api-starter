package georgehigbie.com.starterapi.shared.dto;

public class UserDto {

    private static final long serialVersionUID = 4865903039190150223L;
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailverificationToken;
    private Boolean emailverificationStatus;
}
