package com.thinkapi.loan_amortisation.model.customer_mgmt;

class CorporateContact {
    private long contactDetailSequence;
    private String website;
    private String secondaryEmail;
    private long primaryContact;
    private String name;
    private long contactBy;
    private long designation;
    private String department;
    private String primaryEmail;

    public long getContactDetailSequence() {
        return contactDetailSequence;
    }

    public void setContactDetailSequence(long value) {
        this.contactDetailSequence = value;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String value) {
        this.website = value;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String value) {
        this.secondaryEmail = value;
    }

    public long getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(long value) {
        this.primaryContact = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public long getContactBy() {
        return contactBy;
    }

    public void setContactBy(long value) {
        this.contactBy = value;
    }

    public long getDesignation() {
        return designation;
    }

    public void setDesignation(long value) {
        this.designation = value;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String value) {
        this.department = value;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String value) {
        this.primaryEmail = value;
    }
}
