package Gabri.Dev.com.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseVerifier implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Códigos ANSI para colores
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_BLACK_TEXT = "\033[30m";

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        try {
            // Verificar la existencia de una tabla
            jdbcTemplate.execute("SELECT 1 FROM usuario LIMIT 1");

            // Puedes agregar más verificaciones si es necesario

            System.out.println(ANSI_BLACK_TEXT + ANSI_GREEN_BACKGROUND +
                    "     _______. _______      ______ .______       _______   ______       __          ___          _______  .______   \n" +
                    "    /       ||   ____|    /      ||   _  \\     |   ____| /  __  \\     |  |        /   \\        |       \\ |   _  \\  \n" +
                    "   |   (----`|  |__      |  ,----'|  |_)  |    |  |__   |  |  |  |    |  |       /  ^  \\       |  .--.  ||  |_)  | \n" +
                    "    \\   \\    |   __|     |  |     |      /     |   __|  |  |  |  |    |  |      /  /_\\  \\      |  |  |  ||   _  <  \n" +
                    ".----)   |   |  |____    |  `----.|  |\\  \\----.|  |____ |  `--'  |    |  `----./  _____  \\     |  '--'  ||  |_)  | \n" +
                    "|_______/    |_______|    \\______|| _| `._____||_______| \\______/     |_______/__/     \\__\\    |_______/ |______/  \n" +
                    ANSI_RESET);

        } catch (Exception e) {
            System.err.println(ANSI_BLACK_TEXT + ANSI_RED_BACKGROUND +
                    " _______ .______      .______        ______   .______          _______ .__   __.     __          ___          _______  .______   \n" +
                    "|   ____||   _  \\     |   _  \\      /  __  \\  |   _  \\        |   ____||  \\ |  |    |  |        /   \\        |       \\ |   _  \\  \n" +
                    "|  |__   |  |_)  |    |  |_)  |    |  |  |  | |  |_)  |       |  |__   |   \\|  |    |  |       /  ^  \\       |  .--.  ||  |_)  | \n" +
                    "|   __|  |      /     |      /     |  |  |  | |      /        |   __|  |  . `  |    |  |      /  /_\\  \\      |  |  |  ||   _  <  \n" +
                    "|  |____ |  |\\  \\----.|  |\\  \\----.|  `--'  | |  |\\  \\----.   |  |____ |  |\\   |    |  `----./  _____  \\     |  '--'  ||  |_)  | \n" +
                    "|_______|| _| `._____|| _| `._____| \\______/  | _| `._____|   |_______||__| \\__|    |_______/__/     \\__\\    |_______/ |______/  \n" +
                    ANSI_RESET);

            throw new RuntimeException("Error al verificar la base de datos", e);
        }
    }
}
