public class Alert {
    private Patient patient;
    private VitalSign vitalSign;

    public Alert(Patient patient, VitalSign vitalSign) {
        this.patient = patient;
        this.vitalSign = vitalSign;
    }

    public Patient getPatient() { return patient; }

    @Override
    public String toString() {
        return "Patient " + patient.getName() + " abnormal vitals: " + vitalSign;
    }
}