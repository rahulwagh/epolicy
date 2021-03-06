package org.epolicy.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by rahulwagh on 07-06-2017.
 */
/*@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter*/
@Entity
@Table(name = "user_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userType;

    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
