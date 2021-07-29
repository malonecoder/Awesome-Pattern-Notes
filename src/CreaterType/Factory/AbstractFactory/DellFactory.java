package CreaterType.Factory.AbstractFactory;

import CreaterType.Factory.DellKeyboard;
import CreaterType.Factory.DellMainFrame;
import CreaterType.Factory.Keyboard;
import CreaterType.Factory.MainFrame;

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