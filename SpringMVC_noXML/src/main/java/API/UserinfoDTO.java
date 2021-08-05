package API;

public class UserinfoDTO {
    private String userName = "nguyen hong ngoc";
    private String crushName = "nguyen hong ngoc1";

    public UserinfoDTO() {
        System.out.println("user info dto constructor called.... ");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    @Override
    public String toString() {
        return "UserinfoDTO{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
