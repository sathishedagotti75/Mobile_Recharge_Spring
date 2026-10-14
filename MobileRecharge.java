package com.sathish.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class MobileRecharge {

    private int rechargeId;

    @NotBlank(message = "Mobile number is required")
    @Pattern(
        regexp = "^[986][0-9]{9}$",
        message = "Mobile number must contain 10 digits and start with 9, 8, or 6"
    )
    private String mobileNumber;

    @NotBlank(message = "Operator is required")
    private String operator;

    @Min(value = 10, message = "Minimum recharge amount is 10")
    private int amount;

    @NotBlank(message = "Plan type is required")
    private String planType;

    public int getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(int rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
}
