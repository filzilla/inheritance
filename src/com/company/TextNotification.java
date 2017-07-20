package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by phillipdelia on 7/19/17.
 */
public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;
    protected String status;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;

     notifyUser();

    }


    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void transport() {
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
        System.out.println(super.getBody());
        System.out.println(super.getSubject());
        System.out.println(super.getCreatedAt());
        System.out.println(getStatus());
    }
}
