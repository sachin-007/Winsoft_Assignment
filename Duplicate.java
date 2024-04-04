class Duplicate {
    public static void main(String[] args) {
        String str = "this is the duplicate check";

        // i used regex to remove the spaces and make it to lower case 
        str = str.replaceAll("\\s", "").toLowerCase();

        // go through the each character 
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;

            // is the character is duplicate or not
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print that characters
            if (isDuplicate) {
                System.out.println(currentChar);
            }
        }
    }
}