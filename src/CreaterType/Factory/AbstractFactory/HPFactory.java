package CreaterType.Factory.AbstractFactory;

import CreaterType.Factory.HPKeyboard;
import CreaterType.Factory.HPMainFrame;
import CreaterType.Factory.Keyboard;
import CreaterType.Factory.MainFrame;

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