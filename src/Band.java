public class Band {
    private double rate;
    private int upper_lim;
    private int lower_lim;
    private int width;

    Band(int upper_lim,double rate){
        this.upper_lim = upper_lim;
        this.rate = rate;
    }

    Band(double rate){
        this.rate = rate;
    }


}
