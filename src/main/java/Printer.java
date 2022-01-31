public class Printer {
    private int remainingSheets;
    private int remainingToner;

    public Printer(int startingSheets, int startingToner){
        this.remainingSheets = startingSheets;
        this.remainingToner = startingToner;
    }

    public int getRemainingSheets() {
        return this.remainingSheets;
    }

    public int getRemainingToner() {
        return this.remainingToner;
    }

    public void print(int pages, int copies){
        int sheetsRequired = pages * copies;
        if (this.remainingSheets >= sheetsRequired) {
            this.remainingSheets -= sheetsRequired;
            this.remainingToner -= sheetsRequired;
        }
    }
}
