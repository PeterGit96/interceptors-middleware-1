package co.develhope.interceptorsmiddleware1.interceptors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        response.setStatus(HttpStatus.GONE.value());
        response.getWriter().write("Blocked the API calls to the legacy endpoint - HTTP Status Code: " + HttpStatus.GONE.value());
        return false;
    }

}