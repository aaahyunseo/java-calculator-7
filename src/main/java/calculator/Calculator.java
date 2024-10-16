package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Calculator {
    /**
     * 문자열 입력받기
     * **/
    private static String input(){
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return Console.readLine();
    }

    /**
     * 구분자에 따라 문자열 분리하는 함수
     * **/
    private static String[] operator(String str){
        if(str.startsWith("//") && str.substring(3,5).equals("\\n")){
            String op = str.substring(2,3);
            str = str.substring(5);
            // 백슬래시 구분자 처리
            if (op.equals("\\")) {
                op = "\\\\";
            }
            return str.split(op);
        }else {
            return str.split(",|:");
        }
    }
}