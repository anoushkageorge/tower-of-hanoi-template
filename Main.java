public class Main {
    public static void main(String[] args) {
        int height = 3; // Change this to test different heights
        TowerModel model = new TowerModel(height);
        TowerSolver solver = new TowerSolver();

        model.print(); // Print the initial state of the towers
        solver.solve(model); // Solve the Tower of Hanoi problem
    }
}
