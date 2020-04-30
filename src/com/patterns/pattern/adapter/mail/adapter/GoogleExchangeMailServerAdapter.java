package com.patterns.pattern.adapter.mail.adapter;

import com.patterns.pattern.adapter.mail.exchange.ExchangeMailServer;
import com.patterns.pattern.adapter.mail.google.GoogleMailServer;
import com.patterns.pattern.adapter.mail.google.GoogleMailToSend;

import java.util.Map;
import java.util.Set;

public class GoogleExchangeMailServerAdapter implements ExchangeMailServer {

    private GoogleMailServer googleMailServer;

    public GoogleExchangeMailServerAdapter(GoogleMailServer googleMailServer) {
        this.googleMailServer = googleMailServer;
    }

    @Override
    public String[] listUnreadEmailSenders() {
        Map<String, String> unreadEmailDetails = googleMailServer.fetchUnreadEmailsDetails();
        Set<String> unreadEmailSendersSet = unreadEmailDetails.keySet();

        return unreadEmailSendersSet.toArray(new String[0]);
    }

    @Override
    public String getLatestMailContent() {
        return googleMailServer.getLastMailBody();
    }

    @Override
    public void sendEmail(String recipientEmailAddress, String title, String body) {
        GoogleMailToSend googleMailToSend = googleMailServer.composeEmail(recipientEmailAddress, title, body);
        googleMailServer.sendEmail(googleMailToSend);
    }
}
