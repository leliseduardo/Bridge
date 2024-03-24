package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTemperaturaTest {
    @Test
    void deveRetornarSalarioSensorTemperaturaComEnsinoMedio() {
        Conexao Conexao = new ConexaoCabeada();
        SensorTemperatura SensorTemperatura = new SensorTemperatura(1.0f);
        SensorTemperatura.setConexao(Conexao);
        assertEquals(1.9f, SensorTemperatura.calculaDelayTotal(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSensorTemperaturaComGraduacao() {
        Conexao Conexao = new ConexaoBluetooth();
        SensorTemperatura SensorTemperatura = new SensorTemperatura(1.0f);
        SensorTemperatura.setConexao(Conexao);
        assertEquals(1.4f, SensorTemperatura.calculaDelayTotal(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSensorTemperaturaComMestrado() {
        Conexao Conexao = new ConexaoWifi();
        SensorTemperatura SensorTemperatura = new SensorTemperatura(1.0f);
        SensorTemperatura.setConexao(Conexao);
        assertEquals(1.1f, SensorTemperatura.calculaDelayTotal(), 0.01f);
    }
}