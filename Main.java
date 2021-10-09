import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Введите возраст:");
        int age = input.nextInt();
 
        System.out.printf("%s", NumInWord(age));
    }
 
    static String NumInWord(int num)
    {
        if (num <= 0 || num > 99)
            return "Возраст находится вне диапазона";
 
        String[] units = { "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять" } ;
        String[] firstTen = { "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятьнадцать", "шестьнадцать", "семьнадцать", "восемьнадцать", "девятнадцать" } ;
        String[] tens = { "", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" } ;
 
        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (num % 10 == 1){
                    return (units[num].toString() + " год");
                }
                else if (num % 10 > 1 && num % 10 < 5) {
                    return (units[num].toString() + " года");
                }
                else {
                    return (units[num].toString() + " лет");
                }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return (firstTen[num - 10].toString() + " лет");
            default:
                return tens[(int) num / 10].toString() + " " + NumInWord(num % 10).toString();
        }
    }
}
