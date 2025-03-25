package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;
    private List<Submission> validSubmissions;
    private List<Submission> invalidSubmissions;

    // Constructor
    public Assignment(String description, Date dueDate) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.validSubmissions = new ArrayList<>();
        this.invalidSubmissions = new ArrayList<>();
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Submission[] getValidSubmissions() {
        return validSubmissions.toArray(new Submission[0]);
    }

    public Submission[] getInvalidSubmissions() {
        return invalidSubmissions.toArray(new Submission[0]);
    }

    // Method to handle a submission
    public void submitAssignment(Submission submission) {
        if (validateSubmission(submission)) {
            validSubmissions.add(submission);
        } else {
            invalidSubmissions.add(submission);
        }
    }

    // Validation method (Example: Checks if submitted before due date)
    private boolean validateSubmission(Submission submission) {
        return submission.getSubmissionDate().before(dueDate);
    }

}
