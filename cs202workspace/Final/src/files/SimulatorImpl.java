package files;

import java.util.Random;

public class SimulatorImpl implements Simulator {
	/* a more complex example would check for many possible exceptions, for example if min > max!*/
	
	@Override
	public double[] getGaussianDoubles(double mean, double std, int count, double min, double max) {
		double[] nums = new double[count];
		Random r = new Random();
		double randDoub;
		for (int counter = 0; counter < nums.length; counter++){
			randDoub = r.nextGaussian() * std + mean;
			// it's pretty hard to set limits for the values in a good way, so here is a hacky way.
			if(randDoub > max) randDoub = max;
			if(randDoub < min) randDoub = min;
			nums[counter] = randDoub;
		}
		return nums;
	}
		
	@Override
	public int[] getLinearInts(int count, int min, int max) {
		int[] nums = new int[count];
		Random r = new Random();
		int randInt;
		for (int counter = 0; counter < nums.length; counter++){
			randInt = r.nextInt(count) + min;
			nums[counter] = randInt;					
		}
		return nums;
	}
		
	@Override
	public boolean[] getBooleans(int count, double proportionTrue){
		Random r = new Random();
		boolean[] vals = new boolean[count];
		
		for(int counter = 0; counter < vals.length; counter++)
			vals[counter]=(Math.abs(r.nextDouble())<= proportionTrue);
		return vals;
	}
}
