package by.epamlab.staff.model.entity.impl;

import by.epamlab.staff.model.entity.Manager;
import by.epamlab.staff.model.entity.Salary;

/**
 * Class ProjectManager describes the project managers of the company.
 * - extends - Manager.
 * @author Valentin Velichko
 * */
public class ProjectManager extends Manager {

    /**
     * This field contains information about the project by the project manager.
     * */
    private String projectName;

    public ProjectManager() {
    }

    public ProjectManager(int employeeId, String firstName, String lastName, int workExperience,
                          Salary salary, int roomNumber, String projectName) {
        super(employeeId, firstName, lastName, workExperience, salary, roomNumber);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProjectManager{");
        sb.append(super.toString());
        sb.append(", Project name = '").append(projectName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getTotalSalary() {
        final int bonusProject = 500;
        return getSalary().getBaseSalary() + bonusProject;
    }

    public void workInProject() {
        System.out.println("Solves project issues.");
    }

    public void attendMetting() {
        System.out.println("Leads meeting.");
    }

    @Override
    public void work() {
        attendMetting();
        workInProject();
    }
}
