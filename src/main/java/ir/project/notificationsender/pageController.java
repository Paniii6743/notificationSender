package ir.project.notificationsender;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class pageController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/firebase-messaging-sw.js")
    public String firebaseMessagingSw() {
        return "firebaseMessagingSw";
    }

}
