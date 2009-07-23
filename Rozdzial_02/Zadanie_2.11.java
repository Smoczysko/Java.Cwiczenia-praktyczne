/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.11: Dzielenie liczb calkowitych
*  Wykonaj dzielenie zmiennych typu calkowitego. Sprawdz rezultaty w sytuacji, gdy rzeczywisty wynik jest ulamkiem.
*/

public class Main {
  public static void main (String[] args) {
    int a, b, c;
    a = 8;
    b = 3;
    c = 2;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("a / b = " + a / b);
    System.out.println("a / c = " + a / c);
    System.out.println("b / c = " + b / c);
  }
}
