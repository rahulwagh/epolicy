package org.epolicy.entity;

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
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue
    private long id;

    private String countryName;

}
