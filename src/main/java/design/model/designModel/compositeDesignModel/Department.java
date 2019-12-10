package design.model.designModel.compositeDesignModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fyw on 2019/12/9.
 * 叶子节点
 */
public class Department extends Organization {


    public Department(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void print() {
        System.out.println(super.getName());
    }
}
