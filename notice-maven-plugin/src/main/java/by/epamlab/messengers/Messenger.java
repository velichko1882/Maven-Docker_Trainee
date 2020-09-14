package by.epamlab.messengers;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Messenger {
    private String login;
    private String password;
    private String email;
    private String subject;
    private String text;
    private Properties props;

    public Messenger(String login, String password, String email, String subject, String text) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.subject = subject;
        this.text = text;

        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
    }

    public void sendMessage() {

        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(login, password);
            }
        };

        Session session = Session.getDefaultInstance(props, authenticator);

        Message message = new MimeMessage(session);

        try {
            System.out.println("Sending message.");
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            System.out.println("Message sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
