/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author gubec
 */
public class Premios {

    public static Integer premioBrasil;
    public static Integer premioChile;
    public static Integer premioArgentina;
    public static Integer premioEquador;
    public static Integer premioColombia;
    public static Integer premioUruguai;
    public static Integer premioParaguai;
    public static Integer premioVenezuela;
    public static Integer premioGuiana;
    public static Integer premioGuianaFrancesa;
    public static Integer premioSuriname;
    public static Integer premioPeru;
    public static Integer premioBolivia;

    public void iniciarPremios() {
        this.premioBrasil = 0;
        this.premioChile = 0;
        this.premioArgentina = 0;
        this.premioEquador = 0;
        this.premioColombia = 0;
        this.premioUruguai = 0;
        this.premioParaguai = 0;
        this.premioVenezuela = 0;
        this.premioGuiana = 0;
        this.premioGuianaFrancesa = 0;
        this.premioSuriname = 0;
        this.premioPeru = 0;
        this.premioBolivia = 0;
    }

    public void premios(final String paisPremio, final boolean jaIncrementou) {
        if (!jaIncrementou) {
            switch (paisPremio.toLowerCase()) {
                case "brasil":
                    this.premioBrasil++;
                    break;
                case "chile":
                    this.premioChile++;
                    break;
                case "argentina":
                    this.premioArgentina++;
                    break;
                case "equador":
                    this.premioEquador++;
                    break;
                case "colômbia":
                    this.premioColombia++;
                    break;
                case "uruguai":
                    this.premioUruguai++;
                    break;
                case "paraguai":
                    this.premioParaguai++;
                    break;
                case "venezuela":
                    this.premioVenezuela++;
                    break;
                case "guiana":
                    this.premioGuiana++;
                    break;
                case "guiana francesa":
                    this.premioGuianaFrancesa++;
                    break;
                case "suriname":
                    this.premioSuriname++;
                    break;
                case "peru":
                    this.premioPeru++;
                    break;
                case "bolívia":
                    this.premioBolivia++;
                    break;
            }
        }
    }
}
