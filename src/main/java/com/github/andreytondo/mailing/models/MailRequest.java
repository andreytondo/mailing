package com.github.andreytondo.mailing.models;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter @Setter
public class MailRequest {

    private String from;
    private String recipient;
    private String subject;
    private String content;
    private List<Attachment> attachments;
}
