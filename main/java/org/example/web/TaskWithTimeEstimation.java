package org.example.web;

public class TaskWithTimeEstimation extends TaskDecorator {
    private final int timeEstimation;

    public TaskWithTimeEstimation(TaskComponent task, int timeEstimation) {
        super(task);
        this.timeEstimation = timeEstimation;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Estimare timp: " + timeEstimation + " ore";
    }
}
