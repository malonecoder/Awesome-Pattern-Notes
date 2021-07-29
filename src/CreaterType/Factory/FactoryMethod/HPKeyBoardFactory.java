package CreaterType.Factory.FactoryMethod;

import CreaterType.Factory.HPKeyboard;
import CreaterType.Factory.Keyboard;

public class HPKeyBoardFactory implements IKeyBoardFactory {
    @Override
    public Keyboard productKeyBoard() {
        return new HPKeyboard();
    }
}
