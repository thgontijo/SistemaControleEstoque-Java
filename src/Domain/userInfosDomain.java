package Domain;

public class userInfosDomain {
    private String nomeUser;
    private String nomeEstabelecimento;
    private Integer respUser;
    private int respUserMenu;

    @Override
    public String toString() {
        return "userInfosDomain{" +
                "nomeUser='" + nomeUser + '\'' +
                ", nomeEstabelecimento='" + nomeEstabelecimento + '\'' +
                '}';
    }

    public int getRespUserMenu() {
        return respUserMenu;
    }

    public void setRespUserMenu(int respUserMenu) {
        this.respUserMenu = respUserMenu;
    }

    public Integer getRespUser() {
        return respUser;
    }

    public void setRespUser(Integer respUser) {
        this.respUser = respUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }
}
