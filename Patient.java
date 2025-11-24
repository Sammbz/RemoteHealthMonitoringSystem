public class Patient {
    private String name;
    private int id;
    private WearableDevice device;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
        this.device = new WearableDevice(this);
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public WearableDevice getDevice() { return device; }
}