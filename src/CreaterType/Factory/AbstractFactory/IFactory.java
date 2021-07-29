package CreaterType.Factory.AbstractFactory;

import CreaterType.Factory.Keyboard;
import CreaterType.Factory.MainFrame;

public interface IFactory {
    MainFrame createMainFrame();
    Keyboard createKeyboard();
}