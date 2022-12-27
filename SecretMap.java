import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SecretMap {




    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryA = new String[n];
        String[] binaryB = new String[n];
        int[][] binaryArray1 = new int[n][n];
        int[][] binaryArray2 = new int[n][n];
        int[][] binaryArraySum = new int[n][n];
        String[][] binaryArraySumToString = new String[n][n];
        String[][] binaryCharA = new String[n][n];
        String[][] binaryCharB = new String[n][n];

        for (int i = 0; i < n; i++) {
            binaryA[i] = Integer.toBinaryString(arr1[i]);
            binaryB[i] = Integer.toBinaryString(arr2[i]);
        }
        int x = 0;
        while (x < n){
            if (binaryA[x].length() < n){
                binaryA[x] = "0"+binaryA[x];
            }else x++;
        }
        x = 0;
        while (x < n){
            if (binaryB[x].length() < n){
                binaryB[x] = "0"+binaryB[x];
            }else x++;
        }



        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                binaryCharA[i][j] = String.valueOf(binaryA[i].charAt(j));
                binaryCharB[i][j] = String.valueOf(binaryB[i].charAt(j));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j =0; j< n; j++){
                binaryArray1[i][j] = Integer.parseInt(binaryCharA[i][j]);
                binaryArray2[i][j] = Integer.parseInt(binaryCharB[i][j]);
                binaryArraySum[i][j] = binaryArray1[i][j] + binaryArray2[i][j];
                binaryArraySumToString[i][j] = String.valueOf(binaryArraySum[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Objects.equals(binaryArraySumToString[i][j], "0")){
                    binaryArraySumToString[i][j] = " ";
                }else binaryArraySumToString[i][j] = "#";
            }
        }
        for (int i = 0; i < n; i++) {
            answer[i] = String.join("",binaryArraySumToString[i]);
        }


//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++) {
//                if (binaryArraySumToString[i][j] != "0"){
//                    binaryArraySumToString[i][j] = "#";
//                } else if (binaryArraySumToString[i][j] == "0"){
//                    binaryArraySumToString[i][j] = " ";
//                }
//            }
//        }
        return answer;
    }
}
