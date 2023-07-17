package com.epam.ld.module2.testing.template;

import java.util.Map;

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

    public String replaceVariablePlaceholders(String template, Map<String, String> variableMap) {
        for (Map.Entry<String, String> entry : variableMap.entrySet()) {
            String placeholder = "#{" + entry.getKey() + "}";
            if (template.contains(placeholder)) {
                String value = entry.getValue();
                if (value != null) {
                    template = template.replace(placeholder, value);
                }
            }
        }
        return template;
    }
}
