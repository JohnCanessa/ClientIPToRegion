/**
 * Enhanced TreeNode class typically used
 * to solve LeetCode binary tree problems.
 */
public class TreeNode {
    
    // **** class members ****
    public String      regionName;
    public int         startHash;
    public int         endHash;
    public int         height;

    public TreeNode    left;
    public TreeNode    right;


    /**
     * Constructor.
     */
    public TreeNode() {
    }


    /**
     * Constructor.
     */
    public TreeNode(String regionName) {
        this.regionName = regionName;
        this.height     = 1;
    }


    /**
     * Constructor.
     */
    public TreeNode(String regionName, TreeNode left, TreeNode right) {
        this.regionName = regionName;
        this.left       = left;
        this.right      = right;
    }


    /**
     * Costructor.
     */
    public TreeNode(String regionName, int startHash, int endHash) {
        this.regionName = regionName;
        this.startHash  = startHash;
        this.endHash    = endHash;
    }


    /**
     * Constructor.
     */
    public TreeNode(Region region) {
        this.regionName = region.regionName;
        this.startHash  = region.startHash;
        this.endHash    = region.endHash;
    }


    /**
     * Return a string representation of this node.
     */
    @Override
    public String toString() {
        String sh = Integer.toUnsignedString(this.startHash);
        String eh = Integer.toUnsignedString(this.endHash);
        return "(" + this.regionName + ", " + sh + ", " + eh + ")";
    }
}
