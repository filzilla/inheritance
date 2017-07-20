package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {


    TextNotification textOne = new TextNotification("Data usage","You have exceeded your data limits","Steve","T-mobile");

    EmailNotification emailOne = new EmailNotification("Data usage", "Please contact your provider","George", "At&T");

     textOne.transport();
     emailOne.transport();

     textOne.showStatus();
     emailOne.showStatus();

     EmailNotification EmailNotificationClone = emailOne;

     EmailNotificationClone.transport();
    }
}
