package Creater.Factory.AbstractFactory;

import Creater.Factory.Keyboard;
import Creater.Factory.MainFrame;

public interface IFactory {
    MainFrame createMainFrame();
    Keyboard createKeyboard();
}