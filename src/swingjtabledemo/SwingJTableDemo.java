package swingjtabledemo;

import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Ankur-Agg
 */
public class SwingJTableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JTable table;
        
        String header[] = {"Name", "RollNo", "Section"};
        String info[][] = {
            {"ABC","123","CSE 5B"},
            {"XYZ","456","CSE 5C"},
            {"AAA","222","CSE 5D"}
        };
        
        table = new JTable(info, header);
        
        JFrame frame = new JFrame("Swing JTable Demo");
        
        frame.add(table);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
