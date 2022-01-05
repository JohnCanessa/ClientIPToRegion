/**
 * 
 */
public class Region {
    
    // **** class members ****
    public String   regionName;
    public int      startHash;
    public int      endHash;


    /**
     * Constructor.
     */
    public Region() {
    }


    /**
     * Constructor
     */
    public Region(String regionString) {

        // **** ****
        String[] strs = regionString.split(", ", 3);

        // **** ****
        HashClientIP hashClientIP = new HashClientIP();

        // **** ****
        int startHash = hashClientIP.hash(strs[1]);

        // **** ****
        int endHash = hashClientIP.hash(strs[2]);

        // **** ****
        this.regionName = strs[0];
        this.startHash  = startHash;
        this.endHash    = endHash;
    }


    /**
     * Constructor.
     */
    public Region(String regionName, int startHash, int endHash) {
        this.regionName = regionName;
        this.startHash  = startHash;
        this.endHash    = endHash;
    }


    /**
     * toString.
     */
    @Override
    public String toString() {
        String sh = Integer.toUnsignedString(this.startHash);
        String eh = Integer.toUnsignedString(this.endHash);
        return "(" + regionName + ", " + sh + ", " + eh + ")";
    }
}
