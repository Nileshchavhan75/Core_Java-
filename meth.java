public class meth {
    public static void main(String args[]){
                String str1 = "Hello";
                String str2 = "Hello";
                String str3 = "hello"; // Different case
                String str4 = new String("Hello"); // Creating a new String object
        
                // Using equals() method
                System.out.println("str1 equals str2: " + str1.equals(str2)); // Output: true
                System.out.println("str1 equals str3: " + str1.equals(str3)); // Output: false
                System.out.println("str1 equals str4: " + str1.equals(str4)); // Output: true
            }
        }
        
        
            public class StringReplaceExample {
            public static void main(String[] args) {
                String originalString = "Hello, World!";
                
                // Replacing a character
                String replacedCharString = originalString.replace('o', 'a');
                System.out.println("Original String: " + originalString); // Output: Hello, World!
                System.out.println("Replaced 'o' with 'a': " + replacedCharString); // Output: Hella, Warld!
        
                // Replacing a substring
                String replacedSubstringString = originalString.replace("World", "Java");
                System.out.println("Replaced 'World' with 'Java': " + replacedSubstringString); // Output: Hello, Java!
            }
        }
        public class StringCaseExample {
            public static void main(String[] args) {
                String str = "Hello, World!";
        
                // Converting to uppercase
                String upperStr = str.toUpperCase();
                System.out.println("Original String: " + str); // Output: Hello, World!
                System.out.println("Uppercase String: " + upperStr); // Output: HELLO, WORLD!
            }
        }
          
   