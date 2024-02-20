public class FSLexicalAnalyzer {
    private String FS_String = ""; 
    private String[] Lexicons; 

    public void setFS_String(String s) { FS_String = s; }

    public String getFS_String() { return FS_String; }

    public Boolean testFS_String() throws Exception {
        if (FS_String == "") {
            throw new Exception("No string set to scan or test! Pass string to scanner first."); 
        }

        String currState = "S"; 
        String finalState = "OUT";

        for (int i = 0; i < FS_String.length(); i++) {
            if (FS_String.charAt(i) == ' ') { continue; } // ignore spaces
            currState = lexiconMap(currState, FS_String.charAt(i)); 
            if (currState == "ERR") { break; }
        }

        if (currState == finalState) { return true; }
        else {
            return false; 
        }
    }

    public void scanFS_String() {

    }

    private String lexiconMap(String state, char symbol) {
        char[] delimeters = { '+', '-', '*', '/', ';', '(', ')', '=' };     // holds valid characters 
        boolean isDelim = true; 

        // checks if the symbol is valid
        if (!Character.isDigit(symbol) && !Character.isLetter(symbol) && symbol != '_') {
            boolean isValid = false; 
            // check for bad characters
            for (int i = 0; i < delimeters.length; i++) {
                if (symbol == delimeters[i]) { 
                        isValid = true;  
                    break;
                }
            }

            // returns ERR with no matching excepted char
            if (!isValid) { return "ERR" ;}
        }
        else {
            isDelim = false; 
        }
        
        // return mapping
        if (state == "S" && Character.isLetter(symbol)) {
            return "ID"; 
        }
        else if (state == "ID" && Character.isLetter(symbol)) {
            return "ID";
        }
        else if (state == "ID" && Character.isDigit(symbol)) {
            return "ID"; 
        }
        else if (state == "ID" && symbol == '_') {
            return "ID";
        }
        else if (state == "S" && isDelim) {
            return "OUT"; 
        }
        else if (state == "ID" && isDelim) {
            return "OUT"; 
        }
        else {
            return "ERR"; 
        }
    }

    public static void main(String[] args) {
        FSLexicalAnalyzer scanner = new FSLexicalAnalyzer(); 
        String testInput = "i2bc=i+a3+( C + D3) ; ";

        scanner.setFS_String(testInput);
        System.out.println("Scanning: \"" + testInput + "\""); 
        try {
            System.out.println("Is valid: " + scanner.testFS_String());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage()); 
            System.exit(0);
        }


    }
}