package org.treant.functions;

import java.time.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Timer trigger. (Treant template)
 */
public class TimerTriggerFunction {
    /**
     * This function will be invoked periodically according to the specified schedule.
     */
    @FunctionName("TimerTrigger-Java")
    public void run(@TimerTrigger(name = "timerInfo", schedule = "0 * * * * *") String timerInfo, final ExecutionContext context) {
        context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
    }
}
