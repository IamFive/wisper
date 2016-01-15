package com.woo.wisper.domain;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "public.member")
public class Member {
    @SequenceGenerator(name="",sequenceName="fake_id_seq")
    private Integer id;

    private String name;

    @Column(name = "regist_ip")
    private String registIp;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    private Map profile;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return regist_ip
     */
    public String getRegistIp() {
        return registIp;
    }

    /**
     * @param registIp
     */
    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }

    /**
     * @return created_on
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * @return updated_on
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * @param updatedOn
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * @return is_admin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * @return profile
     */
    public Map getProfile() {
        return profile;
    }

    /**
     * @param profile
     */
    public void setProfile(Map profile) {
        this.profile = profile;
    }
}