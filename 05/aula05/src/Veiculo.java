class Veiculo{
    String tipoVeiculo;
    String cor;
    int qtdPortas;
    float capacidadeLitros;
    float consumoLitros;
    Calc calc = new Calc();

    public void autonomia(){
        System.out.print("Autonomia do veículo - ");
        calc.mult(capacidadeLitros, consumoLitros);
    }
}