public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int reduceToner(){
       return this.toner - 1;
    }


    public int  print(int pages, int copies){
        int total = pages * copies;
        if((this.sheets >= total) && (this.toner >= 1)){

            this.toner -= total;
             int res = this.sheets -= total;
                return res;
        } else{
            System.out.println("Not Enough Paper. Please add:");
            return total - this.sheets;
        }
    }
    public int getToner(){
        return this.toner;
    }
}
