package CreaterType.Factory;

public class LenovoKeyboard implements Keyboard {

    @Override
    public void print() {
        //...输出逻辑;
        System.out.println("生产联想键盘");
    }

    @Override
    public void input() {
        //...输入逻辑;
    }

}

