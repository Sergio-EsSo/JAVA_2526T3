package futbol;

public class testeoFutbol {

    public static void main(String[] args) {
        
        Tecnico tec = new Tecnico("Claudio", "Giráldez", 36, 10, true);

        Portero port = new Portero("Vicente", "Guaita", 37, true, 45);

        Defensa[] def = {
            new Defensa("Carl", "Starfelt", 28, true),
            new Defensa("Óscar", "Mingueza", 25, true),
            new Defensa("Javi", "Rodríguez", 21, true),
            new Defensa("Marcos", "Alonso", 33, true)
        };

        Mediocampo[] med = {
            new Mediocampo("Fran", "Beltrán", 25, true, 5),
            new Mediocampo("Hugo", "Sotelo", 20, true, 3),
            new Mediocampo("Williot", "Swedberg", 20, true, 4),
            new Mediocampo("Jonathan", "Bamba", 28, true, 8)
        };

        Delantero[] del = {
            new Delantero("Iago", "Aspas", 36, true, 204),
            new Delantero("Borja", "Iglesias", 31, true, 78)
        };

        EquipoFutbol selecao = new EquipoFutbol("Celta de Vigo", "España", tec, port, def, med, del);

        selecao.imprimir();
    }
}