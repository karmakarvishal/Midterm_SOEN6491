package org.jfree.chart.plot;

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
}
