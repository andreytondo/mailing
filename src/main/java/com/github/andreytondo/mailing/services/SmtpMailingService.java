package com.github.andreytondo.mailing.services;

import com.github.andreytondo.mailing.models.Attachment;
import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class SmtpMailingService implements MailingService {

    private final Mailer mailer;

    public SmtpMailingService(Mailer mailer) {
        this.mailer = mailer;
    }

    @Override
    public void sendMail(String from, String recipient, String subject, String content, List<Attachment> attachments) {
        Mail mail = Mail.withText(recipient, subject, content).setFrom(from);

        if (attachments != null) {
            for (Attachment attachment : attachments) {
                mail.addAttachment(attachment.getFileName(), attachment.getContent(), attachment.getContentType());
            }
        }

        mailer.send(mail);
    }
}
