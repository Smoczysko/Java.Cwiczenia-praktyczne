/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.18: Uzycie instrukcji wyboru switch
*  Uzywajac instrukcji switch, napisz program sprawdzajacy, czy wartosc zadeklarowanej zmiennej jest rowna 1, czy 10.
*  Wyswietl na ekranie stosowny komunikat.
*/

public class Main {
  public static void main (String[] args) {
    int a = 10;
    switch (a) {
      case 1:
        System.out.println("a = 1");
	break;
      case 10:
        System.out.println("a = 10");
	break;
      default:
        System.out.println("a nie jest równe ani 1, ani 10");
    }
  }
}
