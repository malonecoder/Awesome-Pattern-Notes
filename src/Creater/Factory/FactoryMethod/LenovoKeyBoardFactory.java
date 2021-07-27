package Creater.Factory.FactoryMethod;

import Creater.Factory.Keyboard;
import Creater.Factory.LenovoKeyboard;

public class LenovoKeyBoardFactory implements IKeyBoardFactory {
    @Override
    public Keyboard productKeyBoard() {
        return new LenovoKeyboard();
    }
}
