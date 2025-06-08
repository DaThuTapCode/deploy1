package com.trongphu.deploy1.Entity;

import java.util.List;

public class Parent {
    private String sn;
    private List<AttendanceData> record;


    public Parent(){}

    public Parent(String sn, List<AttendanceData> record) {
        this.sn = sn;
        this.record = record;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public List<AttendanceData> getRecord() {
        return record;
    }

    public void setRecord(List<AttendanceData> record) {
        this.record = record;
    }
}
