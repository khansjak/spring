package com.jak.location.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.springframework.stereotype.Component;

@Component
public class ReportUtilImpl implements ReportUtil {

	@Override
	public void generatePiChart(String path, List<Object[]> dataset) {
		
		DefaultPieDataset dataset1 = new DefaultPieDataset();
		
		for(Object[] objects : dataset) {
			dataset1.setValue(objects[0].toString(), new Double(objects[1].toString()));
		}
		JFreeChart chart = ChartFactory.createPieChart3D("Location Report", dataset1, false, false, false);
		try {
			ChartUtilities.saveChartAsJPEG(new File(path+"/pieChart.jpeg"), chart, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
