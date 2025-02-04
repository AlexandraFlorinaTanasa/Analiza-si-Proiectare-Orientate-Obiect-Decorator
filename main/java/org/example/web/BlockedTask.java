package org.example.web;

public class BlockedTask extends TaskDecorator {
    private final String reason;

    public BlockedTask(TaskComponent task, String reason) {
        super(task);
        this.reason = reason;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Blocare: " + reason;
    }
}
