package Creater.Factory.SimpleFactory;

import Creater.Factory.DellKeyboard;
import Creater.Factory.HPKeyboard;
import Creater.Factory.Keyboard;
import Creater.Factory.LenovoKeyboard;

/**
 * 简单工厂模式
 * 优点：使用简单，客户端无需知道所创建具体产品的类名，只需知道参数即可
 * 缺点：违背了开闭原则，只要有新产品就要修改工厂类。  可以引入工厂方法模式，符合开闭原则。
 * <p>
 * 应用场景
 * 对于产品种类相对较少的情况，考虑使用简单工厂模式。
 * 使用简单工厂模式的客户端只需要传入工厂类的参数，不需要关心如何创建对象的逻辑，可以很方便地创建所需产品。
 */

public class ProductFactory {
    public static final int view_type_lenovo = 1;
    public static final int view_type_dell = 2;
    public static final int view_type_hp = 3;


    static Keyboard makeProduct(int type) {
        Keyboard product = null;
        switch (type) {
            case view_type_lenovo:
                product = new LenovoKeyboard();
                break;
            case view_type_dell:
                product = new DellKeyboard();
                break;
            case view_type_hp:
                product = new HPKeyboard();
                break;
        }
        return product;
    }
}
