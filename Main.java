public class Main {
    public static void main(String[] args) {
        TowerModel model = new TowerModel(3);
        model.print(); // Print initial state

        System.out.println("Moving disk from Tower 0 to Tower 2...");
        model.move(0, 2);
        model.print(); // Print state after move

        System.out.println("Moving disk from Tower 0 to Tower 1...");
        model.move(0, 1);
        model.print(); // Print state after move
    }
}
