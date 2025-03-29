public class TowerModel {
    private IntegerStack[] towers;
    private int height;

    public TowerModel(int height) {
        this.height = height;
        towers = new IntegerStack[3];
        
        // Initialize towers
        for (int i = 0; i < 3; i++) {
            towers[i] = new IntegerStack(height);
        }

        // Fill the first tower with disks in decreasing size
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

    public boolean move(int from, int to) {
        if (from < 0 || from >= 3 || to < 0 || to >= 3) {
            return false; // Invalid tower index
        }
        
        if (towers[from].isEmpty()) {
            return false; // No disk to move
        }
        
        int disk = towers[from].peek();
        
        if (!towers[to].isEmpty() && towers[to].peek() < disk) {
            return false; // Cannot place a larger disk on a smaller one
        }
        
        towers[from].pop();
        towers[to].push(disk);
        return true;
    }

    public void print() {
        System.out.println("Current state of towers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Tower " + i + ": ");
            towers[i].print();
        }
    }
}
