import java.util.List;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        long[] c = new long[8];
        int index = 0;
        for (int i = 18; i>=4; i-=2){
            c[index] = i;
            index++;
        }

        double[] x = new double[13];
        double min = -15.0;
        double max = 13.0;
        for (int i = 0; i<=12; i++){
            x[i] = (max-min)*Math.random()+min;
        }

        createMatrix(c, x);

    }

    public static void createMatrix(long[] c, double[] x){
        double[][] b = new double[8][13];
        List<Long> array = Arrays.asList(4L, 8L, 16L, 18L);
        for (int i = 0; i<=7; i++){
            for (int j = 0; j <= 12; j++){
                if (c[i] == 14){
                    double znamenatel = Math.pow(Math.E, Math.abs(x[j]));
                    b[i][j] = Math.asin( Math.pow((1.0/znamenatel), 2));
                }
                else if (array.contains(c[i])){
                    double pokazatel = Math.pow(2*Math.cos(x[j]), 3);
                    double chislitel = Math.pow((3+x[j])/3.0, 3);
                    double znamenatel = Math.pow(Math.E, x[j]) + 3.0/4.0;
                    b[i][j] = Math.pow(Math.PI/(chislitel/znamenatel + 1), pokazatel);
                }
                else{
                    double cos = Math.cos(Math.sin(x[j]));
                    double chislitel = Math.cbrt(cos);
                    b[i][j] = Math.pow((chislitel/2.0)/3, 3);
                }
            }
        }
        printMatrix(b);
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i<=7; i++){
            for (int j = 0; j<=12; j++){
                System.out.printf("%7.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}