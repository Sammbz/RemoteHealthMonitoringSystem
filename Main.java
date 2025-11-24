public class Main {
    public static void main(String[] args) {
        Doctor drSmith = new Doctor("Smith");
        RHMS system = new RHMS(drSmith);

        Patient patient1 = new Patient("Alice", 1);
        Patient patient2 = new Patient("Bob", 2);

        system.monitorPatient(patient1);
        system.monitorPatient(patient2);

        drSmith.reviewAlerts();
    }
}