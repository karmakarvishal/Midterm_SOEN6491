package org.jfree.chart.plot;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class CommonPlot extends Plot {

	@Override
	public String getPlotType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void draw(Graphics2D g2, Rectangle2D area, Point2D anchor, PlotState parentState, PlotRenderingInfo info) {
		// TODO Auto-generated method stub

	}

	public abstract PlotOrientation getOrientation();

}
