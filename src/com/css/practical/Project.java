package com.css.practical;

public class Project {
    protected int projectId;
    protected String projectName;
    protected String projectHead;
    protected int noOfResources;

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectHead(String projectHead) {
        this.projectHead = projectHead;
    }

    public void setNoOfResources(int noOfResources) {
        this.noOfResources = noOfResources;
    }
    private void display()
    {
        System.out.println("Current Project Object Info -- ");
        System.out.println("Project Id = "+projectId + "\n Project Name = " + projectName+ "\n Projecct Head = "+projectHead + "\n No Of Resources = "+noOfResources);
    }
    public static void main(String args[])
    {
        Project pj=new Project();
        pj.setProjectId(101);
        pj.setProjectName("Development");
        pj.setProjectHead("Dinesh");
        pj.setNoOfResources(4);
        pj.display();
    }
}
