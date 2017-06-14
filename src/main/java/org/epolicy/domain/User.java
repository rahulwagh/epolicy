package org.epolicy.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rahulwagh on 07-06-2017.
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    private String gender;

    private Date dateOfBirth;

    private String address;

    private String cityName;

    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserType userType;

}
