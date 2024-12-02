package com.github.andreytondo.mailing.services;

import com.github.andreytondo.mailing.models.Attachment;
import java.util.List;

public interface MailingService {
    void sendMail(String from, String recipient, String subject, String content, List<Attachment> attachments);
}
