package API;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserinfoDTO {
    @NotBlank(message = " * userName can't be blank ..")
    @Size(min = 3,max = 15,message = "* your name should hace at least  betwen 3-15 char")
    private String userName ;
    @NotBlank(message = " * userName can't be blank ..")
    @Size(min = 3,max = 15,message = "* your name should hace at least  betwen 3-15 char")
    private String crushName ;
    @AssertTrue(message = "you have to agree to use app")
    private boolean termAndCondition;

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

    public boolean isTermAndCondition() {
        return termAndCondition;
    }

    public void setTermAndCondition(boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }

    @Override
    public String toString() {
        return "UserinfoDTO{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
