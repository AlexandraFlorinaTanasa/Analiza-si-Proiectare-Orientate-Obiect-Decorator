package org.example.web;

public class TaskWithComments extends TaskDecorator {
    private final String comment;

    public TaskWithComments(TaskComponent task, String comment) {
        super(task);
        this.comment = comment;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Comentariu: \"" + comment + "\"";
    }
}
