public interface Phone {
    public void call();
    public void sms();
}

public class IPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Hello");
    }

    @Override
    public void sms() {
        System.out.println("Good Morning");
    }
}
