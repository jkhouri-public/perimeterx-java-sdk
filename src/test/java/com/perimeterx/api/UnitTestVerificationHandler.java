package com.perimeterx.api;

import com.perimeterx.api.verificationhandler.VerificationHandler;
import com.perimeterx.models.PXContext;
import org.apache.http.HttpStatus;

import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * Created by nitzangoldfeder on 29/05/2017.
 */
public class UnitTestVerificationHandler implements VerificationHandler {
    @Override
    public boolean handleVerification(PXContext context, HttpServletResponseWrapper responseWrapper) throws IOException {
        responseWrapper.setContentType("text/html");
        responseWrapper.setStatus(HttpStatus.SC_OK);
        responseWrapper.getWriter().print("custom verification handle");
        return true;
    }
}
