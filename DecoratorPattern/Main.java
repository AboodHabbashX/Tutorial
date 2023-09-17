import com.Abood.Notification.FaceBookDecorator;
import com.Abood.Notification.INotifier;
import com.Abood.Notification.InstagramDecorator;
import com.Abood.Notification.Notifier;

public class Main {
    public static void main(String[] args) {
        INotifier notifier =new FaceBookDecorator(
                new InstagramDecorator(
                        new Notifier("Abood")
                )
        );

        notifier.send("Hello How can i help you ?");
    }
}
