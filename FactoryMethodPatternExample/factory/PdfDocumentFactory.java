// factory/PdfDocumentFactory.java
package factory;

import documents.Document;
import documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
