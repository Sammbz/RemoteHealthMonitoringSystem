import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<Alert> alerts;

    public Doctor(String name) {
        this.name = name;
        this.alerts = new ArrayList<>();
    }

    public void receiveAlert(Alert alert) {
        alerts.add(alert);
        System.out.println("Doctor " + name + " received alert: " + alert);
    }

    public void reviewAlerts() {
        for (Alert alert : alerts) {
            System.out.println("Reviewing alert: " + alert);
            System.out.println("Recommendation: Please follow up with patient " + alert.getPatient().getName());
        }
    }
}