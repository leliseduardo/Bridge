package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorUmidadeTest {
    @Test
    void deveRetornarSalarioSensorUmidadeComEnsinoMedio() {
        Conexao Conexao = new ConexaoCabeada();
        SensorUmidade SensorUmidade = new SensorUmidade(0.5f);
        SensorUmidade.setConexao(Conexao);
        assertEquals(1.4f, SensorUmidade.calculaDelayTotal(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSensorUmidadeComGraduacao() {
        Conexao Conexao = new ConexaoBluetooth();
        SensorUmidade SensorUmidade = new SensorUmidade(0.5f);
        SensorUmidade.setConexao(Conexao);
        assertEquals(0.9f, SensorUmidade.calculaDelayTotal(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSensorUmidadeComMestrado() {
        Conexao Conexao = new ConexaoWifi();
        SensorUmidade SensorUmidade = new SensorUmidade(0.5f);
        SensorUmidade.setConexao(Conexao);
        assertEquals(0.6f, SensorUmidade.calculaDelayTotal(), 0.01f);
    }
}