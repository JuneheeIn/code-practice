package stage.first;


import java.util.Scanner;

class FirstStage {
    public void twoFiveFiveSeven() {
        System.out.print("Hello World!");
    }

    public void oneZeroSevenOneEight() {
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
    }

    public void oneZeroOneSevenOne() {
        // Escape 문자 처리
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    public void oneZeroOneSevenTwo() {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }

    public void oneZeroZeroZero() {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        System.out.print(firstValue + secondValue);
    }

    public void oneZeroZeroOne() {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        System.out.print(firstValue - secondValue);
    }

    public void oneZeroNineNineEight() {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        System.out.print(firstValue * secondValue);
    }

    public void oneZeroZeroEight() {
        Scanner scanner = new Scanner(System.in);

        double firstValue = scanner.nextInt();
        double secondValue = scanner.nextInt();

        System.out.print(firstValue / secondValue);
    }

    public void oneZeroEightSixNine() {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        System.out.println(firstValue + secondValue);
        System.out.println(firstValue - secondValue);
        System.out.println(firstValue * secondValue);
        System.out.println(firstValue / secondValue);
        System.out.println(firstValue % secondValue);
    }

    public void oneZeroFourThreeZero() {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();

        System.out.println((firstValue + secondValue) % thirdValue);
        System.out.println(((firstValue % thirdValue) + (secondValue % thirdValue)) % thirdValue);
        System.out.println((firstValue * secondValue) % thirdValue);
        System.out.println(((firstValue%thirdValue) * (secondValue%thirdValue)) % thirdValue);
    }

    public void twoFiveEightEight() {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();

        int onesPlace = secondValue % 10;
        int tensPlace = secondValue % 100 / 10;
        int hundredsPlace = secondValue / 100;

        System.out.println(firstValue * onesPlace);
        System.out.println(firstValue * tensPlace);
        System.out.println(firstValue * hundredsPlace);
        System.out.println(firstValue * secondValue);
    }

    public static FirstStage instance() {
        return new FirstStage();
    }
}
