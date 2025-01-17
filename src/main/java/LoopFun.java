import java.util.Locale;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer factorial = 1;
          for (int i = 2; i <= number; i++) {
              factorial *= i;
          }
          return factorial;
//          return (number == 1) || (number == 0) ? 1 : number * factorial(number - 1);
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String acronym = phrase.substring(0,1).toUpperCase();
          for (int i = 1; i < phrase.length() - 1; i++) {
              if (phrase.charAt(i) == ' ') {
                  acronym += phrase.substring(i+1, i+2).toUpperCase();
              }
          }
          return acronym;
//          String[] acronym = phrase.split(" ");
//          iterate over acronym and build all caps acronym
//            kris demo'ed enhanced for to iterate
//          kris put result.toUpperCase in return statment!

      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String alphabet = "abcdefghijklmnopqrstuvwxyz";
          StringBuilder encryptedWord = new StringBuilder();
          for (int i = 0; i < word.length(); i++) {
              int index = alphabet.indexOf(word.charAt(i));
              index += 3;
              index %= 26;
              encryptedWord.append(alphabet.charAt(index));
          }
          return encryptedWord.toString();
      }
}
