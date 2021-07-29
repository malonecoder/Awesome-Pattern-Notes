package CreaterType.Factory.FactoryMethod;

import CreaterType.Factory.DellKeyboard;
import CreaterType.Factory.Keyboard;

public class DellKeyBoardFactory implements IKeyBoardFactory {
    @Override
    public Keyboard productKeyBoard() {
        return new DellKeyboard();
    }
}
