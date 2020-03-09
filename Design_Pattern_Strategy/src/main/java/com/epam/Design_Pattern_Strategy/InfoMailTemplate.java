package com.epam.Design_Pattern_Strategy;

public class InfoMailTemplate implements MailTemplate {
    @Override
    public String getTemplate() {
        return "info";
    }
}