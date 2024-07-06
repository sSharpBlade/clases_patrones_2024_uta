package main.java.com.lopez.edwin.springboot.dto;

import java.util.Date;


public class MessageDto {
    private String message;
    private Date messageDate;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

}
