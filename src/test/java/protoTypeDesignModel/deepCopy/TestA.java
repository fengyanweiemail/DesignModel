package protoTypeDesignModel.deepCopy;

import design.model.DesignModelApplication;
import design.model.designModel.protoTypeDesignModel.deepCopy.A;
import design.model.designModel.protoTypeDesignModel.deepCopy.B;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestA {
    @Test
    public void test() throws Exception{
        A a = new A();
        a.setAge(1);
        a.setName("小明");
        a.setSex("男");
        B b = new B();
        b.setCity("郑州");
        b.setGrade("2");
        a.setB(b);
        A a1 = (A)a.clone();
        System.out.println("a:"+a+"---name的hascode:"+a.getB().hashCode());
        System.out.println("a1:"+a1+"---name的hascode:"+a1.getB().hashCode());
        //a:A{name='小明', sex='男', age=1, b=B{grade='2', city='郑州'}}---name的hascode:697145861
        //a1:A{name='小明', sex='男', age=1, b=B{grade='2', city='郑州'}}---name的hascode:697145861
    }

    @Test
    public void test1() throws Exception{
        A a = new A();
        a.setAge(1);
        a.setName("小明");
        a.setSex("男");
        B b = new B();
        b.setCity("郑州");
        b.setGrade("2");
        a.setB(b);
        A a1 = (A)a.clone();
        a1.getB().setGrade("3");
        System.out.println("a:"+a+"---name的hascode:"+a.getB().hashCode());
        System.out.println("a1:"+a1+"---name的hascode:"+a1.getB().hashCode());
        /**
         * 浅拷贝-更改copy对象a1的对象B的值会影响原型对象值，显然不行
         */
        //a:A{name='小明', sex='男', age=1, b=B{grade='3', city='郑州'}}---name的hascode:648972298
        //a1:A{name='小明', sex='男', age=1, b=B{grade='3', city='郑州'}}---name的hascode:648972298
        /**
         * 深拷贝-不会互相影响
         */
        //a:A{name='小明', sex='男', age=1, b=B{grade='2', city='郑州'}}---name的hascode:1480170882
        //a1:A{name='小明', sex='男', age=1, b=B{grade='3', city='郑州'}}---name的hascode:653880197
    }
    @Test
    public void test2(){
        A a = new A();
        a.setAge(1);
        a.setName("小明");
        a.setSex("男");
        B b = new B();
        b.setCity("郑州");
        b.setGrade("2");
        a.setB(b);
        A a1 = (A)a.deepCopy();
        a1.getB().setGrade("3");
        System.out.println("a:"+a+"---name的hascode:"+a.getB().hashCode());
        System.out.println("a1:"+a1+"---name的hascode:"+a1.getB().hashCode());
        /**
         * 深拷贝-不会互相影响
         */
        //a:A{name='小明', sex='男', age=1, b=B{grade='2', city='郑州'}}---name的hascode:2075133112
        //a1:A{name='小明', sex='男', age=1, b=B{grade='3', city='郑州'}}---name的hascode:277164482
    }
}
