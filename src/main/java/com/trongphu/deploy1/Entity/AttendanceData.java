package com.trongphu.deploy1.Entity;

public class AttendanceData {
    private String name;
    private String serial_number;
    private int enrollid;
    private int inout;
    private int mode;
    private int event;
    private String time;

    public AttendanceData() {
    }

    public AttendanceData(String name, String serial_number, int enrollid, int inout, int mode, int event, String time) {
        this.name = name;
        this.serial_number = serial_number;
        this.enrollid = enrollid;
        this.inout = inout;
        this.mode = mode;
        this.event = event;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public int getEnrollid() {
        return enrollid;
    }

    public void setEnrollid(int enrollid) {
        this.enrollid = enrollid;
    }

    public int getInout() {
        return inout;
    }

    public void setInout(int inout) {
        this.inout = inout;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
