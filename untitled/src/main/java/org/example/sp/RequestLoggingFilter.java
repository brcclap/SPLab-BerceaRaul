package org.example.sp;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("LOGGING REQUEST: " + req.getMethod() + " : " + req.getRequestURI());

        chain.doFilter(request, response);

        System.out.println("LOGGING RESPONSE: Request finished.");
    }
}