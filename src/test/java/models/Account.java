package models;

//POJO
//PLAN OLD JAVA OBJECT
public class Account {
    String accountName;
    String webSite;
    String phone;
    String employees;

    public String getAccountName() {
        return accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmployees() {
        return employees;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public Account(String accountName, String webSite, String phone, String employees) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.phone = phone;
        this.employees = employees;
    }
}
