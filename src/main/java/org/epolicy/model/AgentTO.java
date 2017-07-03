package org.epolicy.model;

import java.util.Date;

/**
 * Created by rahulwagh on 14-06-2017.
 */
public class AgentTO {

    private long id;

    private String firstName;

    private String lastName;

    private String gender;

    private Date dateOfBirth;

    private String address;

    private String cityName;

    private CountryTO country;

    private UserTypeTO userType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public CountryTO getCountry() {
        return country;
    }

    public void setCountry(CountryTO country) {
        this.country = country;
    }

    public UserTypeTO getUserType() {
        return userType;
    }

    public void setUserType(UserTypeTO userType) {
        this.userType = userType;
    }
}
