package org.epolicy.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by rahulwagh on 07-06-2017.
 */
@Data
@Entity
@Table(name = "user_type")
public class UserType {

    @Id
    @GeneratedValue
    private long id;

    private String userType;

    private String description;
}