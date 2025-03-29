public class TowerModel {
    private int height;
    private IntegerStack[] towers;

    public TowerModel(int height) {
        this.height = height;
        towers = new IntegerStack[3];

        // Initialize towers
        for (int i = 0; i < 3; i++) {
            towers[i] = new IntegerStack();
        }

        // Fill the first tower with disks (largest at bottom)
        for (int i = height; i > 0; i--) {
            towers[0].push(i);
        }
    }

    public int getHeight() {
        return height;
    }

    public IntegerStack[] getTowers() {
        return towers;
    }

    public void move(int from, int to) {
        if (from < 0 || from >= 3 || to < 0 || to >= 3) {
            return; // Invalid tower index
        }
        if (towers[from].isEmpty()) {
            return; // No disk to move
        }

        int disk = towers[from].peek();
        if (!towers[to].isEmpty() && towers[to].peek() < disk) {
            return; // Illegal move (can't place a larger disk on a smaller one)
        }

        towers[from].pop();
        towers[to].push(disk);
    }
}
