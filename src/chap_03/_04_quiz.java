package chap_03;

import java.util.Scanner;

public class _04_quiz {
    public static void main(String[] args) {

//        조건문을 이용해서 주차 요금 정산 프로그램을 작성하시오.
//        주차 요금 시간당 4000원, 일일 최대 요금 30000원, 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        Scanner s = new Scanner(System.in);

        Scanner t = new Scanner(System.in);

        while(true) {

            float sum=0, time=0;

            String car = null;

            System.out.printf("'일반 차량', '경차', '장애인 차량' 중 해당되는 것을 그대로 입력해주세요.");

            car = s.nextLine();

            System.out.printf("주차할 시간을 숫자로 적어주세요. 요금은 시간당 4000원 입니다. (최대 요금 3만원)");

            time = t.nextFloat();

            sum = time * 4000;

            if (sum > 30000) sum = 30000;

            if (car.equals("경차") || car.equals("장애인 차량")) sum /= 2.0;

            System.out.printf("당신의 주차 요금은 %.0f 원 입니다. \n", sum);

        }

    }
}
