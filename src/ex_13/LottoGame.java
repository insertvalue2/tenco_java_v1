package ex_13;

public class LottoGame {
    
    public static void main(String[] args) {
        int gameNumber1 = LottoNumberMaker.makeNumber();
        int gameNumber2 = LottoNumberMaker.makeNumber();
        int gameNumber3 = LottoNumberMaker.makeNumber();
        int gameNumber4 = LottoNumberMaker.makeNumber();
        int gameNumber5 = LottoNumberMaker.makeNumber();
        int gameNumber6 = LottoNumberMaker.makeNumber();
        
        // 6번의 패스를 거쳐 정렬
        for (int pass = 1; pass <= 6; pass++) {
            if (gameNumber1 > gameNumber2) {
                int temp = gameNumber1;
                gameNumber1 = gameNumber2;
                gameNumber2 = temp;
            }
            if (gameNumber2 > gameNumber3) {
                int temp = gameNumber2;
                gameNumber2 = gameNumber3;
                gameNumber3 = temp;
            }
            if (gameNumber3 > gameNumber4) {
                int temp = gameNumber3;
                gameNumber3 = gameNumber4;
                gameNumber4 = temp;
            }
            if (gameNumber4 > gameNumber5) {
                int temp = gameNumber4;
                gameNumber4 = gameNumber5;
                gameNumber5 = temp;
            }
            if (gameNumber5 > gameNumber6) {
                int temp = gameNumber5;
                gameNumber5 = gameNumber6;
                gameNumber6 = temp;
            }
        }
        
        // 정렬된 번호 출력
        System.out.print(gameNumber1 + "\t");
        System.out.print(gameNumber2 + "\t");
        System.out.print(gameNumber3 + "\t");
        System.out.print(gameNumber4 + "\t");
        System.out.print(gameNumber5 + "\t");
        System.out.print(gameNumber6 + "\t");
    }
    
}

