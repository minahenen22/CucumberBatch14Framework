package steps;

import pages.AddEmployeePage;
import pages.DashBoardPage;
import pages.EmployeeListPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static DashBoardPage dashboard;
    public static AddEmployeePage addEmployee;
    public static EmployeeListPage employeeList;

    public static void intializePageObjects(){
        login = new LoginPage();
        dashboard = new DashBoardPage();
        addEmployee= new AddEmployeePage();
        employeeList=new EmployeeListPage();
    }
}
