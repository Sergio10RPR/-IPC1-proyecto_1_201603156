
package proyecto_ipc;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graficas_2 extends JFrame{
    public void Grafica_pie(){
    

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(1, "2017", "Enero");
        dataset.setValue(0, "2017", "Febrero");
        
        dataset.setValue(1, "2017", "Marzo");
        dataset.setValue(5, "2017", "Abril");
        
        dataset.setValue(0, "2017", "Mayo");
        dataset.setValue(8, "2017", "Junio");
        
        dataset.setValue(5, "2017", "Julio");
        dataset.setValue(3, "2017", "Agosto");
        
        dataset.setValue(3, "2017", "Septiembre");
        dataset.setValue(1, "2017", "Octubre");
        
        dataset.setValue(3, "2017", "Noviembre");
        dataset.setValue(2, "2017", "Diciembre");
        
        
        
        JFreeChart chart = ChartFactory.createBarChart(
                "TTRANSACCIONES",
                "MESES", 
                "No.", 
                dataset, 
                PlotOrientation.VERTICAL,
                true, 
                false, 
                false
        );
        
        //
        ChartFrame frame = new ChartFrame("Ejemplo Grafica de Barras", chart);
        frame.pack();
        frame.setVisible(true);
    }
    }
