import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> bands = new ArrayList<>();
        bands.add(12570);
        bands.add(50270 - 12571);
        bands.add(150000 - 50271);
        bands.add(150001);

        ArrayList<Double> percentages = new ArrayList<>();
        percentages.add(0.0);
        percentages.add(0.2);
        percentages.add(0.4);
        percentages.add(0.45);


        int PP = 63000;
        int i = 0;
        double tax = 0;

        while ((i < bands.size()) && (PP > 0)) {
            double band_rate = PP < bands.get(i) ? PP : bands.get(i);
            tax = tax + band_rate*percentages.get(i);
            PP = PP - bands.get(i);

            i++;
        }
        System.out.println(tax);
    }


}
