public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
        String temp = "";
        char temp2 = rotorValues.charAt(rotorValues.length()-1);
        temp = temp2 + rotorValues;
        rotorValues = temp;
        return true;
    }
    

    public int indexOf(char c){
        //TODO
        String temp = "" + c;
        for (int i = 0; i < rotorValues.length(); i++) {
            if (rotorValues.substring(i, i+1).equals(temp)) {
                return i;
            }
        }
        return -1;
    }

    public char charAt(int idx){
        //TODO
        char[] temp = rotorValues.toCharArray();
        return temp[idx];
    }
}
    
