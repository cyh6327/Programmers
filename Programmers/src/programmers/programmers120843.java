package programmers;

public class programmers120843 {
	
	public static void solution(int[] numbers, int k) {
        int answer = 0;
        int num = 0;    //공을 가지고 있는 사람
        
        // 배열을 쭉 복사시켜서 일렬로 세워났다고 가정하고 num을 2씩 더해주면서 0, 2, 4 ... 식으로 누적
        // 배열의 길이가 6인 경우
        // 0 1 2 3 4 5 0 1 2 3 4  5		배열
        // 0   2   4   6   8   10		num의 값
        //    k=1 k=2 k=3 k=4  k=5
        for(int i=0; i<k; i++) {
            num += 2;
        }
        
        // num-2 를 괄호로 안 묶어줘서 자꾸 이상한 값 나왔음,, 연산할 때 괄호 묶어주는 거 신경쓰기
        // 위의 예시에서 k=5일때 num=10 여기서 공을 던진 사람은 num-2 이므로 numbers[8]
        // numbers[8]은 numbers의 길이를 벗어나므로 벗어나지 않게 num-2의 값을 조정 후 최종 리턴
        answer = numbers[(num-2) - (((num-2)/numbers.length) * numbers.length)];
        
        System.out.println(answer);
    }
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		solution(numbers, 2);
		
		int[] numbers2 = {1, 2, 3, 4, 5, 6};
		solution(numbers2, 5);
		
		int[] numbers3 = {1,2,3};
		solution(numbers3, 3);
	}

}
