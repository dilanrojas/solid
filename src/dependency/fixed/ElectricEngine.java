package dependency.fixed;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Start with electric engine");
    }
}
