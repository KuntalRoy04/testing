public class ComputerBuilderTest {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.ComputerBuilder("Intel i5", "8GB DDR4")
                                          .build();
        System.out.println("Basic Computer:\n" + basicComputer + "\n");
        
        // Gaming computer
        Computer gamingComputer = new Computer.ComputerBuilder("AMD Ryzen 9", "32GB DDR4")
                                           .setStorage("1TB SSD")
                                           .setGraphicsCard("NVIDIA RTX 3080")
                                           .setOperatingSystem("Windows 11 Pro")
                                           .build();
        System.out.println("Gaming Computer:\n" + gamingComputer + "\n");
        
        // Developer computer
        Computer devComputer = new Computer.ComputerBuilder("Intel i7", "16GB DDR4")
                                         .setStorage("512GB SSD + 2TB HDD")
                                         .setOperatingSystem("Ubuntu 22.04 LTS")
                                         .build();
        System.out.println("Developer Computer:\n" + devComputer);
    }
}