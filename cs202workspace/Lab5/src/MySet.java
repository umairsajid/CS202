

public class MySet implements MyMath<MySet> {

	int[] set;

	public MySet(int[] set){
		this.set = removeCopies(set);
			
	}
	
	public static int[] removeCopies(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                count++;
            }
        }
        
        int[] array = new int[count];
        int k = 0;
        
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
            	array[k] = arr[i];
            	k++;
            }
        }
        
        return array;
    }

	public int[] getSet() {
		return set;
	}

	public void setSet(int[] set) {
		removeCopies(set);
		this.set = set;
	}

	@Override
	//Union of two sets
	public MySet add(MySet o) {
		int lengthOfNewArray = this.getSet().length + o.getSet().length;
		
		int[] array = new int[lengthOfNewArray];
		
		for(int i = 0; i < this.getSet().length; i++){
			array[i] = this.getSet()[i];
		}
		for(int i = 0; i < o.getSet().length; i++){
			array[i + this.getSet().length] = o.getSet()[i];
		}
		
		array = removeCopies(array);
		
		o.setSet(array);
		
		return o;
	}

	@Override
	public MySet subtract(MySet o) {
		int count = 0;
		
		for(int i = 0; i < this.getSet().length; i++){
			for(int j = 0; j < o.getSet().length; j++){
				int k = 0;
				if(this.getSet()[i] == o.getSet()[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						count++;
					}
				}
			}
		}
		
		int[] array = new int[count];
		int p = 0;
		
		for(int i = 0; i < this.getSet().length; i++){
			for(int j = 0; j < o.getSet().length; j++){
				int k = 0;
				if(this.getSet()[i] == o.getSet()[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						array[p] = this.getSet()[i];
						p++;
					}
				}
			}
		}
		
		o.setSet(array);
		
		return o;
	}

	@Override
	public MySet divide(MySet o) {
		// The Relative Compliment of two sets basically displays the numbers in the 1st set only that don't repeat in the 2nd set 
		//Step 1: Find the number of numbers the two sets have in common
		int count = 0;

		for(int i = 0; i < this.getSet().length; i++){
			for(int j = 0; j < o.getSet().length; j++){
				int k = 0;
				if(this.getSet()[i] == o.getSet()[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						count++;
					}
				}
			}
		}
		
		//Step 2: Make an array that is equal to the first set
		int[] array1 = this.getSet();
		
		//Step 3: Make an array that holds the numbers that the sets have in common 
		int[] array2 = new int[count];
		int d = 0;
		
		for(int i = 0; i < this.getSet().length; i++){
			for(int j = 0; j < o.getSet().length; j++){
				int k = 0;
				if(this.getSet()[i] == o.getSet()[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						array2[d] = this.getSet()[i];
						d++;
					}
				}
			}
		}
		
		// Step 4:
		int count2 = 0;

		for(int i = 0; i < array2.length; i++){
			for(int j = 0; j < array1.length; j++){
				int k = 0;
				if(array2[i] == array1[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						count2++;
					}
				}
			}
		}

		int[] array3 = new int[array1.length - count2];
		int p = 0;

		for(int i = 0; i < array2.length; i++){
			for(int j = 0; j < array1.length; j++){
				if(array2[i] != array1[j]){
					array3[p] = array1[j];
					p++;
				}
			}
		}
		
		o.setSet(array3);
		
		return o;
	}

	@Override
	public MySet multiply(MySet o) {
		//Symmetric difference is basically Union/Intersection
		
		//Step 1: make an array that is the union of the two sets
		int lengthOfNewArray = this.getSet().length + o.getSet().length;

		int[] array1 = new int[lengthOfNewArray];

		for(int i = 0; i < this.getSet().length; i++){
			array1[i] = this.getSet()[i];
		}
		for(int i = 0; i < o.getSet().length; i++){
			array1[i + this.getSet().length] = o.getSet()[i];
		}
		
		array1 = removeCopies(array1);
		
		
		//Step 2: Make another array the is the intersection of the two sets.
		int count1 = 0;

		for(int i = 0; i < this.getSet().length; i++){
			for(int j = 0; j < o.getSet().length; j++){
				int k = 0;
				if(this.getSet()[i] == o.getSet()[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						count1++;
					}
				}
			}
		}

		int[] array2 = new int[count1];
		int p = 0;

		for(int i = 0; i < this.getSet().length; i++){
			for(int j = 0; j < o.getSet().length; j++){
				int k = 0;
				if(this.getSet()[i] == o.getSet()[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						array2[p] = this.getSet()[i];
						p++;
					}
				}
			}
		}
		
		//Step 3: Make a new array that removes intersection numbers from union numbers
		int count2 = 0;
		
		for(int i = 0; i < array2.length; i++){
			for(int j = 0; j < array1.length; j++){
				int k = 0;
				if(array2[i] == array1[j]){
					if(k != this.getSet()[i]){
						k = this.getSet()[i];
						count2++;
					}
				}
			}
		}
		
		int[] array3 = new int[array1.length - count2];
		int d = 0;

		for(int i = 0; i < array2.length; i++){
			for(int j = 0; j < array1.length; j++){
				if(array2[i] != array1[j]){
					array3[d] = array1[j];
					d++;
				}
			}
		}
		
		o.setSet(array3);
		
		return o;
	}
	
	public String toString(){
		String s = "{ ";
		for (int i = 0; i < set.length; i++) {
			s += set[i] + " ";
		}
		s += "}";
		return s;
	}
}
