import java.util.LinkedList;
import java.util.List;

public class Parser {
    // 연산 결과를 저장하는 컬렉션 필드 (LinkedList 사용)
    private List<Integer> results = new LinkedList<>();

    // 사칙연산을 수행하고 결과를 반환하는 메서드
    public int calculate(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0; // 나눗셈의 경우 0으로 나눌 수 없으므로 예외 처리
                }
                break;
            default:
                System.out.println("잘못된 연산 기호입니다.");
                return 0;
        }
        // 결과를 컬렉션에 저장
        results.add(result);
        return result;
    }

    // 연산 결과들을 반환하는 Getter 메서드
    public List<Integer> getResults() {
        return results;
    }

    // 연산 결과 중 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        } else {
            System.out.println("저장된 결과가 없습니다.");
        }
    }
}
