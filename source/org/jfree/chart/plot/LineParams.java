package org.jfree.chart.plot;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import org.jfree.data.Range;

public class LineParams {
	private final double start;
	private final double end;
	private final double axisMin;
	private final double axisMax;

	public LineParams(double start, double end, double axisMin, double axisMax) {
		this.start = start;
		this.end = end;
		this.axisMin = axisMin;
		this.axisMax = axisMax;
	}

	public double getStart() {
		return start;
	}

	public double getEnd() {
		return end;
	}

	public double getAxisMin() {
		return axisMin;
	}

	public double getAxisMax() {
		return axisMax;
	}

	public void drawLineFE(Graphics2D g2, Line2D line, Range range, boolean isVertical, IntervalMarker intervalMarker) {
		intervalMarker.drawLineIfInRange(g2, line, getStart(), this, range, isVertical);
		intervalMarker.drawLineIfInRange(g2, line, getEnd(), this, range, isVertical);
	}

	public void drawLineIfInRangeFE(Graphics2D g2, Line2D line, double point, Range range, boolean isVertical) {
		double axisMin = getAxisMin();
		double axisMax = getAxisMax();
		if (range.contains(point)) {
			if (isVertical) {
				line.setLine(axisMin, point, axisMax, point);
			} else {
				line.setLine(point, axisMin, point, axisMax);
			}
			g2.draw(line);
		}
	}
}
