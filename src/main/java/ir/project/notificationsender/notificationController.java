package ir.project.notificationsender;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class notificationController {

    @GetMapping("/send")
    public String send(@RequestParam String token) throws FirebaseMessagingException {
        Notification notification = Notification.builder().setTitle("NotificaionSender").setBody("This is a test notificaion.").build();
        Message message = Message.builder().setToken(token).setNotification(notification).build();
        FirebaseMessaging.getInstance().send(message);
        return "Success";
    }

}
