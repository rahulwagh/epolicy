package org.epolicy.model;

/**
 * Created by rahulwagh on 20-06-2017.
 */
public class CountryTO {

    private Long id;

    private String iso;

    private String name;

    private String nicename;

    private String iso3;

    private Long numcode;

    private Long phonecode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNicename() {
        return nicename;
    }

    public void setNicename(String nicename) {
        this.nicename = nicename;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public Long getNumcode() {
        return numcode;
    }

    public void setNumcode(Long numcode) {
        this.numcode = numcode;
    }

    public Long getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(Long phonecode) {
        this.phonecode = phonecode;
    }
}
