package com.tsl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CampaignContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "company_id", nullable = false)
    private CampaignCompanyDetails company;

    private String first_name;
    private String last_name;
    private String email_id; 
    private String designation;
    private String direct_number;
    private String mobile_number;

    public CampaignContactDetails() {
        super();
    }

    public CampaignContactDetails(Integer id, CampaignCompanyDetails company, String first_name, String last_name, String email_id,
                                  String designation, String direct_number, String mobile_number) {
        super();
        this.id = id;
        this.company = company;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id = email_id;
        this.designation = designation;
        this.direct_number = direct_number;
        this.mobile_number = mobile_number;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CampaignCompanyDetails getCompany() {
        return company;
    }

    public void setCompany(CampaignCompanyDetails company) {
        this.company = company;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDirect_number() {
        return direct_number;
    }

    public void setDirect_number(String direct_number) {
        this.direct_number = direct_number;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    @Override
    public String toString() {
        return "CampaignContactDetails [id=" + id + ", company=" + company + ", first_name=" + first_name
                + ", last_name=" + last_name + ", email_id=" + email_id + ", designation=" + designation
                + ", direct_number=" + direct_number + ", mobile_number=" + mobile_number + "]";
    }


}
