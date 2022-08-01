import java.util.Scanner;

public class    Main {
    public static void main(String[] args) {

        String a;
//        a = "IX * IX";
        Scanner in = new Scanner(System.in);
        a = in.nextLine();/**/
        String b,c,d;
        String [] strings = a.split(" ");
        if (strings.length>3){
            try {
                throw new Exception();
            }catch (Exception e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                System.exit (0);
            }
        } else if (strings.length!=3) {
            try {
                throw new Exception();
            }catch (Exception e) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                System.exit (0);
            }
        }
        b=strings [0];
            c=strings [1];
            d=strings [2];
            if ((b.indexOf("0")==0 || b.indexOf("1")==0 || b.indexOf("2")==0 || b.indexOf("3")==0 || b.indexOf("4")==0 || b.indexOf("5")==0 || b.indexOf("6")==0 || b.indexOf("7")==0 || b.indexOf("8")==0 || b.indexOf("9")==0)&&(d.indexOf("0")==0 || d.indexOf("1")==0 || d.indexOf("2")==0 || d.indexOf("3")==0 || d.indexOf("4")==0 || d.indexOf("5")==0 || d.indexOf("6")==0 || d.indexOf("7")==0 || d.indexOf("8")==0 || d.indexOf("9")==0)) {
                b=ravno(b,c,d);
                System.out.println(b);
            }   else if ((b.indexOf("I")==0 || b.indexOf("V")==0 || b.indexOf("X")==0) && (d.indexOf("I")==0 || d.indexOf("V")==0 || d.indexOf("X")==0 )) {
                b=ravno(perevod(b),c,perevod(d));
                if (Integer.parseInt(b)<0){
                    try {
                        throw new Exception();
                    }catch (Exception e) {
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                    }
                }
                if (Integer.parseInt(b)==0){
                    try {
                        throw new Exception();
                    }catch (Exception e) {
                        System.out.println("throws Exception //т.к. в римской системе нет нуля");
                    }
                }
                perevod2(b,c);
            }else if (((b.indexOf("0")==0 || b.indexOf("1")==0 || b.indexOf("2")==0 || b.indexOf("3")==0 || b.indexOf("4")==0 || b.indexOf("5")==0 || b.indexOf("6")==0 || b.indexOf("7")==0 || b.indexOf("8")==0 || b.indexOf("9")==0)&&(d.indexOf("I")==0 || d.indexOf("V")==0 || d.indexOf("X")==0 ))||((b.indexOf("I")==0 || b.indexOf("V")==0 || b.indexOf("X")==0)&&(d.indexOf("0")==0 || d.indexOf("1")==0 || d.indexOf("2")==0 || d.indexOf("3")==0 || d.indexOf("4")==0 || d.indexOf("5")==0 || d.indexOf("6")==0 || d.indexOf("7")==0 || d.indexOf("8")==0 || d.indexOf("9")==0))){
                try {
                    throw new Exception();
                }catch (Exception e) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (0);
                }
            }else {
                try {
                    throw new Exception();
                }catch (Exception e) {
                    System.out.println("throws Exception //т.к. введено некорректное число");
                    System.exit (0);
                }
            }
        }
    public static String perevod(String y){
        switch (y) {
            case "I":
                y="1";
                break;
            case "II":
                y="2";
                break;
            case "III":
                y="3";
                break;
            case "IV":
                y="4";
                break;
            case "V":
                y="5";
                break;
            case "VI":
                y="6";
                break;
            case "VII":
                y="7";
                break;
            case "VIII":
                y="8";
                break;
            case "IX":
                y="9";
                break;
            case "X":
                y="10";
                break;
            default:
                if (true){
                    try {
                        throw new Exception();
                    }catch (Exception e) {
                        System.out.println("throws Exception //т.к. введено некорректное число");
                        System.exit (0);
                    }
                }

        }
        return y;
    }
    public static String ravno(String q,String w,String e){

        switch (w) {
            case "+":
                return (""+(Integer.parseInt(q) + Integer.parseInt(e)));/**/
            case "-":
                return (""+(Integer.parseInt(q) - Integer.parseInt(e)));/**/
            case "*":
                return (""+(Integer.parseInt(q) * Integer.parseInt(e)));/**/
            case "/":
                return (""+(Integer.parseInt(q) / Integer.parseInt(e)));/**/
            default:
                if (true){
                    try {
                        throw new Exception();
                    }catch (Exception f) {
                        System.out.println("throws Exception //т.к. строка не является математической операцией");
                        System.exit (0);
                    }
                }
                return "";
        }
    }
    public static void perevod2(String y,String g){
        switch (Integer.parseInt(y)/10) {
            case 0:
                g = "";
                break;
            case 1:
                g = "X";
                break;
            case 2:
                g = "XX";
                break;
            case 3:
                g = "XXX";
                break;
            case 4:
                g = "XL";
                break;
            case 5:
                g = "L";
                break;
            case 6:
                g = "LX";
                break;
            case 7:
                g = "LXX";
                break;
            case 8:
                g = "LXXX";
                break;
            case 9:
                g = "XC";
                break;
            case 10:
                g = "C";
                break;
        }
        switch (Integer.parseInt(y)%10) {
            case 0:
                g += "";
                break;
            case 1:
                g += "I";
                break;
            case 2:
                g += "II";
                break;
            case 3:
                g += "III";
                break;
            case 4:
                g += "IV";
                break;
            case 5:
                g += "V";
                break;
            case 6:
                g += "VI";
                break;
            case 7:
                g += "VII";
                break;
            case 8:
                g += "VIII";
                break;
            case 9:
                g += "IX";
                break;
        }
        System.out.println(g);
    }
}