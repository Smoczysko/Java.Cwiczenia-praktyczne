/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga �ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.16: Pierwiastki rownania kwadratowego
*  Wykorzystaj operacje arytmetyczne oraz instrukcje if...else do obliczenia pierwiastkow rownania kwadratowego o
*  parametrach podanych bezposrednio w kodzie programu.
*/

public class Main {
  public static void main (String[] args) {
    int parametrA = 1, parametrB = -1, parametrC = -6;
    System.out.println("Parametry r�wnania: ");
    System.out.println("A: " + parametrA + " B: " + parametrB + " C: " + parametrC + "\n");
    if (parametrA == 0) {
      System.out.println("To nie jest r�wnanie kwadratowe: A = 0!");
    }
    else {
      double delta = parametrB * parametrB - 4 * parametrA * parametrC;
      if (delta < 0) {
        System.out.println("Delta < 0");
	System.out.println("To r�wnanie nie ma rozwi�za� w zbiorze liczb rzeczywistych");
      }
      else {
        double wynik;
	if (delta == 0) {
	  wynik = - parametrB / 2 * parametrA;
	  System.out.println("Rozwi�zanie: x = " + wynik);
	}
	else {
	  wynik = (- parametrB + Math.sqrt(delta)) / 2 * parametrA;
	  System.out.println("Rozwi�zanie: x1 = " + wynik);
	  wynik = (- parametrB - Math.sqrt(delta)) / 2 * parametrA;
	  System.out.println("Rozwi�zanie: x2 = " + wynik);
	}
      }
    }
  }
}
