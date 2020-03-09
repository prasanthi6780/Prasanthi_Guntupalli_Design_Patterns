package com.epam.Design_Pattern_Strategy;

import java.util.Map;
import java.util.Objects;
public class MapMailSender {

    private final Map<String, MailTemplate> mailTemplateMap;

    public MapMailSender(Map<String, MailTemplate> mailTemplateMap) {
        this.mailTemplateMap = mailTemplateMap;
    }

    public void sendMail(String templateId) {
        MailTemplate mailTemplate = mailTemplateMap.get(templateId);
        if (Objects.isNull(mailTemplate)) {
            throw new UnsupportedOperationException();
        } else {
            System.out.println(mailTemplate.getTemplate());
        }
    }
}