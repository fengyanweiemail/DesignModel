package singleDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.singleDesignModel.Single7;
import design.model.designModel.singleDesignModel.TestFinal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by fyw on 2019/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class Single7Test {
    @Test
    public void test(){
        Single7 single1 = Single7.INSTANCE;
        Single7 single2 = Single7.INSTANCE;
        System.out.println(single1==single2);
        System.out.println("single1:"+single1.hashCode());
        System.out.println("single2:"+single2.hashCode());
        single1.say();

    }

    ExecutorService pool = Executors.newFixedThreadPool(2);

    @Test
    public  void testFinal(){
        pool.execute(new Runnable() {
            @Override
            public void run() {
                final TestFinal testFinal = new TestFinal();
                testFinal.add("a");
                System.out.println(testFinal.hashCode());
                TestFinal testFinal1 = new TestFinal();
                testFinal1.add("c");
                System.out.println(testFinal1.hashCode());


            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                TestFinal testFinal = new TestFinal();
                testFinal.add("b");
            }
        });

    }

}
