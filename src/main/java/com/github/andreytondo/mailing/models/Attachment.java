package com.github.andreytondo.mailing.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Attachment {

    private String fileName;
    private byte[] content;
    private String contentType;
}
