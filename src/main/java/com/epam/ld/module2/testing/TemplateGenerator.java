package com.epam.ld.module2.testing;

public class TemplateGenerator {

    public String replaceVariablePlaceholders(String template, String name, String subject) {
        template = template.replace("#{name}", name);
        template = template.replace("#{subject}", subject);
        return template;
    }
}

