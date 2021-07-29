package StructureType.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 这种代理方式需要代理对象和目标对象实现一样的接口。
 * <p>
 * 优点：可以在不修改目标对象的前提下扩展目标对象的功能。
 * 缺点：
 * 冗余。每一个目标对象都需要自己生成一个代理类，会在编译其间产生很多的代理类。
 * 不易维护/不够灵活。一旦接口增加方法，目标对象与代理对象都要进行修改。
 * <p>
 * 使用情景：比较适合对单个目标对象做一些额外功能的需求。
 * 如需要对系统整个进行一些额外的功能需求 使用动态代理，如事务控制 日志，埋点等
 */


public class StaticUserProxy {
    public static void main(String[] args) {
        testStaticProxy();
    }

    public static void testStaticProxy() {

        /**===========静态代理==============*/
        //目标对象
        IUserDao dao = new UserDao();
        //代理类
        UserDaoProxy proxy = new UserDaoProxy(dao);
        //调用代理类的方法，内部调用了目标对象的save方法
        proxy.save();


        /**===========动态代理==============*/
        IUserDao iUserDao = null;
        iUserDao = (IUserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //调用目标对象 每个方法时的回调，可以在回调中处理一些AOP的功能
                System.out.println("开启事务");//扩展了额外功能
                method.invoke(dao, args);
                System.out.println("提交事务");
                return null;
            }
        });
        iUserDao.save();

        /**===========cglib代理==============*/

        /*
        * cglib特点
        JDK的动态代理有一个限制，就是使用动态代理的对象必须实现一个或多个接口。
        如果想代理没有实现接口的类，就可以使用CGLIB实现。
        CGLIB是一个强大的高性能的代码生成包，它可以在运行期扩展Java类与实现Java接口。
        它广泛的被许多AOP的框架使用，例如Spring AOP和dynaop，为他们提供方法的interception（拦截）。
        CGLIB包的底层是通过使用一个小而快的字节码处理框架ASM，来转换字节码并生成新的类。
        不鼓励直接使用ASM，因为它需要你对JVM内部结构包括class文件的格式和指令集都很熟悉。

        cglib与动态代理最大的区别就是
        使用动态代理的对象必须实现一个或多个接口
        使用cglib代理的对象则无需实现接口，达到代理类无侵入。
        *
        * */

    }
}