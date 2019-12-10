package design.model.designModel.compositeDesignModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fyw on 2019/12/9.
 * 非叶子节点
 */
public class Colleage extends Organization {
    //将父类组合进来
    List<Organization> organizations = new ArrayList<>();


    public Colleage(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        organizations.remove(organization);
    }

    @Override
    public void print() {
        System.out.println("--------------"+super.getName()+"--------------");
        for(Organization organization:organizations){
            organization.print();
        }
    }
}
