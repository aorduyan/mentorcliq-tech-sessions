package com.patterns.pattern.adapter.mail.google;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.lang.System.out;

final public class GoogleMailServerTest implements GoogleMailServer {

    @Override
    public Map<String, String> fetchUnreadEmailsDetails() {
        Map<String,String> myMap = new HashMap<>();
        myMap.put("asdfghjkl@spam.com", "Hey, this is not a spam!");
        myMap.put("teammate@old-company.com", "Hey bro, may you want to come back?");
        myMap.put("hire-me@recruiter.com", "Hello dear super duper professional, I want to recruit you.");
        return myMap;
    }

    @Override
    public String getLastMailBody() {
        return "Hi dear subscriber, please unsubscribe :-)";
    }

    @Override
    public GoogleMailToSend composeEmail(String recipientAddress, String subject, String body) {
        return new GoogleMailToSend(recipientAddress, subject, body);
    }

    @Override
    public void sendEmail(GoogleMailToSend googleMailToSend) {
        out.println("Sending email " + googleMailToSend);
    }
}
