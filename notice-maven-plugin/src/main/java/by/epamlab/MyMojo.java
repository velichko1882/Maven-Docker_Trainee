package by.epamlab;


import by.epamlab.messengers.Messenger;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Sends an e-mail message about the successful assembly of the project.
 */
@Mojo( name = "sendmessage", defaultPhase = LifecyclePhase.INSTALL )
public class MyMojo
    extends AbstractMojo
{
    /**
     * Login to send a message to e-mail.
     */
    @Parameter( property = "sendmessage.login" )
    private String login;

    /**
     * Password to send a message to e-mail.
     */
    @Parameter( property = "sendmessage.password" )
    private String password;

    /**
     * E-mail address to send message.
     */
    @Parameter( property = "sendmessage.email" )
    private String email;

    /**
     * Message subject.
     */
    @Parameter( property = "sendmessage.subject" )
    private String subject;

    /**
     * Message text.
     */
    @Parameter( property = "sendmessage.text" )
    private String text;

    public void execute()
        throws MojoExecutionException {
        Messenger messenger = new Messenger(login, password, email, subject, text);
        messenger.sendMessage();
    }
}
