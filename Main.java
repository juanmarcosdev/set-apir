/*
PROBLEMA: Pair Sum (Two Sum - decisión)

Dado un arreglo de n enteros (pueden repetirse y pueden ser negativos) y un entero X,
determina si existen DOS elementos en posiciones distintas i != j tales que:

    a[i] + a[j] = X

ENTRADA (por consola, 2 líneas)
- Línea 1: n X
- Línea 2: n enteros a1 a2 ... an (separados por espacios)

SALIDA
- Imprime "YES" si existe al menos un par (i, j) con i != j y a[i] + a[j] = X.
- En caso contrario imprime "NO".

EJEMPLOS

Entrada:
5 9
2 7 11 15 1
Salida:
YES

Entrada:
4 10
1 2 3 4
Salida:
NO


*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        System.out.println(existsPairSum(a, x) ? "YES" : "NO");
    }


    static boolean existsPairSum(long[] a, long x) {
        // TODO
        return false;
    }

}
