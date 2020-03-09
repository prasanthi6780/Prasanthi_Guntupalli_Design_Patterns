package com.epam.Design_Pattern_Strategy;

public class ErrorMailTemplate implements MailTemplate {
    @Override
    public String getTemplate() {
        return "<html><head>ERR</head><body>Error during operation</body></html>";
    }
}