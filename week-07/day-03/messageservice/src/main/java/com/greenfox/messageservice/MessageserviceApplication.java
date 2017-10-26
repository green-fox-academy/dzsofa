import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greenfox.messageservice.service.*

@SpringBootApplication
public class MessageserviceApplication implements CommandLineRunner {

    @Autowired
    MessageProcessor messageProcessor;

    public static void main(String[] args) {

    }

    @Override
    public void run(String... args) throws Exception {
        messageProcessor.processMessage("Hi Barba, How are you?", "office@greenfox.com");
    }