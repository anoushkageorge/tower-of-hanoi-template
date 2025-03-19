
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(model.height(), 0, 2, 1); //3 rods
        // Call the missing solve method (not this one)
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    private void solve (int n, int source, int destination, int auxillerary) {
        if (n==1) {
            move.move(source, destination); //base case
        } else {}
    }

}
