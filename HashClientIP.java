/**
 * 
 */
public class HashClientIP {
    

    /**
     * Constructor.
     */
    public HashClientIP() {
    }
    

    /**
     * Hash the specified client IP
     */
    public Integer hash(String clientIP) {

        // **** initialization ****
        Integer hash = 0;

        // **** split client IP ****
        String[] strArr = clientIP.split("\\.", 4);

        // **** hash client IP ****
        for (int i = 0; i < 4; i++) {
            hash <<= 8;
            hash |= Integer.parseInt(strArr[i]);
        }

        // **** return associated hash ****
        return hash;
    }
}