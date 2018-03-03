/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasaxparsetodom;

import java.io.File;
import javax.lang.model.element.Element;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Jordan
 */
public class DomLoader {
    public static Dom load(File xmlCourseFile) throws Exception {
        Dom dom = new Dom();
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            
            DefaultHandler handler = new DefaultHandler() {
                Node node = null;
                
                boolean flag = false;
                
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    
                    if (qName != null && node == null) {
                        node = new Node();
                        String attributeString = attributes.getValue(qName);
                        if (attributeString != null) {
                            node.setAttribute(attributeString);
                        }                 
                        flag = true;
                    }
                }
                
                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    if (qName!= null){
                        dom.addNode(node);
                        node = null;
                        flag = false;
                    }
                    
                }
                
                @Override
                public void characters(char ch[], int start, int length) throws SAXException {
                    if (flag) {
                        if (node != null) {
                            node.setData(new String(ch, start, length));
                        }
                    }
                    }
                
            };
            
            saxParser.parse(xmlCourseFile.getAbsoluteFile(), handler);
            
        } catch (Exception e) {
            throw e;
        }
        
      return dom; 
    }
}
