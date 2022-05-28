package hackerank;

class Day14Scope {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Day14Scope(int[] elements){
        this.elements = elements;
    }
    
    public int computeDifference(){
        int length = this.elements.length;
        int tempMax = -1;
        int tempMin = 99999;
        for(int i=0; i<length; i++){
            if(this.elements[i] > tempMax)
                tempMax = this.elements[i];
            if(this.elements[i] < tempMin)
                tempMin = this.elements[i];
        }
        this.maximumDifference = tempMax - tempMin;
        return this.maximumDifference;
    }
} // End of Difference class
