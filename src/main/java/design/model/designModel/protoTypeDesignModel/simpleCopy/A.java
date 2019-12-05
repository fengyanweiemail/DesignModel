package design.model.designModel.protoTypeDesignModel.simpleCopy;

/**
 * Created by fyw on 2019/12/5.
 */
public class A implements Cloneable {
    private String name ;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 浅拷贝，对于引用数据类型，并没有真正的拷贝，只是指向了原来的地址
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone(){
        try{
            return  super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
