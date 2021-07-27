package Creater.Factory.FactoryMethod;

import Creater.Factory.DellKeyboard;
import Creater.Factory.Keyboard;
import Creater.Factory.LenovoKeyboard;

public class DellKeyBoardFactory implements IKeyBoardFactory {
    @Override
    public Keyboard productKeyBoard() {
        return new DellKeyboard();
    }
}
