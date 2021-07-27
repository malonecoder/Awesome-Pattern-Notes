package Creater.Factory.AbstractFactory;

import Creater.Factory.AbstractFactory.IFactory;
import Creater.Factory.DellKeyboard;
import Creater.Factory.DellMainFrame;
import Creater.Factory.Keyboard;
import Creater.Factory.MainFrame;

public class DellFactory implements IFactory {
    @Override
    public MainFrame createMainFrame() {
        MainFrame mainFrame = new DellMainFrame();
        //...造一个Dell主机;
        return mainFrame;
    }

    @Override
    public Keyboard createKeyboard() {
        Keyboard keyboard = new DellKeyboard();
        //...造一个Dell键盘;
        return keyboard;
    }
}