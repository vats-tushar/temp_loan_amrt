package com.thinkapi.loan_amortisation.model.customer_mgmt;

class EmployeeDetails {
    private long salaryRange;
    private long scraEligibility;
    private long retirementAge;
    private String currentEmployementSince;
    private String entityCode;
    private String employeeReference;
    private long employerType;
    private long occuptionCodeCd;
    private long customerReference;
    private String employerName;
    private long incomeSource;
    private long yearlySalary;

    public long getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(long value) {
        this.salaryRange = value;
    }

    public long getScraEligibility() {
        return scraEligibility;
    }

    public void setScraEligibility(long value) {
        this.scraEligibility = value;
    }

    public long getRetirementAge() {
        return retirementAge;
    }

    public void setRetirementAge(long value) {
        this.retirementAge = value;
    }

    public String getCurrentEmployementSince() {
        return currentEmployementSince;
    }

    public void setCurrentEmployementSince(String value) {
        this.currentEmployementSince = value;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    public String getEmployeeReference() {
        return employeeReference;
    }

    public void setEmployeeReference(String value) {
        this.employeeReference = value;
    }

    public long getEmployerType() {
        return employerType;
    }

    public void setEmployerType(long value) {
        this.employerType = value;
    }

    public long getOccuptionCodeCd() {
        return occuptionCodeCd;
    }

    public void setOccuptionCodeCd(long value) {
        this.occuptionCodeCd = value;
    }

    public long getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(long value) {
        this.customerReference = value;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String value) {
        this.employerName = value;
    }

    public long getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(long value) {
        this.incomeSource = value;
    }

    public long getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(long value) {
        this.yearlySalary = value;
    }
}
