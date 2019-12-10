package compositeDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.compositeDesignModel.Colleage;
import design.model.designModel.compositeDesignModel.Department;
import design.model.designModel.compositeDesignModel.Organization;
import design.model.designModel.compositeDesignModel.University;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestComposite {
    @Test
    public void test(){
        //从高到低创建

        //1、创建学校
        Organization organization = new University("河南理工大学","河南一本大学");
        //2、创建学院
        Organization organization1 = new Colleage("能源学院","采矿第一");
        Organization organization2 = new Colleage("测绘学院","测绘第一");
        //3、创建系
        Organization organization3 = new Department("采矿系","采矿系");
        Organization organization4 = new Department("工业工程系","工业工程系");
        Organization organization5 = new Department("未知系","未知系");

        Organization organization6 = new Department("测绘系","测绘系");
        Organization organization7 = new Department("测量系","测量系");
        Organization organization8 = new Department("测量系1","测量系1");
        //4、添加
        //学校添加学院
        organization.add(organization1);
        organization.add(organization2);
        //学院添加系
        organization1.add(organization3);
        organization1.add(organization4);
        organization1.add(organization5);
        organization2.add(organization6);
        organization2.add(organization7);
        organization2.add(organization8);
        //查看学校情况
        organization.print();
    }
}
