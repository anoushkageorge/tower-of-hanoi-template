public class TowerSolver {
    public void solve(TowerModel model) {
        moveDisks(model.getHeight(), model.getTowers(), 0, 2, 1);
    }

    private void moveDisks(int n, IntegerStack[] towers, int from, int to, int aux) {
        if (n <= 0) return;

        // Move n-1 disks from 'from' to 'aux' using 'to' as auxiliary
        moveDisks(n - 1, towers, from, aux, to);

        // Move the nth disk from 'from' to 'to'
        towers[to].push(towers[from].pop());

        // Move the n-1 disks from 'aux' to 'to' using 'from' as auxiliary
        moveDisks(n - 1, towers, aux, to, from);
    }
}
