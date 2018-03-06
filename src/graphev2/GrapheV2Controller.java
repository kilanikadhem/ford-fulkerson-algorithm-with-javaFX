/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphev2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Houssem Hamila
 */
public class GrapheV2Controller implements Initializable {
    @FXML
    private Circle s;
    @FXML
    private Text textn1;
    @FXML
    private Circle n2;
    @FXML
    private Circle n3;
    @FXML
    private Circle t;
    @FXML
    private Text texts;
    @FXML
    private Text textn2;
    @FXML
    private Text textn3;
    @FXML
    private Text textt;
    @FXML
    public Line arcston1;
    @FXML
    public Line arcston3;
    @FXML
    public Line arcn3tot;
    @FXML
    public Line arcn1tot;
    @FXML
    public Line arcn1ton2;
    @FXML
    public Line arcn2ton3;
    @FXML
    public Line arcston2;
    @FXML
    public Line arcn2tot;
    @FXML
    public Line arcn1ton3;
    @FXML
    private Text texttton3;
    @FXML
    private Text textn3tos;
    @FXML
    private Text textn1tos;
    @FXML
    private Text textn2tos;
    @FXML
    private Text texttton1;
    @FXML
    private Text textn3ton2;
    @FXML
    private Text textn2ton1;
    @FXML
    private Text texttton2;
    @FXML
    private Text textn3ton1;
    @FXML
    private Text textn3tot;
    @FXML
    private Text textn1tot;
    @FXML
    private Text textston3;
    @FXML
    private Text textston1;
    @FXML
    private Text textston2;
    @FXML
    private Text textn1ton2;
    @FXML
    private Text textn2ton3;
    @FXML
    private Text textn2tot;
    @FXML
    private Text textn1ton3;
    @FXML
    private Circle n1;
    @FXML
    public Line arcn1ton3bis;
    @FXML
    private Text phi;
    @FXML
    private ImageView img;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image img1 = new Image("assets/splash.png");
        img.setImage(img1);
       
    }    
    
    

     public void setText1tot(String text){
            textn1tot.setText(text);
     }
     public void setTexttto1(String text){
            texttton1.setText(text);
     }
      public void setText1to2(String text){
            textn1ton2.setText(text);
     }
      public void setText2to1(String text){
            textn2ton1.setText(text);
     }
      public void setText1to3(String text){
            textn1ton3.setText(text);
     }
       public void setText3to1(String text){
            textn3ton1.setText(text);
     }
       
         public void setTextphi(String text){
            phi.setText(text);
     }
      
       
      public void setText2to3(String text){
            textn2ton3.setText(text);
     }
      public void setText3to2(String text){
            textn3ton1.setText(text);
     }
      public void setText2tot(String text){
            textn2tot.setText(text);
     }
       public void setTexttto3(String text){
            texttton3.setText(text);
     }
      
      public void setText3tot(String text){
            textn3tot.setText(text);
     }
      
       public void setTextsto1(String text){
            textston1.setText(text);
     }
         public void setText1tos(String text){
            textn1tos.setText(text);
     }
       public void setTextsto2(String text){
            textston2.setText(text);
     }
        public void setText2tos(String text){
            textn2tos.setText(text);
     }
       public void setTextsto3(String text){
            textston3.setText(text);
     }
          public void setText3tos(String text){
            textn3tos.setText(text);
     }
          public void setTexttto2(String text){
            texttton2.setText(text);
     }
         public void hidden(){
            n3.setVisible(false);
            textn3.setVisible(false);
            arcston3.setVisible(false);
            arcn3tot.setVisible(false);
             arcn2ton3.setVisible(false);
             arcn1ton3.setVisible(false);
             textn3tos.setVisible(false);
             textston3.setVisible(false);
             texttton3.setVisible(false);
             textn3tot.setVisible(false);
            textn1ton3.setVisible(false);
             textn3ton1.setVisible(false);
              textn2ton3.setVisible(false);
              
              textn3ton2.setVisible(false);
              arcn1ton3bis.setVisible(false);
             
               
             
              
            
     }
      
   /* public GrapheV2Controller(Text texttton3, Text textn3tos, Text textn1tos, Text textn2tos, Text texttton1, Text textn3ton2, Text textn2ton1, Text texttton2, Text textn3ton1, Text textn3tot, Text textn1tot, Text textston3, Text textston1, Text textston2, Text textn1ton2, Text textn2tot, Text textn1ton3) {
        this.texttton3 = texttton3;
        this.textn3tos = textn3tos;
        this.textn1tos = textn1tos;
        this.textn2tos = textn2tos;
        this.texttton1 = texttton1;
        this.textn3ton2 = textn3ton2;
        this.textn2ton1 = textn2ton1;
        this.texttton2 = texttton2;
        this.textn3ton1 = textn3ton1;
        this.textn3tot = textn3tot;
        this.textn1tot = textn1tot;
        this.textston3 = textston3;
        this.textston1 = textston1;
        this.textston2 = textston2;
        this.textn1ton2 = textn1ton2;
        this.textn2tot = textn2tot;
        this.textn1ton3 = textn1ton3;
    }
*/
    
}
