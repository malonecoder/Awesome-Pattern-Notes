package StructureType.Proxy;

/**
 * 目标对象和代理对象都要实现相同的接口
 */
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}