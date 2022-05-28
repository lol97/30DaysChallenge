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
        int maxDif = -1;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                int tempDif = this.elements[i] - this.elements[j];
                tempDif = tempDif < 0 ? tempDif * -1 : tempDif;
                maxDif = maxDif < tempDif ? tempDif : maxDif;
            }
        }
        this.maximumDifference = maxDif;
        return maxDif;
    }
} // End of Difference class
