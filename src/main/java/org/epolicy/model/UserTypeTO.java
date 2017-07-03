package org.epolicy.model;

/**
 * Created by rahulwagh on 20-06-2017.
 */
public class UserTypeTO {

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
