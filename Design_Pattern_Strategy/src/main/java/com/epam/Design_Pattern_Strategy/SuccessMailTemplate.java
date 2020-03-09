package com.epam.Design_Pattern_Strategy;

public class SuccessMailTemplate implements MailTemplate {
    @Override
    public String getTemplate() {
        return "<html><head>Success</head><body>Success operation</body></html>";
    }
}