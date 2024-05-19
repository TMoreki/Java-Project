public class AbstractTest01 extends AbstractTest {
    @Override
    public void doSomething() {
        doConcrete1();
        System.out.println("Doing something");
        doConcrete2();
    }
}