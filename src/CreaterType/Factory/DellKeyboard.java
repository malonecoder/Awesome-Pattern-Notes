package CreaterType.Factory;

public class DellKeyboard implements Keyboard {

    @Override
    public void print() {
        //...输出逻辑;
        System.out.println("生产戴尔键盘");
    }

    @Override
    public void input() {
        //...输入逻辑;
    }

}

