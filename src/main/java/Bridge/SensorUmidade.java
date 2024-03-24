package Bridge;

public class SensorUmidade extends Sensores{

    public SensorUmidade(float delayNormal){
        super(delayNormal);
    }

    @Override
    public float calculaDelayTotal() {
        return delayNormal + this.conexao.delayComunicacao();
    }
}
