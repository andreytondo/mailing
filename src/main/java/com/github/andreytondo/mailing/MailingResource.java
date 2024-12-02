package com.github.andreytondo.mailing;

import com.github.andreytondo.mailing.models.MailRequest;
import com.github.andreytondo.mailing.services.MailingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/mail")
public class MailingResource {

    @Inject
    MailingService mailingService;

    @POST
    @Path("/send")
    public Response sendMail(MailRequest request) {
        mailingService.sendMail(
                request.getFrom(),
                request.getRecipient(),
                request.getSubject(),
                request.getContent(),
                request.getAttachments()
        );
        return Response.ok("Mail sent").build();
    }
}
