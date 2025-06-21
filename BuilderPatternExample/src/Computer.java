public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;
    
    // Optional parameters
    private final String storage;
    private final String graphicsCard;
    private final String operatingSystem;
    
    // Private constructor
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }
    
    // Getters
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public String getOperatingSystem() { return operatingSystem; }
    
    // Builder Class
    public static class ComputerBuilder {
        // Required parameters
        private final String CPU;
        private final String RAM;
        
        // Optional parameters - initialized to default values
        private String storage = "1TB HDD";
        private String graphicsCard = "Integrated";
        private String operatingSystem = "Windows 10";
        
        // Builder constructor with required fields
        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        
        // Methods to set optional parameters
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        
        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        
        public ComputerBuilder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        
        // Build method
        public Computer build() {
            return new Computer(this);
        }
    }
    
    @Override
    public String toString() {
        return "Computer Configuration:\n" +
               "CPU: " + CPU + "\n" +
               "RAM: " + RAM + "\n" +
               "Storage: " + storage + "\n" +
               "Graphics Card: " + graphicsCard + "\n" +
               "OS: " + operatingSystem;
    }
}