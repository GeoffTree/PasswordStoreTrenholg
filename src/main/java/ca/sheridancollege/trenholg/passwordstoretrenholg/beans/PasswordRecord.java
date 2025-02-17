package ca.sheridancollege.trenholg.passwordstoretrenholg.beans;

import ca.sheridancollege.trenholg.passwordstoretrenholg.utilities.RandomNumberGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Random;

@Entity
@Table(name= "Passwords")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordRecord {

    @Id
    @NonNull
    private Long ID;

    @Column(name= "title")
    private String title;

    private String username;
    private String password;
    private String url;
    private String email;
    private String notes;

    public PasswordRecord(final String title, String username, final String password, final String url, final String email, final String notes) {
        this.ID = RandomNumberGenerator.genLongID();
        this.title = title;
        this.username = username;
        this.password = password;
        this.url = url;
        this.email = email;
        this.notes = notes;
    }

}
