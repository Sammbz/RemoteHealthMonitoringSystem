# Remote Health Monitoring System (RHMS)

## Description
This project simulates a Remote Health Monitoring System for patients with chronic conditions such as hypertension and diabetes. The system monitors vital signs through wearable devices, detects abnormalities, and sends alerts to doctors.

## Project Structure
- `Patient.java` – stores patient information and connects wearable device.
- `WearableDevice.java` – simulates collection of vital signs.
- `VitalSign.java` – stores individual measurements (heart rate, blood pressure, temperature).
- `Doctor.java` – receives alerts and provides recommendations.
- `Alert.java` – represents abnormal vital signs notifications.
- `RHMS.java` – main system that monitors patients and generates alerts.
- `Main.java` – simulates system behavior with example patients.

## How to Run
1. Clone the repository or download the project.
2. Navigate to the `src` folder.
3. Compile all Java files:
   ```
   javac *.java
   ```
4. Run the simulation:
   ```
   java Main
   ```
5. Observe the outputs, including patient vitals and alerts.

## Notes
- Vital signs are simulated randomly.
- Alerts are triggered when:
  - Heart rate > 100
  - Blood pressure > 140
  - Temperature > 37.5°C