package io.agileintelligence.ppmtool.exceptions;

public class ProjectIdExceprionRespnse {

    private String projectIdentifier;

    public ProjectIdExceprionRespnse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
