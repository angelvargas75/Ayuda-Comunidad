using System;

namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {
            Ejemplo1();
            Console.ReadKey();
        }

        public static void Ejemplo1()
        {
            int[] numeros = new int[3];
            int j = 0;
            int suma = 0;
            for (int i = 0; i < numeros.Length; i++)
            {
                Console.WriteLine("Ingrese el numero " + (j + 1));
                numeros[i] = Convert.ToInt32(Console.ReadLine());
                j++;
                if (numeros[i] % 2 != 0)
                {
                    if (numeros[i] <= 400)
                        suma += numeros[i];
                    else
                        Console.WriteLine("Es mayor que 400");
                }
                else
                    Console.WriteLine("Es numero par");
            }
            Console.WriteLine("\nSUMA: " + suma);
        }
    }
}
