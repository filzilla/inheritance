package com.company;

import java.time.LocalDateTime;

/**
 * Created by phillipdelia on 7/19/17.
 */
public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;




    public Notification(String subject, String body) {

        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "You've been served";

    }

    public String getSubject() {

            return subject;
        }

    public String getBody() {

        return body;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    protected String showStatus(){
        System.out.println(status);
        return status;
    }

    protected void notifyUser(){
        System.out.println("YOU ARE REALLY SMART!");
    }

    public void transport(){

        throw new NoTransportException();

}
}
