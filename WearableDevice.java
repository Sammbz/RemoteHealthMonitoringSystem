import java.util.Random;

public class WearableDevice {
    private Patient patient;

    public WearableDevice(Patient patient) {
        this.patient = patient;
    }

    public VitalSign getVitalSigns() {
        Random rand = new Random();
        int heartRate = 60 + rand.nextInt(50);
        int bloodPressure = 100 + rand.nextInt(50);
        double temperature = 36.0 + rand.nextDouble() * 2;
        return new VitalSign(heartRate, bloodPressure, temperature);
    }
}