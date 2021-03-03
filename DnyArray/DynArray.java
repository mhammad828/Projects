
public class DynArray {
	private double[] array;
	private int size;
	private int nextIndex;

	public DynArray() {// constructor

		// set array to a new array of double, of size one
		array = new double[1];
		// set size to one,
		size = 1;
		// and set nextIndex to zero.
		nextIndex = 0;
	}
	public int arraySize() {	// accessor
		// return the value of size.
		return this.size;
	}

	public int elements() {
		// return the value of nextIndex.
		return this.nextIndex;
	}

	public double at(int index) {
		
		if(0<=index && index < nextIndex) {
			// return the value of array[index].		
			return array[index];
		}else {
			return Double.NaN;
		}	
	}

	private void grow() {
		double [] Array = new double [size*2];
		for(int i = 0; i<(size); ++i) {
			Array[i]=array[i];
		}
		size *= 2;	
		array = Array;



		// and contains the same values for indicies 0 through
		// nextIndex - 1, and adjust size appropriately.
		// make array a reference to an array that is twice as large
	}

	private void shrink() {
		double [] Array1 = new double [size/2];
		for(int i = 0; i<(size/2); ++i){
			Array1[i] = array[i];
		}

		size /= 2;	
		array = Array1;
		// make array a reference to an array that is half as large
		// and contains the same values for indicies 0 through
		// nextIndex - 1, and adjust size appropriately.
	}

	public void insertAt(int index, double value) {// mutator
			
		if(0 <= index && index <= nextIndex) {
			while(size==nextIndex) {
				grow();	
			}

			array[nextIndex]= value ;
			nextIndex++;
			return;
		}
	}
	// move the nessecary values over one so that value can
	// be incerted at the location index in the array, inserts
	// incerts value at the location index, and adjust nextIndex
	//appropriately.
	// else
	// do nothing.

	public void insert(double value) {// mutator
		while(size==nextIndex) {
			grow();	
		}

		array[nextIndex]= value ;
		nextIndex++;

	}
	//	// insert value at location nextIndex.

	public double removeAt(int index) {// mutator
		if(0 <= index && index < nextIndex) {
			nextIndex--;
			double tempArray = array[index];
			for(int i = index; i<nextIndex;++i) {
				array[i]=array[i+1];
			}
			return tempArray;
		}else {
			return Double.NaN;
		}
	}// if 0 <= index < nextIndex
	// move the nessecary values over one as to eliminate
	// the value at the location index in the array, adjust
	// nextIndex appropriately, and return the value that was
	// at the location index .
	// else
	// return Double.NaN.
	public double remove() {
		if((size/2)==nextIndex && size !=1) {
			shrink();	
		}
		if(nextIndex > 0 ) {
			--nextIndex;
		}else if(nextIndex == 0) {
			array[0]= Double.NaN;
		}
		return this.array [nextIndex];
	}

	// return the removal of the value at location nextIndex-1.
	public void printArray() {
		for(int i = 0; i < nextIndex; i++)
			System.out.println("array.at(" + i + ") = " + array[i]);
	}
	// prints the values of all occupied locations of the array to
	// the screen
}
