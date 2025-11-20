package org.example.sp;

import org.springframework.stereotype.Component;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class CommandExecutor {
    private final ExecutorService executorService = Executors.newFixedThreadPool(2);

    public <T> T execute(Command<T> command) {
        return command.execute();
    }

    public void executeAsync(Command<?> command) {
        executorService.submit(() -> {
            try {
                command.execute();
                System.out.println("Async command finished execution.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}