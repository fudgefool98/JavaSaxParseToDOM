/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasaxparsetodom;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.type.TypeMirror;

/**
 *
 * @author Jordan
 */
public class Node{
    public String attribute;
    public String data;
    
    public ArrayList<Node> contains;
    public ArrayList<Attribute> attributes;
    
    public Node(){
    
}
    public void setAttribute(String attribute){
        this.attribute = attribute;
    }
    public void setData(String data){
        this.data = data;
    }
    
    
}
