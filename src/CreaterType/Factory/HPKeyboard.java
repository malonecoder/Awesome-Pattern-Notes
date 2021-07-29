package CreaterType.Factory;

 public class HPKeyboard implements Keyboard {

    @Override
    public void print() {
        //...输出逻辑;
       System.out.println("生产惠普键盘");
    }

    @Override
    public void input() {
        //...输入逻辑;
    }

}

