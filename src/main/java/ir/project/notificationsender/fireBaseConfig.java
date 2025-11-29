package ir.project.notificationsender;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
public class fireBaseConfig {
    @Bean
    public FirebaseApp init() throws IOException {
        FileInputStream serviceAccount =

                new FileInputStream("src/main/resources/notificationsender-13a55-firebase-adminsdk-fbsvc-3bd7dc6620.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        return FirebaseApp.initializeApp(options);


    }
}



