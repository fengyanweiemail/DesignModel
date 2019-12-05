package design.model.designModel.protoTypeDesignModel.deepCopy;

import java.io.Serializable;

/**
 * Created by fyw on 2019/12/5.
 */
public class B implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String grade;
    private String city;


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "B{" +
                "grade='" + grade + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
