package wiss.m165;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import wiss.m165.console.UserMenu;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private UserMenu userMenu;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userMenu.displayOptions();
    }
}
