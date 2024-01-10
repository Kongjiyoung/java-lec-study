package ex14.Prgramming;


interface ArrayProcessing{
    double apply(double[] array);
}

public class Ex03 {
    public static void main(String[] args) {
        // 주어진 배열
        double[] array = {1.5, 2.7, 3.1, 4.9, 2.3};

        // 람다식을 이용하여 최대값 계산
        ArrayProcessing maxLambda = (arr) -> {
            double max = arr[0]; // 초기값을 배열의 첫 번째 요소로 설정
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        };

        // 람다식을 적용하여 최대값 계산
        double max = maxLambda.apply(array);
        System.out.println("최대값: " + max);
    }
}
