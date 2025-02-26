// DodgeDart class extends the abstract class Sedan
public class DodgeDart extends Sedan {
   
   // Constructor to initialize the DodgeDart object with the given details
   public DodgeDart(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
      super("Dodge", "Sedan", model, year, fuelType, numberOfDoors, color);
   }

   // Static method to create a DodgeDart object with specific details
   public static DodgeDart createDart() {
      return new DodgeDart("Dart", 2014, "Gasoline", 4, ColorEnum.BLUE);
   }

   // Override the toCSVString method to provide the CSV representation of the DodgeDart object
   @Override
   public String toCSVString() {
      return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
   }
}
