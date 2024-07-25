package com.thuydung.pages;

public class CommonPage {
    public JobPage jobPage;

    public JobPage getJobPage() {
        if (jobPage == null) {
            jobPage = new JobPage();
        }
        return jobPage;
    }

}
