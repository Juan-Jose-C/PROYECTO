package Codigo_Java;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {

//-------------------------------Pagina de Inicio------------------------------------------------------------------
    public static String getVistaInicioBanner() throws SQLException {
        String html = "";
        Modelo_ConsultaInicio modeloIn = new Modelo_ConsultaInicio();
        for (Modelo_ConsultaInicio In : modeloIn.getSelectConsultaAvis0sConcocatorias(1)) {
            html += "<img src=\"Imagenes/" + In.getRuta_Imagen() + "\">";
        }
        return html;
    }

    public static String getVistaInicioConvocatorias() throws SQLException {
        String html = "";
        Modelo_ConsultaInicio modeloIn = new Modelo_ConsultaInicio();
        for (Modelo_ConsultaInicio In2 : modeloIn.getSelectConsultaAvis0sConcocatorias(2)) {
            html += "<div class=\"card\" >"
                    + "<button id=\"imgproceso\" onclick=\"abrir(this.value)\" value=\"Url/" + In2.getRuta_Url() + "\"><img id=\"imgproceso2\" src=\"Imagenes/" + In2.getRuta_Imagen() + "\"></button>"
                    + " </div>";
        }
        return html;
    }

    public static String getVistaInicioavisos() throws SQLException {
        String html = "";
        Modelo_ConsultaInicio modeloIn = new Modelo_ConsultaInicio();
        for (Modelo_ConsultaInicio In3 : modeloIn.getSelectConsultaAvis0sConcocatorias(3)) {
            html += "<div class=\"card\">\n"
                    + "   <button id=\"imgproceso\" onclick=\"abrir(this.value)\" value=\"Url/" + In3.getRuta_Url() + "\"><img id=\"imgproceso2\" src=\"Imagenes/" + In3.getRuta_Imagen() + "\"></button>\n"
                    + "                    </div>";
        }

        return html;
    }
//--------------------------------pagina de Directorio de la coordinacion------------------------------------------
    static int inc = 0;
    static ArrayList<Integer> IdArea = new ArrayList<>();

    public static String getVistaCatalogoArea() throws SQLException {
        Modelo_ConsultaDirectorioCoordinacion modeloD = new Modelo_ConsultaDirectorioCoordinacion();
        String htmlcode = "";
        for (Modelo_ConsultaDirectorioCoordinacion D : modeloD.getSelectConsultaCatalogoArea()) {
            inc++;
            htmlcode += " <li class=\"nav-item\">\n"
                    + "          <a class=\"nav-link\"  id=\"pills-coordinacion-tab\" data-toggle=\"pill\" href=\"#pills-coordinacion" + inc + "\" role=\"tab\" aria-controls=\"pills-coordinacion\" aria-selected=\"false\">" + D.getLonarea() + "</a>\n"
                    + "      </li>\n"
                    + "     ";
            IdArea.add(D.getIdarea());
        }
        return htmlcode;
    }

    public static String getVistaDirectorio() throws SQLException {
        String htmlcode2 = "";
        Modelo_ConsultaDirectorioCoordinacion modeloD = new Modelo_ConsultaDirectorioCoordinacion();
        for (int i = 1; i <= inc; i++) {
            // System.out.println("aaa "+inc+" ++ "+i + "  "+IdArea.get(i-1));
            if (i == 1) {
                htmlcode2 += "<div class=\"tab-pane active\" id=\"pills-coordinacion" + i + "\" role=\"tabpanel\" aria-labelledby=\"pills-coordinacion-tab\">";
            } else {
                htmlcode2 += "<div class=\"tab-pane fade\" id=\"pills-coordinacion" + i + "\" role=\"tabpanel\" aria-labelledby=\"pills-coordinacion-tab\">";
            }
            for (Modelo_ConsultaDirectorioCoordinacion D : modeloD.getSelectConsultaDirectorio(IdArea.get(i - 1))) {
                htmlcode2
                        += "       <p>Nombre :" + D.getNombre() + " </p>\n"
                        + "       <p>Puesto :" + D.getPuesto() + " </p>\n"
                        + "       <p>Ext :" + D.getExt() + " </p>\n"
                        + "       <p>Correo Electrónico :" + D.getEmail() + " </p><hr style=\"color:#000000;\"><hr size=\"10\">\n"
                        + "  ";
            }
            htmlcode2 += "</div>\n";
        }
        inc = 0;
        return htmlcode2;
    }
//--------------------------- Pagina de Oferta Educativa-----------------------------------------------------

    public static String getVistaCatalogoPrograma() throws SQLException {
        String html = "";
        Modelo_ConsultaOfertaEducativa modeloEdu = new Modelo_ConsultaOfertaEducativa();
        for (Modelo_ConsultaOfertaEducativa edu : modeloEdu.getSelectConsultaCatalogoPrograma()) {
            html += "<button name=\"nombre\" class=\"btn-ghost red secundary round\" value=\"" + edu.getId_carrera() + "\">" + edu.getNombreCarrera() + "</button>  \n";
        }
        return html;
    }

    public static String getVistaOfertaEducativa(int Oferta) throws SQLException {
        String html = "";
        Modelo_ConsultaOfertaEducativa modeloOfe = new Modelo_ConsultaOfertaEducativa();
        for (Modelo_ConsultaOfertaEducativa edu : modeloOfe.getSelectConsultaOfertaEducativa(Oferta)) {
            html += "<button onclick=\"abrir(this.value)\" value=\"Carreras/carrera/" + edu.getPdf_informacion() + ".pdf\" class=\"btn-ghost red secundary round\">" + edu.getCarrera() + "</button>  \n";
        }

        return html;
    }
    //-----------------------Pagina Colegios en los Estados


    public static String getVistatabla() throws SQLException {
        String htmlcode2 = "";
        Modelo_ConsultaColegioenlosEstados modeloD = new Modelo_ConsultaColegioenlosEstados();
        
            for (Modelo_ConsultaColegioenlosEstados D : modeloD.getSelectConsultaColegiosenlosEstados()) {
                htmlcode2+="<tr >\n" +
"                                    <td>"+D.getEstado()+"</td>\n" +
"                                    <td>"+D.getDirector()+"</td>\n" +
"                                    <td>"+D.getDireccion()+"</td>\n" +
"                                    <td>"+D.getTelefono()+"</td>\n" +
"                                </tr>";
            }
            return htmlcode2;
        }
    
    public static String getVistabuscador() throws SQLException {
        String htmlcode2 = "";
        Modelo_ConsultaColegioenlosEstados modeloD = new Modelo_ConsultaColegioenlosEstados();
            for (Modelo_ConsultaColegioenlosEstados D : modeloD.getSelectConsultaColegiosenlosEstados()) {
                htmlcode2+="<tr>\n" +
"						<td><a id=\"colr\" href=\"#\">"+D.getEstado()+"</a>"+D.getDirector()+"<br>" +
"						"+D.getDireccion()+"<br>"+D.getTelefono()+"</td>" +
"					</tr>";
            }
            return htmlcode2;
        }
}
