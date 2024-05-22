import java.util.ArrayList;

public class App{
    public static void main(String[] args) throws Exception {
        ArrayList<Gerente>ListaGerentes = new ArrayList<Gerente>()
        {{
            add(new Gerente("Fernando", "1245148654", 15154, 15424));
        }};

        ArrayList<Desenvolvedor>listaDesenvolvedor = new ArrayList<Desenvolvedor>()
        {{
            add(new Desenvolvedor("Fernando", "1245148654", 15154, "PHP"));
        }};

        ArrayList<Estagiario>listaEstagiario = new ArrayList<Estagiario>()
        {{
            add(new Estagiario("Fernando", "1245148654", 154544, "Vanderlei"));
        }};

        for (var item : ListaGerentes) {
            item.ExibirDetalhes();
        }

        for (var item : listaDesenvolvedor) {
            item.exibirDetalhes();
        }
        
        for (var item : listaEstagiario) {
            item.exibirDetalhes();
        }
}
}
