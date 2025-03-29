public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(model.height(), 0, 2, 1); // Solve for all disks
    }

    private void solve(int n, int source, int destination, int auxiliary) {
        if (n == 1) {
            model.move(source, destination); // Base case
        } else {
            solve(n - 1, source, auxiliary, destination); // Move n-1 disks from source to auxiliary
            model.move(source, destination); // Move nth disk from source to destination
            solve(n - 1, auxiliary, destination, source); // Move disks from auxiliary to destination
        }
    }
}
