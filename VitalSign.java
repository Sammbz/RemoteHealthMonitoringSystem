public class VitalSign {
    private int heartRate;
    private int bloodPressure;
    private double temperature;

    public VitalSign(int heartRate, int bloodPressure, double temperature) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
    }

    public int getHeartRate() { return heartRate; }
    public int getBloodPressure() { return bloodPressure; }
    public double getTemperature() { return temperature; }

    @Override
    public String toString() {
        return "HR: " + heartRate + ", BP: " + bloodPressure + ", Temp: " + temperature;
    }
}