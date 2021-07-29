package CreaterType.Factory.FactoryMethod;

import CreaterType.Factory.Keyboard;
import CreaterType.Factory.LenovoKeyboard;

public class LenovoKeyBoardFactory implements IKeyBoardFactory {
    @Override
    public Keyboard productKeyBoard() {
        return new LenovoKeyboard();
    }
}
