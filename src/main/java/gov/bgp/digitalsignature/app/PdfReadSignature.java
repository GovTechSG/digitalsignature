package gov.bgp.digitalsignature.app;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class PdfReadSignature {

    private static final String FILE_NAME = "invoices/signed1.pdf";

    public static void main(String[] args) {

        PdfReader reader;

        try {

            reader = new PdfReader(FILE_NAME);

            // pageNumber = 1
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
