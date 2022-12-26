import java.util.*;

public class OverlapSegment {

    public static void main(String[] args) {

    }
    public int solution(int[][] lines){
        int answer = 0;
        // 교집합 시 값이 변하므로 lines[0][0~1]의 값을 두번 담기위해 네개 생성
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        List<Integer> listD = new ArrayList<>();

        // lines[0][1]의 값보다 1 낮게 값 담기
        for (int i = lines[0][0]; i < lines[0][1];i ++){
            if (i+0.5 < lines[0][1]) {
                listA.add(i);
                listD.add(i);
            }

        }
        // 위와 같음
        for (int i = lines[1][0]; i < lines[1][1];i ++){
            if (i+0.5 < lines[1][1]) {
                listB.add(i);
            }
        }
        // =
        for (int i = lines[2][0]; i < lines[2][1];i ++){
            if (i+0.5 < lines[2][1]) {
                listC.add(i);
            }
        }
        // 교집합 시키기
        listA.retainAll(listB);
        listB.retainAll(listC);
        listC.retainAll(listD);

        // 교집합 시킨 값 listA에 모두 합치기
        listA.addAll(listC);
        listA.addAll(listB);

        // set으로 바꿔 중복값 제거
        Set<Integer> set = new HashSet<>(listA);
        answer =set.size();
        return answer;
    }


}
