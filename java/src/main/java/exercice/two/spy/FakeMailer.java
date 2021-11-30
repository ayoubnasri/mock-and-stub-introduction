package exercice.two.spy;

import notification.Mailer;

public class FakeMailer extends Mailer {

    public String sentMessage;

    @Override
    public void send(String greeting) {
        this.sentMessage = greeting;
    }
}
