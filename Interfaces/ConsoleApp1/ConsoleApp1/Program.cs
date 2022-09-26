// See https://aka.ms/new-console-template for more information
using System.Runtime.InteropServices;

Console.WriteLine("Ejercicio1 \n -------------");
if (DateTime.Now.Hour < 14) Console.WriteLine("Buenos Dias!");
else Console.WriteLine("Buenas Tardes!");

Console.WriteLine("\nEjercicio2 \n -------------");

Console.WriteLine($"Son las {DateTime.Now.ToString("hh:mm")} del {DateTime.Now.ToString("dd/mm/yy")}");

Console.WriteLine("\nEjercicio3 \n -------------");
string? frase  = Console.ReadLine();
Console.WriteLine($"La frase es {frase}");

Console.WriteLine("\nEjercicio4 \n -------------");
List<Char> letras = new List<Char>();
letras = frase.ToList();
foreach (Char c in letras)
{
    Console.WriteLine(c);
}

Console.WriteLine("\nEjercicio5 \n -------------");
for(int i = letras.Count-1; i >= 0; i--)
{
    Console.Write(letras[i]);
}

Console.WriteLine("\nEjercicio6 \n -------------");
string[] palabras = frase.Split(' ');
Console.Write($"El número de palabras de la frase es: {palabras.Length}");

Console.WriteLine("\nEjercicio7 \n -------------");
List<int> posiciones = new List<int>();
List<string> fraseRevuelta = new List<string>();

for(int i = 0; i < palabras.Length; i++)
{
    posiciones.Add(i);
}

while (posiciones.Count != 0)
{
    int aleatorio = new Random().Next(0, posiciones.Count);
    fraseRevuelta.Add(palabras[aleatorio]);
    posiciones.Remove(aleatorio);
}