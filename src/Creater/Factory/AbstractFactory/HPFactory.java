package Creater.Factory.AbstractFactory;

import Creater.Factory.AbstractFactory.IFactory;
import Creater.Factory.HPKeyboard;
import Creater.Factory.HPMainFrame;
import Creater.Factory.Keyboard;
import Creater.Factory.MainFrame;

public class HPFactory implements IFactory {
    @Override
    public MainFrame createMainFrame() {
        MainFrame mainFrame = new HPMainFrame();
        //...造一个HP主机;
        return mainFrame;
    }


    @Override
    public Keyboard createKeyboard() {
        Keyboard keyboard = new HPKeyboard();
        //...造一个HP键盘;
        return keyboard;
    }
}