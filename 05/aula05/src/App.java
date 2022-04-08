public class App {
    public static void main(String[] args) throws Exception {
        Veiculo fusca = new Veiculo();
        Veiculo celta = new Veiculo();

        fusca.tipoVeiculo = "auto passeio";
        fusca.qtdPortas = 2;
        fusca.capacidadeLitros = 41;
        fusca.consumoLitros = 9.2f;

        celta.tipoVeiculo = "auto passeio";
        celta.qtdPortas = 4;
        celta.capacidadeLitros = 54;
        celta.consumoLitros = 9.5f;

        System.out.println(celta.capacidadeLitros);
        System.out.println(celta.consumoLitros);
        System.out.println(celta.qtdPortas);

        fusca.autonomia();
        celta.autonomia();
    }
}