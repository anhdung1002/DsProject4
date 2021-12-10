public class SortStatistics {
    int numCompare;
    int numSwap;
    int returnArray [];

    public SortStatistics(){
        numCompare = 0;
        numSwap = 0;
        returnArray = null;
    }

    public int getNumCompare() {
        return this.numCompare;
    }

    public void setNumCompare(int numCompare) {
        this.numCompare = numCompare;
    }

    public int getNumSwap() {
        return this.numSwap;
    }

    public void setNumSwap(int numSwap) {
        this.numSwap = numSwap;
    }

    public int [] getReturnArray() {
        return this.returnArray;
    }

    public void setReturnArray(int returnArray[]) {
        this.returnArray = returnArray;
    }

    
    
}
