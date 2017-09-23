
package proyecto_ipc;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Grafica_circulos {
public static void main(String[] args) {

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        pieDataset.setValue("Estudiante1", new Integer(1));
        pieDataset.setValue("Estudiante2", new Integer(1));
        pieDataset.setValue("Estudiante3", new Integer(1));
        pieDataset.setValue("Estudiante4", new Integer(1));
        pieDataset.setValue("Estudiante1", new Integer(1));
        
        JFreeChart chart = ChartFactory.createPieChart(
                "",
                pieDataset,
                true,
                true,
                false
        );

        
        ChartFrame frame = new ChartFrame("DINERO TRANSFERIDO", chart);
        frame.pack();
        frame.setVisible(true);

    }

    
}
