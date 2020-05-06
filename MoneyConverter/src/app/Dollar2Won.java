package app;
import lib.*;

public class Dollar2Won extends Converter {

	public Dollar2Won(double ratio) {
		this.ratio=ratio;
	}

	public static void main(String[] args) {
		Dollar2Won toWon = new Dollar2Won(1200);
		toWon.run();
	}

	@Override
	protected double convert(double src) {
		return src*ratio;
	}

	@Override
	protected String getSrcString() {
		return "´Þ·¯";
	}

	@Override
	protected String getDestString() {
		return "¿ø";
	}

}
