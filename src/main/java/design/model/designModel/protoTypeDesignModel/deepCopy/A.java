package design.model.designModel.protoTypeDesignModel.deepCopy;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * Created by fyw on 2019/12/5.
 */
public class A implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    private String name ;
    private String sex;
    private int age;

    private B  b;

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", b=" + b +
                '}';
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

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

    /**
     * 深拷贝，对于引用数据类型，重新生成
     * 但是假如B对象里面也存在引用类型呢？又假如A对象里面有100个引用类型呢？还这样实现？麻烦不？
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone(){
        try{
            A a = null;
            a = (A)super.clone();
            a.setB((B) b.clone());
            return  a;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 用序列化实现深拷贝--推荐使用
     * 引用类型都实现序列化接口
     */
    public Object deepCopy(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
            //将对象本身写入到输出流--序列化
             bos = new ByteArrayOutputStream();
             oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //将输出流读出为对象--反序列化（重新创建对象）
             bis = new ByteArrayInputStream(bos.toByteArray());
             ois = new ObjectInputStream(bis);
            return ois.readObject();



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        return null;
    }



   /* @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
}
