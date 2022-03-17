
public class testingYoungphys {
    String checkVectors( int input,int [][] x){
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < input; j++) {
                sum += x[j][i];
            }
            if (sum != 0){

                return "NO";
            }
        }
        return "YES";

    }
}