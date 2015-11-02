package files;

public interface Simulator {

	public double[] getGaussianDoubles(double mean, double std, int count, double min, double max);
	
	public int[] getLinearInts(int count, int min, int max);
	
	public boolean[] getBooleans(int count, double proportionTrue);
}
