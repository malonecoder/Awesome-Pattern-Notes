package Creater.Factory;

/*
*
*总结
* 简单工厂：唯一工厂类，一个产品抽象类，工厂类的创建方法依据入参判断并创建具体产品对象。
* 工厂方法：多个工厂类，一个产品抽象类，利用多态创建不同的产品对象，避免了大量的if-else判断。
* 抽象工厂：多个工厂类，多个产品抽象类，产品子类分组，同一个工厂实现类创建同组中的不同产品，减少了工厂子类的数量。
* 在下述情况下可以考虑使用工厂模式：在编码时不能预见需要创建哪种类的实例。系统不应依赖于产品类实例如何被创建、组合和表达的细节。
* 总之，工厂模式就是为了方便创建同一接口定义的具有复杂参数和初始化步骤的不同对象。
* 工厂模式一般用来创建复杂对象。只需用new就可以创建成功的简单对象，无需使用工厂模式，否则会增加系统的复杂度。
* 此外，如果对象的参数是不固定的，推荐使用Builder模式。
*
* */
public class 总结 {

}
