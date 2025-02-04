package org.example.web;

public class BasicTask extends TaskComponent {
    private final String  name;

    public BasicTask(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        return "Task: " + name;
    }
}
