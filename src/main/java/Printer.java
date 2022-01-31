public class Printer {
    private int remainingSheets;

    public Printer(int startingSheets){
        this.remainingSheets = startingSheets;
    }

    public int getRemainingSheets() {
        return remainingSheets;
    }

    public void print(int pages, int copies){
        int sheetsRequired = pages * copies;
        if (this.remainingSheets >= sheetsRequired) {
            this.remainingSheets -= sheetsRequired;
        }
    }
}
