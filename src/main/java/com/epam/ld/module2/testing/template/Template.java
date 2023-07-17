package com.epam.ld.module2.testing.template;

/**
 * The type Template
 * 1 template generator
 */
public class Template {
    public String replaceVariablePlaceholders(String template, String name, String subject) {
        template = template.replace("#{name}", name);
        template = template.replace("#{subject}", subject);
        return template;
    }
}
