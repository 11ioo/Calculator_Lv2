import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Parser calculator = new Parser();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num1 = 0;
            int num2 = 0;

            // 첫 번째 숫자 입력 (양수만 허용)
            while (true) {
                System.out.print("첫 번째 양의 정수를 입력하세요: ");
                num1 = sc.nextInt();
                if (num1 >= 0) {
                    break;
                } else {
                    System.out.println("양의 정수만 입력 가능합니다. 다시 입력하세요.");
                }
            }

            // 두 번째 숫자 입력 (양수만 허용)
            while (true) {
                System.out.print("두 번째 양의 정수를 입력하세요: ");
                num2 = sc.nextInt();
                if (num2 >= 0) {
                    break;
                } else {
                    System.out.println("양의 정수만 입력 가능합니다. 다시 입력하세요.");
                }
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            // 계산 수행 및 결과 출력
            int result = calculator.calculate(num1, num2, operator);
            System.out.println("연산 결과: " + result);

            // 결과 목록 출력
            System.out.println("현재 저장된 결과들: " + calculator.getResults());

            // 더 계산할 것인지 묻기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // 가장 먼저 저장된 결과를 삭제할지 묻기
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (y/n)");
            input = sc.next();
            if (input.equalsIgnoreCase("y")) {
                calculator.removeFirstResult();
                System.out.println("현재 저장된 결과들: " + calculator.getResults());
            }
        }

        sc.close();
    }
}

