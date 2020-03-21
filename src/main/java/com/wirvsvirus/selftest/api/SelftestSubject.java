package com.wirvsvirus.selftest.api;

import com.wirvsvirus.selftest.api.enums.AccessDevice;
import com.wirvsvirus.selftest.api.selftest.Selftest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Justus Schneider
 */


//Represents a user checking his symptoms
public class SelftestSubject extends BaseDto {

    private String zipCode;
    private String city;
    private AccessDevice accessDevice;
    private String deviceID;
    //Order By Date asc
    private List<Selftest> selftests;
    private Contact contact;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AccessDevice getAccessDevice() {
        return accessDevice;
    }

    public void setAccessDevice(AccessDevice accessDevice) {
        this.accessDevice = accessDevice;
    }

    public List<Selftest> getSelftests() {
        return selftests;
    }

    public void setSelftests(List<Selftest> selftests) {
        if(this.selftests == null) {
            this.selftests = new ArrayList<>();
        }
        this.selftests = selftests;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }
}
