package SpringDemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import Validation.CourseCode;

public class Customer {
    
    private String firstName;
    
    @NotNull(message="is Required")
    @Size(min=1, message="is Required")
    private String lastName;
    
    @NotNull(message="is Required")
    @Min(value=0, message="must be >=0")
    @Max(value=10, message="must be <=10")
    private Integer freePasses;
    
    @Pattern(regexp = "^[0-9A-Za-z]{5}", message = "only 5 chars/digits")
    private String postalCode;
    
    @CourseCode(value="TOPS", message="must start with TOPS")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
}
