package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // 문자열 입력받기
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String str = Console.readLine();

        // 구분자에 따라 분류하기
        String[] strArr;
        int sum = 0;
        if(str.startsWith("//") && str.contains("\\n")){
            String op = str.substring(2,3);
            str = str.substring(5);
            strArr = str.split(op);
        }else {
                strArr = str.split(",|:");
        }
    }
}
