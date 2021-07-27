package Creater.Factory.FactoryMethod;

import Creater.Factory.DellKeyboard;
import Creater.Factory.HPKeyboard;
import Creater.Factory.Keyboard;
import Creater.Factory.SimpleFactory.ProductFactory;

/*
 * 工厂方法
 * 优点：解决了开闭原则 ，不需要修改原来的产口类。
 * 缺点：如果业务涉及的子类越来越多，难道每一个子类都要对应一个工厂类吗？这样会使得系统中类的个数成倍增加，增加了代码的复杂度。
 *
 * */
public class FactoryPatternTest {

    //每一种产品对应一个生产产品的工厂，

    public static void main(String[] args) {
        //工厂类的实现可以通过Class来实例化
        Keyboard product = new LenovoKeyBoardFactory().productKeyBoard();
        product.print();
        Keyboard product1 = new HPKeyBoardFactory().productKeyBoard();
        product1.print();
        Keyboard product2 = new DellKeyBoardFactory().productKeyBoard();
        product2.print();
    }
}
