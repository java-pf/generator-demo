package com.demo.model;

public class TableTest {
    private Integer testid;

    private String testname;

    private String testage;

    private String testsex;

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname == null ? null : testname.trim();
    }

    public String getTestage() {
        return testage;
    }

    public void setTestage(String testage) {
        this.testage = testage == null ? null : testage.trim();
    }

    public String getTestsex() {
        return testsex;
    }

    public void setTestsex(String testsex) {
        this.testsex = testsex == null ? null : testsex.trim();
    }
}