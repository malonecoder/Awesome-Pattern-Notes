package Creater.Factory.FactoryMethod;

import Creater.Factory.DellKeyboard;
import Creater.Factory.HPKeyboard;
import Creater.Factory.Keyboard;

public class HPKeyBoardFactory implements IKeyBoardFactory {
    @Override
    public Keyboard productKeyBoard() {
        return new HPKeyboard();
    }
}
