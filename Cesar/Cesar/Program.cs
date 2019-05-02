using System;

namespace Cesar
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Menu();
        }
        private static void Menu()
        {

            while(true)
            {
                Console.ForegroundColor = ConsoleColor.Yellow;
                Console.WriteLine("    >=>");
                Console.WriteLine(" >=>   >=>");
                Console.WriteLine(">=>          >==>     >===>     >=> >=>  >> >==> ");
                Console.WriteLine(">=>        >>   >=>  >=>      >=>   >=>   >=>");
                Console.WriteLine(">=>        >>===>>=>   >==>  >=>    >=>   >=>");
                Console.WriteLine(" >=>   >=> >>            >=>  >=>   >=>   >=>");
                Console.WriteLine("   >===>    >====>   >=> >=>   >==>>>==> >==>  ");
                Console.ForegroundColor = ConsoleColor.Cyan;
                Console.Write("\n\n Cipher [1]   Decipher[2]   Exit[3]: ");

                int op = Convert.ToInt16(Console.ReadLine());

                if (op == 3) break;

                Console.Write("\n Write a Word: ");
                String word = Console.ReadLine();

                Console.Write("\n Write a Key: ");
                int key = Convert.ToInt32(Console.ReadLine());

                if (op == 1) CipherOrDecipher(word, key);
                else if (op == 2) CipherOrDecipher(word, -key);
                else Console.WriteLine("Nop");

                Console.ReadLine();
                Console.Clear();
            }
        }

        private static void CipherOrDecipher(String word, int value)
        {
            char[] letter = word.ToCharArray();
            String result = "";

            foreach(char l in letter)
                result += (char)(value + ((int)l));

            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("\n Result: " + result);
        }
    }
}
