public class Main{
    public static void main(String[] args){
        long[] c = new long[8];
        for (int i = 0; i <= c.length-1; i++){
            c[i] = (9-i)*2;
        }

        double[] x = new double[13];
        for (int i = 0; i<=x.length-1; i++){
            x[i] = (13.0+15.0)*Math.random()-15.0;
        }

        createMatrix(c, x);
    }

    public static void createMatrix(long[] c, double[] x){
        double[][] b = new double[8][13];
        for (int i = 0; i<=c.length-1; i++){
            for (int j = 0; j <= x.length-1; j++){
                if (c[i] == 14L){
                    double znamenatel = Math.pow(Math.E, Math.abs(x[j]));
                    b[i][j] = Math.asin( Math.pow((1.0/znamenatel), 2));
                }
                else if (c[i] == 4L || c[i] == 8L || c[i] == 16L || c[i] == 18L){
                    double pokazatel = Math.pow(2*Math.cos(x[j]), 3);
                    double chislitel = Math.pow((3+x[j])/3.0, 3);
                    double znamenatel = Math.pow(Math.E, x[j]) + 3.0/4.0;
                    b[i][j] = Math.pow(Math.PI/(chislitel/znamenatel + 1), pokazatel);
                }
                else{
                    double cos = Math.cos(Math.sin(x[j]));
                    double chislitel = Math.cbrt(cos);
                    b[i][j] = Math.pow((chislitel/2)/3, 3);
                }
            }
        }
        printMatrix(b);
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i<= 7; i++){
            for (int j = 0; j<= 12; j++){
                System.out.printf("%7.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}