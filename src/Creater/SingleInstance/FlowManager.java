package Creater.SingleInstance;

/**
 * 饿汉式
 */
public class FlowManager {
    public static FlowManager flowManager = new FlowManager();
    private FlowManager() {
    }
    public static FlowManager getInstance() {
        return flowManager;
    }
}
