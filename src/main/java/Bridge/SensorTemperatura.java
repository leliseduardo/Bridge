package Bridge;

public class SensorTemperatura extends Sensores{

    public SensorTemperatura(float delayNormal){
        super(delayNormal);
    }

    @Override
    public float calculaDelayTotal() {
        return delayNormal + this.conexao.delayComunicacao();
    }
}
