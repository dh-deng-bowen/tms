package com.ergroup.tmsweb.entity;

public class Message {

    private String message;
    private String code;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static Message success() {

        Message success = new Message();
        success.setCode("0000");
        success.setStatus("success");
        return success;
    }

    public static Message success(String msg) {

        Message success = success();
        success.setMessage(msg);
        return success;
    }

    public static Message fail() {

        Message fail = new Message();
        fail.setCode("9999");
        fail.setStatus("fail");
        return fail;
    }

    public static Message fail(String msg) {

        Message fail = success();
        fail.setMessage(msg);
        return fail;
    }
}
