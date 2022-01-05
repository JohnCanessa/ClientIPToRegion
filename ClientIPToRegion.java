import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 */
public class ClientIPToRegion {


    /**
     * Test scaffold
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // ***** initialization ****
        String clientIP = null;

        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read number of regions ****
        int n = Integer.parseInt(br.readLine().trim());

        // ???? ????
        System.out.println("main <<< n: " + n);

        // **** declare array of region strings****
        String[] regStrs = new String[n];

        // **** loop reading information for regions ****
        for (int i = 0; i < n; i++)
            regStrs[i] = br.readLine().trim();

        // **** read first client IP ****
        clientIP = br.readLine().trim();

        // ???? ????
        for (int i = 0; i < n; i++)
            System.out.println("main <<< regStrs[" + i + "] ==>" + regStrs[i] + "<==");
        System.out.println("main <<< clientIP ==>" + clientIP + "<==");

        // **** create and populate the regions binary tree ****
        BST bst     = new BST();
        bst.root    = bst.insert(regStrs);

        // ???? ????
        System.out.println("main <<< inOrder: ");
        System.out.print(bst.inOrder(bst.root));

        // **** ****
        while (!clientIP.equals("-1")) {

            // **** hash client IP ****
            HashClientIP hashClientIP = new HashClientIP();
            int hash = hashClientIP.hash(clientIP);

            // ???? ????
            // System.out.println("main <<< hash: " + Integer.toUnsignedString(hash) + " hex: 0x" + Integer.toHexString(hash));

            // **** find node in binary tree ****
            System.out.println("main <<< find(" + clientIP + "): " + bst.find(bst.root, hash));

            // **** read next client IP ****
            clientIP = br.readLine().trim();           
        }

        // **** close buffered reader ****
        br.close();
    }
}