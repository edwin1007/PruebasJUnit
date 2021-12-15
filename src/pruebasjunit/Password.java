
package pruebasjunit;

public class Password {
    
    public enum SecurityLevel{
        Debil, Medio, Alto
    }
    
    public static SecurityLevel contraseña(String password){
        
        if(password.length() < 8){
            return SecurityLevel.Debil;
        }
        
        if(password.matches("[a-zA-Z]+")){
            return SecurityLevel.Debil;
        }
        
        if(password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.Medio;
        }
        else{
            return SecurityLevel.Alto;
        }
    }
}
