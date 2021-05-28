package Utilitaires;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class LecteurXml {
    private String fichier;

    public LecteurXml(String fichier) {
        this.fichier = fichier;
    }

    public Proteome lireFichier(String fichier) {
        Proteome p = new Proteome();
        try {
            File fXmlFile = new File(fichier);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("entry");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    Proteines proteines = new Proteines(eElement.getElementsByTagName("name").item(0).getTextContent());
                    proteines.setNomLong(eElement.getElementsByTagName("fullName").item(0).getTextContent());
                    proteines.setSequence(eElement.getElementsByTagName("sequence").item(0).getTextContent());
                    p.ajouterProteine(proteines);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
}
