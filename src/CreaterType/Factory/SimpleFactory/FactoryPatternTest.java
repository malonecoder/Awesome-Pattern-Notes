package CreaterType.Factory.SimpleFactory;

import CreaterType.Factory.Keyboard;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Keyboard product = ProductFactory.makeProduct(ProductFactory.view_type_lenovo);
        product.print();
        Keyboard product1 = ProductFactory.makeProduct(ProductFactory.view_type_dell);
        product1.print();
        Keyboard product2 = ProductFactory.makeProduct(ProductFactory.view_type_hp);
        product2.print();
    }
}
