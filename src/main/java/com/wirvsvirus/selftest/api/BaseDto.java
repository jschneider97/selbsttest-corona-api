package com.wirvsvirus.selftest.api;

import java.util.Date;

/**
 * @author Justus Schneider
 */

public abstract class BaseDto {

    private Date createDate;
    private Date updateDate;
    private int version;

    //TODO: Have this in BaseDto or in the entities?
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
