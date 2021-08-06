public class Intanciando {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(2500);
        gerente.impostoSalario();

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(2000);
        supervisor.impostoSalario();

        Atendente atendente = new Atendente();
        atendente.setSalario(1750);
        atendente.impostoSalario();
    }
}
