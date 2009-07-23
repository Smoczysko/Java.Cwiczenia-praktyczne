/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.17: Zastosowanie instrukcji if...else if
*  Napisz kod obliczajacy pierwiastki rownania kwadratowego o parametrach zadanych w programie.
*  Wykorzystaj instrukcje if...else if.
*/

public class Main {
  public static void main (String[] args) {
    int parametrA = 1, parametrB = -1, parametrC = -6;
    System.out.println("Parametry równania: ");
    System.out.println("A: " + parametrA + " B: " + parametrB + " C: " + parametrC + "\n");
    if (parametrA == 0) {
      System.out.println("To nie jest równanie kwadratowe: A = 0!");
    }
    else {
      double delta = parametrB * parametrB - 4 * parametrA * parametrC;
      double wynik;
      if (delta < 0) {
        System.out.println("Delta < 0");
	System.out.println("To równanie nie ma rozwi¹zañ w zbiorze liczb rzeczywistych");
      }
      else if (delta == 0) {
	  wynik = - parametrB / 2 * parametrA;
	  System.out.println("Rozwi¹zanie: x = " + wynik);
      }
      else {
	  wynik = (- parametrB + Math.sqrt(delta)) / 2 * parametrA;
	  System.out.println("Rozwi¹zanie: x1 = " + wynik);
	  wynik = (- parametrB - Math.sqrt(delta)) / 2 * parametrA;
	  System.out.println("Rozwi¹zanie: x2 = " + wynik);
      }
    }
  }
}
