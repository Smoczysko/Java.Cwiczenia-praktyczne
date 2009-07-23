/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.15: Uzycie instrukcji if...else
*  Wykorzystaj instrukcje if...else do stwierdzenia, czy wartosc zmiennej typu calkowitego jest mniejsza od zera.
*/

public class Main {
  public static void main (String[] args) {
    int a = -10;
    if (a > 0) {
      System.out.println("Zmienna a jest wiêksza od zera");
    }
    else {
      System.out.println("Zmienna a jest mniejsza od zera");
    }
  }
}
