public class Samsung implements Phone{
    @Override
    public void call() {
        System.out.println("Good bye!");
    }

    @Override
    public void sms() {
        System.out.println("Bye bye!");
    }
}
