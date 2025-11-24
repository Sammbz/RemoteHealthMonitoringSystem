public class RHMS {
    private Doctor doctor;

    public RHMS(Doctor doctor) {
        this.doctor = doctor;
    }

    public void monitorPatient(Patient patient) {
        VitalSign vs = patient.getDevice().getVitalSigns();
        System.out.println("Patient " + patient.getName() + " vitals: " + vs);
        
        if (vs.getHeartRate() > 100 || vs.getBloodPressure() > 140 || vs.getTemperature() > 37.5) {
            Alert alert = new Alert(patient, vs);
            doctor.receiveAlert(alert);
        }
    }
}