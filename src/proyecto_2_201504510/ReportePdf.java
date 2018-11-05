/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;


import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static java.awt.JobAttributes.DestinationType.FILE;


/**
 *
 * @author Alejandro
 */
public class ReportePdf {
    
  private static String FILE = "c:/temp/FirstPdf.pdf";
  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
  private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL, BaseColor.RED);
  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD);
  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD);
  Monopoly monopoly;
  
    public ReportePdf(Monopoly monopoly) {
        super();
        this.monopoly = monopoly;
    }
    public void reportePropiedadesVenta(){
        Document document = new Document();
        try {

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("ReportePropiedadesVenta.pdf"));
            String newline = " ";
            document.open();
            document.add(new Paragraph("REPORTE No.3"));
            document.add(new Paragraph("REPORTE DE PROPIEDADES EN VENTA"));
            document.add(new Paragraph(newline));
            document.add(new Paragraph(newline));
            Paragraph paragraph1 = new Paragraph(" ");

            document.add(new Paragraph(newline));
            document.add(new Paragraph("TERRENOS A LA  VENTA"));
            document.add(new Paragraph(newline));
            //----------------------------------------------------------------------------------
            int i;
            for (i = 0; i < monopoly.terrenos.length; i++) {
                if (monopoly.listaterrenos.buscarPropiedad(i + 1).isVendida() == false) {
                    document.add(new Paragraph(monopoly.listaterrenos.buscarPropiedad(i + 1).getNumeropropiedad() + ")" + monopoly.listaterrenos.buscarPropiedad(i + 1).getCarta().getTitulo()));
                    document.add(new Paragraph("Estado: " + "en venta"));
                    document.add(new Paragraph("Dueño: " + monopoly.listaterrenos.buscarPropiedad(i + 1).getDueño().getNombre()));
                    document.add(new Paragraph(newline));
                }
            }
            //----------------------------------------------------------------------------------
            document.add(new Paragraph(newline));
            document.add(new Paragraph("COMPAÑIAS DE TRANSPORTE A LA VENTA"));
            document.add(new Paragraph(newline));
            int k;
            for (k = 0; k < monopoly.transporte.length; k++) {
                if (monopoly.listatransportes.buscarPropiedad(k + 1).isVendida() == false) {
                    document.add(new Paragraph( monopoly.listatransportes.buscarPropiedad(k + 1).getNumeropropiedad() + ")" + monopoly.listatransportes.buscarPropiedad(k + 1).getCarta().getTitulo()));
                    document.add(new Paragraph("Estado: " + "en venta"));
                    document.add(new Paragraph("Dueño: " + monopoly.listatransportes.buscarPropiedad(k + 1).getDueño().getNombre()));
                    document.add(new Paragraph(newline));
                }
            }
            //-------------------------------------------------------------------------------------
            document.add(new Paragraph(newline));
            document.add(new Paragraph("COMPAÑIAS DE SERVICIO A LA VENTA"));
            document.add(new Paragraph(newline));
            int j;
            for (j = 0; j < monopoly.servicio.length; j++) {
                if (monopoly.listaservicios.buscarPropiedad(j + 1).isVendida() == false) {

                    document.add(new Paragraph(monopoly.listaservicios.buscarPropiedad(j + 1).getNumeropropiedad() + ")" + monopoly.listaservicios.buscarPropiedad(j + 1).getCarta().getTitulo()));
                    document.add(new Paragraph("en venta"));
                    document.add(new Paragraph(monopoly.listaservicios.buscarPropiedad(j + 1).getDueño().getNombre()));
                    document.add(new Paragraph(newline));
                }
            }
            
            //--------------------------------------------------------------------------------------
            paragraph1.setSpacingBefore(50);

            document.add(paragraph1);
            
            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void reporteDinero() {
        Document document = new Document();
        try {
            String newline = " ";
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("ReporteEfectivo.pdf"));
            document.open();
            document.add(new Paragraph("MONOPOLY VIRTUAL"));
            document.add(new Paragraph(newline));
            document.add(new Paragraph(newline));
            document.add(new Paragraph("REPORTE No.3"));
            document.add(new Paragraph("REPORTE DEL DINERO CORRESPONDIENTE A CADA JUGADOR"));
            document.add(new Paragraph(newline));
            document.add(new Paragraph(newline));
            Paragraph paragraph1 = new Paragraph();

            document.add(new Paragraph("DINERO EN EL BANCO:" + " " + monopoly.banco2.banco.getDinero()));
            document.add(new Paragraph(newline));
            Jugador actual;
            if (monopoly.listajugadores.getCabeza() != null) {
                int i = 0;
                for (actual = monopoly.listajugadores.getCabeza(); actual != null; actual = actual.getSiguiente()) {

                    System.out.println("Nombre jugador:" + " " + actual.getNombre() + "DINERO:" + " " + actual.getDinero());
                    document.add(new Paragraph("Nombre jugador:" + " " + actual.getNombre()));
                    document.add(new Paragraph("DINERO:" + " " + actual.getDinero()));
                    document.add(new Paragraph(newline));
                    document.add(new Paragraph(newline));
                }
            } else {
                document.add(new Paragraph("Los jugadores no han sido creados"));
                System.out.println("Los jugadores no han sido creados.");
            }
            paragraph1.setSpacingBefore(50);
            document.add(paragraph1);
            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
