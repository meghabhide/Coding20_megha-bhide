class VowelsConsonant {

    public static void main(String[] args) {
      String line = "What si coming is better than what is going";
      int vowels = 0, consonants = 0, digits = 0, spaces = 0;
  
      line = line.toLowerCase();
      for (int i = 0; i < line.length(); ++i) {
        char ch = line.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          ++vowels;
        }
        else if ((ch >= 'a' && ch <= 'z')) {
          ++consonants;
        }
      }
  
      System.out.println("Vowels: " + vowels);
      System.out.println("Consonants: " + consonants);
    }
  }