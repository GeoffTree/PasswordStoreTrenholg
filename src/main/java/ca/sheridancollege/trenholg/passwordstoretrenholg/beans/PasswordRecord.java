package ca.sheridancollege.trenholg.passwordstoretrenholg.beans;

import ca.sheridancollege.trenholg.passwordstoretrenholg.utilities.RandomNumberGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Random;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordRecord {

    @Id
    @NonNull
    private Long ID;

    private String Title;
    private String Username;
    private String Password;
    private String Url;
    private String Email;
    private String Notes;

    public PasswordRecord(final String title, String username, final String password, final String url, final String email, final String notes) {
        this.ID = RandomNumberGenerator.genLongID();
        this.Title = title;
        this.Username = username;
        this.Password = password;
        this.Url = url;
        this.Email = email;
        this.Notes = notes;
    }

}
