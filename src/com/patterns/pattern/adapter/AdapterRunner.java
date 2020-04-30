package com.patterns.pattern.adapter;

import com.patterns.pattern.adapter.mail.OutlookClient;
import com.patterns.pattern.adapter.mail.exchange.ExchangeMailServerTest;
import com.patterns.pattern.adapter.mail.adapter.GoogleExchangeMailServerAdapter;
import com.patterns.pattern.adapter.mail.google.GoogleMailServerTest;
import com.patterns.run.PatternRunner;

public class AdapterRunner implements PatternRunner {

    @Override
    public void run() {
        OutlookClient outlookClient = new OutlookClient(new ExchangeMailServerTest());
        outlookClient.performEmailActivity();

        GoogleMailServerTest googleMailServerTest = new GoogleMailServerTest();
        outlookClient = new OutlookClient(new GoogleExchangeMailServerAdapter(googleMailServerTest));
        outlookClient.performEmailActivity();
    }
}
