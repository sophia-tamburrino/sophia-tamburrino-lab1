public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }

    //reverse encrypt
    //start at top roter letter
    //look at inner roter letter
    //find that in the middle
    //look at inner roter letter from that middle, return that letter. Decrypted!
    //rotate
    public String decrypt(String message){        
        //TODO
        
    }


    //look at inner roter letter
    //look at top roter letter 
    //find that top roter letter on the inner wheel
    //look up from inner wheel to the top wheel and return that letter. Encrypted!
    //have to rotate after this
    public String encrypt(String message){
        //TODO
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
