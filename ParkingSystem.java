public class ParkingSystem {
    public int[] spots;

    public ParkingSystem(int big, int medium, int small) {
        spots = new int[3];
        spots[0] = big;
        spots[1] = medium;
        spots[2] = small;
    }

    public boolean addCar(int carType) {
        int index = carType - 1;
        if (spots[index] > 0) {
            spots[index]--;
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); 
        System.out.println(parkingSystem.addCar(2)); 
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1)); 
    }
}
