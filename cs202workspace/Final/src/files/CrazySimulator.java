package files;

import java.util.Random;

public class CrazySimulator implements Simulator {


	@Override
	public double[] getGaussianDoubles(double mean, double std, int count, double min, double max) {
		double[] nums = new double[count];
		Random r = new Random();
		double randDoub;
		if(count % 2 != 1){
			for (int counter = 0; counter < nums.length/2; counter++){
				randDoub = r.nextGaussian() * std + mean;
				// it's pretty hard to set limits for the values in a good way, so here is a hacky way.
				if(randDoub > max) randDoub = max;
				if(randDoub < min) randDoub = min;
				nums[counter] = randDoub;
			}
			for (int counter = nums.length/2; counter < nums.length; counter++){
				randDoub = r.nextGaussian() * std - mean;
				// it's pretty hard to set limits for the values in a good way, so here is a hacky way.
				if(randDoub > max) randDoub = max;
				if(randDoub < min) randDoub = min;
				nums[counter] = randDoub;
			}
		}
		if(count % 2 == 1){
			for (int counter = 0; counter < 1; counter++){
				randDoub = r.nextGaussian() * std + mean;
				// it's pretty hard to set limits for the values in a good way, so here is a hacky way.
				if(randDoub > max) randDoub = max;
				if(randDoub < min) randDoub = min;
				nums[counter] = randDoub;
			}
			for (int counter = 1; counter < ((nums.length-1)/2)+1; counter++){
				randDoub = r.nextGaussian() * std + mean;
				// it's pretty hard to set limits for the values in a good way, so here is a hacky way.
				if(randDoub > max) randDoub = max;
				if(randDoub < min) randDoub = min;
				nums[counter] = randDoub;
			}
			for (int counter = ((nums.length-1)/2)+1; counter < nums.length; counter++){
				randDoub = r.nextGaussian() * std - mean;
				// it's pretty hard to set limits for the values in a good way, so here is a hacky way.
				if(randDoub > max) randDoub = max;
				if(randDoub < min) randDoub = min;
				nums[counter] = randDoub;
			}
		}
		return nums;
	}

	@Override
	public int[] getLinearInts(int count, int min, int max) {
		int[] nums = new int[count];
		Random r = new Random();
		int randInt;
		if(!(min + (count - 1) > max)){
			for (int counter = 0; counter < nums.length; counter++){
				randInt = min + r.nextInt(count - 1);
				nums[counter] = randInt;					
			}
		}
		else{
			for (int counter = 0; counter < nums.length; counter++){
				randInt = r.nextInt(count) + min;
				nums[counter] = randInt;					
			}
		}
		
		return nums;
	}

	@Override
	public boolean[] getBooleans(int count, double proportionTrue) {
		Random r = new Random();
		boolean[] vals = new boolean[count];
		
		for(int counter = 0; counter < vals.length; counter++)
			vals[counter]=(Math.abs(r.nextDouble())<= proportionTrue);
		return vals;
	}

}
