/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphev2;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import netflow.Fulkerson;

/**
 * FXML Controller class
 *
 * @author Houssem Hamila
 */
public class InterfaceSaisieController implements Initializable {
    ObservableList <String> type_choixList=FXCollections.observableArrayList("4 Noeuds","5 Noeuds");
    @FXML
    private TextField tfston1;
    @FXML
    private TextField tfston2;
    @FXML
    private TextField tfston3;
    @FXML
    private TextField tfn1ton2;
    @FXML
    private TextField tfn1ton3;
    @FXML
    private TextField tfn2ton3;
    @FXML
    private TextField tfn2ton1;
    @FXML
    private TextField tfn2tot;
    @FXML
    private TextField tfn3ton1;
    @FXML
    private TextField tfn3ton2;
    @FXML
    private TextField tfn1tot;
    @FXML
    private TextField tfn3tot;
    @FXML
    private Button btngenerate;
    @FXML
    private Button btnannuler;
    @FXML
    private ComboBox choix;
    @FXML
    private ImageView img;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choix.setValue("5 Noeuds");
        choix.setItems(type_choixList);
        Image img1 = new Image("assets/splash.png");
        img.setImage(img1);
        
        
       
    }  
    
    @FXML 
    public void disabledInputs(){
       
         if(choix.getValue().equals("5 Noeuds")){
             
             tfston3.setDisable(false);
              tfn1ton3.setDisable(false);
              tfn2ton3.setDisable(false);
              tfn3ton2.setDisable(false);
              tfn3tot.setDisable(false); 
                tfn3ton1.setDisable(false); 
              
              
            }else {
              tfston3.setDisable(true);
              tfn1ton3.setDisable(true);
              tfn2ton3.setDisable(true);
              tfn3ton2.setDisable(true);
              tfn3tot.setDisable(true);
              tfn3ton1.setDisable(true); 
         
         
         }
         
         
         
    
    
    }
    @FXML 
        public void calculFord() throws IOException{
       Fulkerson g = new Fulkerson();
       int ch=0;
        FXMLLoader loader=new FXMLLoader(getClass().getResource("GrapheV2.fxml"));
       Parent root=loader.load();
       GrapheV2Controller gc= loader.getController();
    if(choix.getValue().equals("5 Noeuds")){
         ch=5;
         if((!tfston1.getText().equals(""))){
      g.addEdge("s","1",Double.parseDouble(tfston1.getText()),0);}
         else {
            
           gc.arcston1.setVisible(false);
         }
          if((!tfston2.getText().equals(""))){
      g.addEdge("s","2",Double.parseDouble(tfston2.getText()),0);}
           else {
            
           gc.arcston2.setVisible(false);
         }
           if((!tfston3.getText().equals(""))){
      g.addEdge("s","3",Double.parseDouble(tfston3.getText()),0);}
            else {
            
           gc.arcston3.setVisible(false);
         }
            if((!tfn1tot.getText().equals(""))){
      g.addEdge("1","t",Double.parseDouble(tfn1tot.getText()),0);}
            else {
            
           gc.arcn1tot.setVisible(false);
         }
             if((!tfn2tot.getText().equals(""))){
      g.addEdge("2","t",Double.parseDouble(tfn2tot.getText()),0);}
             else {
            
           gc.arcn2tot.setVisible(false);
         }
               if((!tfn3tot.getText().equals(""))){
      g.addEdge("3","t",Double.parseDouble(tfn3tot.getText()),0);}
                else {
            
           gc.arcn3tot.setVisible(false);
         }
               if((!tfn1ton2.getText().equals(""))){
      g.addEdge("1","2",Double.parseDouble(tfn1ton2.getText()),0);}
               else{
               if((!tfn2ton1.getText().equals(""))){
      g.addEdge("2","1",Double.parseDouble(tfn2ton1.getText()),0);}
               else{
               gc.arcn1ton2.setVisible(false);
               
               }}
                 if((!tfn1ton3.getText().equals(""))){
      g.addEdge("1","3",Double.parseDouble(tfn1ton3.getText()),0);}
                 else{
                  if((!tfn3ton1.getText().equals(""))){
      g.addEdge("3","1",Double.parseDouble(tfn3ton1.getText()),0);}
                  else{
                   gc.arcn1ton3.setVisible(false);
                   gc.arcn1ton3bis.setVisible(false);
                  }
                 
                 }
                  if((!tfn2ton3.getText().equals(""))){
      g.addEdge("2","3",Double.parseDouble(tfn2ton3.getText()),0);}
                  else{
                    if((!tfn3ton2.getText().equals(""))){
      g.addEdge("3","2",Double.parseDouble(tfn3ton2.getText()),0);}
                    else{
                    gc.arcn2ton3.setVisible(false);
                   
                    
                    }
                  
                  }
                     
                     
                      
                        
    }
     else{
     ch=4;
       if((!tfston1.getText().equals(""))){
      g.addEdge("s","1",Double.parseDouble(tfston1.getText()),0);}
       else{
       gc.arcston1.setVisible(false);}
          if((!tfston2.getText().equals(""))){
      g.addEdge("s","2",Double.parseDouble(tfston2.getText()),0);}else
          {
          gc.arcston2.setVisible(false);
          }
          
            if((!tfn1tot.getText().equals(""))){
      g.addEdge("1","t",Double.parseDouble(tfn1tot.getText()),0);}else{
            gc.arcn1tot.setVisible(false);
            }
             if((!tfn2tot.getText().equals(""))){
      g.addEdge("2","t",Double.parseDouble(tfn2tot.getText()),0);}
             else{
            gc.arcn2tot.setVisible(false);
            }
    
               if((!tfn1ton2.getText().equals(""))){
      g.addEdge("1","2",Double.parseDouble(tfn1ton2.getText()),0);}else{
    
                     if((!tfn2ton1.getText().equals(""))){
      g.addEdge("2","1",Double.parseDouble(tfn2ton1.getText()),0);}else{
                     
            gc.arcn1ton2.setVisible(false);
           
    
                     }
               }
                      
     
     
     }
        
            gc.setTextphi(String.valueOf("Le flot maximale : "+g.maxFlow("s","t")));
        System.out.println("Le flot maximale est :"+g.maxFlow("s","t"));
        System.out.println(g.flow); 
          if(choix.getValue().equals("4 Noeuds")){
          gc.hidden();
          }
           for (Map.Entry<Fulkerson.Edge, Double> en : g.flow.entrySet()) {
            Fulkerson.Edge key = en.getKey();
            Double value = en.getValue();
               System.out.println("*****************************");
               System.out.println(key.sink.toString());
               System.out.println(key.source.toString());
                System.out.println("*****************************");
                if(key.source.toString().equals("1")&&key.sink.toString().equals("t")){
                gc.setText1tot((String.valueOf(key.residual)));
                }
                
                if(key.source.toString().equals("t")&&key.sink.toString().equals("1")){
                gc.setTexttto1(value.toString());
                
                }
                if(key.source.toString().equals("1")&&key.sink.toString().equals("2")){
                gc.setText1to2((String.valueOf(key.residual)));
                
                }
                 if(key.source.toString().equals("2")&&key.sink.toString().equals("1")){
                gc.setText2to1(value.toString());
                
                }
                 if(key.source.toString().equals("1")&&key.sink.toString().equals("3")){
                gc.setText1to3((String.valueOf(key.residual)));
                
                }
                 if(key.source.toString().equals("3")&&key.sink.toString().equals("1")){
                gc.setText3to1(value.toString());
                
                }
                 if(key.source.toString().equals("2")&&key.sink.toString().equals("3")){
                gc.setText2to3((String.valueOf(key.residual)));
                
                }
                  if(key.source.toString().equals("3")&&key.sink.toString().equals("2")){
                gc.setText3to2(value.toString());
                
                }
                  if(key.source.toString().equals("2")&&key.sink.toString().equals("t")){
                gc.setText2tot((String.valueOf(key.residual)));
                
                }
                  if(key.source.toString().equals("t")&&key.sink.toString().equals("2")){
                gc.setTexttto2(value.toString());
                
                }
                   if(key.source.toString().equals("3")&&key.sink.toString().equals("t")){
                gc.setText3tot(String.valueOf(key.residual));
            
                }
                    if(key.source.toString().equals("t")&&key.sink.toString().equals("3")){
                gc.setTexttto3(value.toString());
            
                }
                    if(key.source.toString().equals("s")&&key.sink.toString().equals("1")){
                gc.setTextsto1((String.valueOf(key.residual)));
            
                }
                     if(key.source.toString().equals("1")&&key.sink.toString().equals("s")){
                gc.setText1tos(value.toString());
            
                }
                     if(key.source.toString().equals("s")&&key.sink.toString().equals("2")){
                gc.setTextsto2((String.valueOf(key.residual)));
            
                }
                      if(key.source.toString().equals("2")&&key.sink.toString().equals("s")){
                gc.setText2tos(value.toString());
            
                }
                      if(key.source.toString().equals("s")&&key.sink.toString().equals("3")){
                gc.setTextsto3((String.valueOf(key.residual)));
            
                }
                       if(key.source.toString().equals("3")&&key.sink.toString().equals("s")){
                gc.setText3tos(value.toString());
            
                }
            
          }
       
       
       Scene scene=new Scene(root);
       Stage stage=new Stage();
       stage.setScene(scene);
       stage.show();
        }
        
    @FXML
    private void Annuler(ActionEvent event) {
    tfston1.clear();
    tfston2.clear();
    tfston3.clear();
    tfn1ton2.clear();
    tfn1ton3.clear();
    tfn2ton3.clear();
    tfn2ton1.clear();
    tfn2tot.clear();
    tfn3ton1.clear();
    tfn3ton2.clear();
    tfn1tot.clear();
    tfn3tot.clear();
    choix.setValue("5 Noeuds");
    }
      



}
     
    

    
    
    

