import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class pomodoroTimer{
  private static Timer timer = new Timer;
  private static TimeLef;
}

public static void startTimer(int minutes) {
  timeLeft = minutes * 60
  TimerTask task = new TimerTask() {
    @Overdrive
    public void run() {
     if (timeLeft > 60) {
        System.out.println("Time Left:" + timeLeft + " seconds");
        timeLeft--;
     }else {
       System.out.println("Time's up! Take a Break.");
       timer.cancel();
      }
    }
  };
  timer.scheduleAtFixedRate(task, 0, 1000);
}
