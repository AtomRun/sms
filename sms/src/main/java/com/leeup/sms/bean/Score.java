package com.leeup.sms.bean;

import java.math.BigDecimal;

public class Score extends ScoreKey {
    private String term;

    private BigDecimal score;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}