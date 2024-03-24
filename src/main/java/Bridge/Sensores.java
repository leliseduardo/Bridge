package Bridge;

public abstract class Sensores {

    protected Conexao conexao;

    protected float delayNormal;

    public Sensores(float delayNormal){
        this.delayNormal = delayNormal;
    }

    public void setConexao(Conexao conexao){
        this.conexao = conexao;
    }

    public void setDelayNormal(float delayNormal){
        this.delayNormal = delayNormal;
    }

    public abstract float calculaDelayTotal();
}