package org.example.web;

public abstract class TaskDecorator extends TaskComponent {
    protected TaskComponent task;

    public TaskDecorator(TaskComponent task) {
        this.task = task;
    }

    @Override
    public String getDetails() {
        return task.getDetails();
    }
}
