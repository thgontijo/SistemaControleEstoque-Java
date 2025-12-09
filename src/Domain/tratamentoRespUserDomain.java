package Domain;

public class tratamentoRespUserDomain {
    public static boolean tratamentoSimOuNao(String respUser){
        if(!respUser.equalsIgnoreCase("s") && !respUser.equalsIgnoreCase("n")){
            return false;
        }
        return true;
    }
}
