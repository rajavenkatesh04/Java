import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PomodoroTimer extends JFrame {
    private JLabel timerLabel;
    private JButton startButton, pauseButton, resetButton;
    private JComboBox<String> modeSelector;
    private Timer timer;
    
    // Time constants (in seconds)
    private static final int POMODORO_TIME = 25 * 60;
    private static final int SHORT_BREAK_TIME = 5 * 60;
    private static final int LONG_BREAK_TIME = 15 * 60;
    
    private int remainingTime;
    private int currentMode; // 0: Pomodoro, 1: Short Break, 2: Long Break
    private boolean isRunning = false;
    private int completedPomodoros = 0;

    public PomodoroTimer() {
        // Set up the main frame
        setTitle("Pomodoro Timer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Timer Label
        timerLabel = new JLabel("25:00", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Arial", Font.BOLD, 72));
        add(timerLabel, BorderLayout.CENTER);

        // Control Panel
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // Mode Selector
        String[] modes = {"Pomodoro", "Short Break", "Long Break"};
        modeSelector = new JComboBox<>(modes);
        modeSelector.addActionListener(e -> resetTimer());
        controlPanel.add(modeSelector);

        // Buttons
        startButton = new JButton("Start");
        pauseButton = new JButton("Pause");
        resetButton = new JButton("Reset");

        startButton.addActionListener(e -> startTimer());
        pauseButton.addActionListener(e -> pauseTimer());
        resetButton.addActionListener(e -> resetTimer());

        controlPanel.add(startButton);
        controlPanel.add(pauseButton);
        controlPanel.add(resetButton);

        add(controlPanel, BorderLayout.SOUTH);

        // Initialize timer
        resetTimer();
    }

    private void startTimer() {
        if (!isRunning) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (remainingTime > 0) {
                        remainingTime--;
                        updateTimerDisplay();
                    } else {
                        completeCurrentMode();
                    }
                }
            });
            timer.start();
            isRunning = true;
        }
    }

    private void pauseTimer() {
        if (isRunning && timer != null) {
            timer.stop();
            isRunning = false;
        }
    }

    private void resetTimer() {
        // Stop existing timer if running
        if (timer != null) {
            timer.stop();
        }
        isRunning = false;

        // Set timer based on selected mode
        currentMode = modeSelector.getSelectedIndex();
        switch (currentMode) {
            case 0: // Pomodoro
                remainingTime = POMODORO_TIME;
                break;
            case 1: // Short Break
                remainingTime = SHORT_BREAK_TIME;
                break;
            case 2: // Long Break
                remainingTime = LONG_BREAK_TIME;
                break;
        }

        // Update display
        updateTimerDisplay();
    }

    private void completeCurrentMode() {
        // Stop timer
        if (timer != null) {
            timer.stop();
        }
        isRunning = false;

        // Play sound or show notification
        Toolkit.getDefaultToolkit().beep();

        // Handle Pomodoro completion logic
        if (currentMode == 0) {
            completedPomodoros++;
            
            // After 4 Pomodoros, take a long break
            if (completedPomodoros % 4 == 0) {
                modeSelector.setSelectedIndex(2); // Long Break
            } else {
                modeSelector.setSelectedIndex(1); // Short Break
            }
        } else {
            // Return to Pomodoro after break
            modeSelector.setSelectedIndex(0);
        }

        // Reset timer to the new mode
        resetTimer();
    }

    private void updateTimerDisplay() {
        int minutes = remainingTime / 60;
        int seconds = remainingTime % 60;
        timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
    }

    public static void main(String[] args) {
        // Use SwingUtilities to ensure thread safety
        SwingUtilities.invokeLater(() -> {
            PomodoroTimer timer = new PomodoroTimer();
            timer.setVisible(true);
        });
    }
}
