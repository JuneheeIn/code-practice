package stage.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class OneThreeThreeZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
    }
}

class NineFourNineEight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int value = Integer.parseInt(str);

        if (value >= 90) {
            System.out.println('A');
        } else if (value >= 80) {
            System.out.println('B');
        } else if (value >= 70) {
            System.out.println('C');
        } else if (value >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}

class TwoSevenFiveThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int value = Integer.parseInt(str);

        boolean isLeapYear = (value % 4) == 0 && (value % 100 != 0 || value % 400 == 0);

        if (isLeapYear) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

class OneFourSixEightOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x > 0) && (y > 0))
            System.out.println("1");
        else if ((x < 0) && (y > 0))
            System.out.println("2");
        else if ((x < 0) && (y < 0))
            System.out.println("3");
        else
            System.out.println("4");
    }
}


class TwoEightEightFour {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        int hour = Integer.parseInt(stringTokenizer.nextToken());
        int minute = Integer.parseInt(stringTokenizer.nextToken());

        if (minute >= 45) {
            minute -= 45;
        } else {
            minute = 60 + minute - 45;
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
        }

        System.out.print(String.valueOf(hour) + ' ' + String.valueOf(minute));
    }
}
