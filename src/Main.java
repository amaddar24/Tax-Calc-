import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> bands = new ArrayList<>();
        bands.add(12570);
        bands.add(50270 - 12571);
        bands.add(150000 - 50271);
        bands.add(150001);
        //
        ArrayList<Double> percentages = new ArrayList<>();
        percentages.add(0.0);
        percentages.add(0.2);
        percentages.add(0.4);
        percentages.add(0.45);

        int PP = 63000;
        int i = 0;
        double tax = 0;

        Band PA = new Band(12570,0);
        Band BR = new Band(50270,0.2);
        Band HR = new Band(150000, 0.4);
        Band AR = new Band(0.45);


        while ((i < 4) && (PP > 0)) {

            double band_rate = PP < bands.get(i) ? PP : bands.get(i);
            tax = tax + band_rate*percentages.get(i);
            PP = PP - bands.get(i);

            i++;
        }
        System.out.println(tax);
    }


}
