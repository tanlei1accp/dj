package com.example.csdj.branch.entity;


import java.math.BigDecimal;

public class Money {
    private int moneyId;
    private int moneyMonth;
    private Member memberId;
    private BigDecimal moneyNumber;

    public int getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }

    public int getMoneyMonth() {
        return moneyMonth;
    }

    public void setMoneyMonth(int moneyMonth) {
        this.moneyMonth = moneyMonth;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getMoneyNumber() {
        return moneyNumber;
    }

    public void setMoneyNumber(BigDecimal moneyNumber) {
        this.moneyNumber = moneyNumber;
    }

    public Money(int moneyId, int moneyMonth, Member memberId, BigDecimal moneyNumber) {
        this.moneyId = moneyId;
        this.moneyMonth = moneyMonth;
        this.memberId = memberId;
        this.moneyNumber = moneyNumber;
    }

    @Override
    public String toString() {
        return "Money{" +
                "moneyId=" + moneyId +
                ", moneyMonth=" + moneyMonth +
                ", memberId=" + memberId +
                ", moneyNumber=" + moneyNumber +
                '}';
    }

    public Money() {
        super();
    }
}
