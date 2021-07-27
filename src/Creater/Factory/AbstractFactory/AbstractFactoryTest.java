package Creater.Factory.AbstractFactory;

import Creater.Factory.FactoryMethod.DellKeyBoardFactory;
import Creater.Factory.FactoryMethod.HPKeyBoardFactory;
import Creater.Factory.FactoryMethod.LenovoKeyBoardFactory;
import Creater.Factory.Keyboard;
import Creater.Factory.MainFrame;

/*
  抽象工厂适用于以下情况：
    产品越来越多，将有相同风格或相同品牌的产品进行分组，将这些相似的产品使用同一个工厂来通过不同的方法来生产。

    优缺点：
    增加产品分组非常简单，例如要增加Lenovo分组，只需创建Lenovo工厂和具体的产品实现类。
    分组中的产品扩展非常困难，要增加一个鼠标Mouse，既要创建抽象的Mouse接口, 又要增加具体的实现：DellMouse、HPMouse， 还要再每个Factory中定义创建鼠标的方法实现。

 * */
public class AbstractFactoryTest {

    //每种

    public static void main(String[] args) {
        //工厂类的实现可以通过Class来实例化
        Keyboard product = new DellFactory().createKeyboard();
        product.print();
        MainFrame mainFrame = new DellFactory().createMainFrame();
        mainFrame.run();

    }
}
