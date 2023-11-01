/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essay2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author salah
 */
public class FXMLDocumentController implements Initializable {
 
 
   static int pot2,pot1,pot3,ds,dm,dh;
   
   int r3,r2,r1;
   
   static  int indxi3U,indxi3D,indxi2U,indxi2D,indxi1U,indxi1D,lock,d;
   
   String refl,cls,rst,dss="",dmm="",drr="",pl="";
  
            
   String wheelgoup []={"wheel1.png","wheel2.png","wheel3.png","wheel4.png","wheel5.png"},
          wheelgou []={"wheel5.png","wheel4.png","wheel3.png","wheel2.png","wheel1.png"};
   
    AudioClip hit = new AudioClip(this.getClass().getResource("key-down.wav").toString()); 
   
    @FXML
    private Button p;
    @FXML
    private Button y;
    @FXML
    private Button x;
    @FXML
    private Button c;
    @FXML
    private Button v;
    @FXML
    private Button b;
    @FXML
    private Button n;
    @FXML
    private Button m;
    @FXML
    private Button l;
    @FXML
    private Button q;
    @FXML
    private Button w;
    @FXML
    private Button e;
    @FXML
    private Button r;
    @FXML
    private Button t;
    @FXML
    private Button z;
    @FXML
    private Button u;
    @FXML
    private Button i;
    @FXML
    private Button o;
    @FXML
    private Button a;
    @FXML
    private Button s;
    @FXML
    private Button dd;
    @FXML
    private Button f;
    @FXML
    private Button g;
    @FXML
    private Button h;
    @FXML
    private Button j;
    @FXML
    private Button k;
    @FXML
    private Label Q;
    @FXML
    private Label W;
    @FXML
    private Label E;
    @FXML
    private Label R;
    @FXML
    private Label T;
    @FXML
    private Label Z;
    @FXML
    private Label U;
    @FXML
    private Label I;
    @FXML
    private Label O;
    @FXML
    private Label A;
    @FXML
    private Label S;
    @FXML
    private Label D;
    @FXML
    private Label F;
    @FXML
    private Label G;
    @FXML
    private Label H;
    @FXML
    private Label J;
    @FXML
    private Label K;
    @FXML
    private Label P;
    @FXML
    private Label Y;
    @FXML
    private Label X;
    @FXML
    private Label C;
    @FXML
    private Label V;
    @FXML
    private Label B;
    @FXML
    private Label N;
    @FXML
    private Label M;
    @FXML
    private Label L;
    @FXML
    private Button button1;
    @FXML
    private Button PB;
    @FXML
    private Text prot3;
    @FXML
    private Text prot2;
    @FXML
    private Text prot1;
    @FXML
    private Text IN;
    @FXML
    private TextArea Input;
    @FXML
    private TextArea output;
    @FXML
    private TextArea Detarea;
    @FXML
    private Button det;
    @FXML
    private Button Gen;
    @FXML
    private Button moveDR3;
    @FXML
    private Button moveDR1;
    @FXML
    private Button moveDR2;
    @FXML
    private Button moveUR3;
    @FXML
    private Button moveUR1;
    @FXML
    private Button moveUR2;
    @FXML
    private ImageView Im_wh3;
    @FXML
    private ImageView Im_wh1;
    @FXML
    private ImageView Im_wh2;
    @FXML
    private AnchorPane stg;
    
    @FXML
    private void scene2(ActionEvent event) throws IOException {
    //creates new pop-up window
    Stage popupSave = new Stage();
    popupSave.initModality(Modality.APPLICATION_MODAL);


    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("edit.fxml"));
    Parent root = loader.load();

    EditController controller = loader.getController();

    Scene scene = new Scene(root);
    popupSave.setScene(scene);
    popupSave.setTitle("Settings");
    popupSave.initStyle(StageStyle.UNDECORATED);
    popupSave.showAndWait();

    //after the popup closes, this will run, setting the label's text to the popup's test variable, which is public.
    cls=controller.buttontext; 
    if("Cancel".equals(cls)) {
       prot3.setText(controller.RRP);
    prot2.setText(controller.MRP);
    prot1.setText(controller.LRP);
    r1=Integer.parseInt(controller.ol);
    r2=Integer.parseInt(controller.om);
    r3=Integer.parseInt(controller.or);
    refl=controller.t11; 
    
    
    }
    
        
    else{
    switch_images_down(Im_wh3, 0);
    switch_images_down(Im_wh2, 0);
    switch_images_down(Im_wh1, 0);
    d=0;
    prot3.setText(controller.RRP);
    prot2.setText(controller.MRP);
    prot1.setText(controller.LRP);
    r1=Integer.parseInt(controller.ol);
    r2=Integer.parseInt(controller.om);
    r3=Integer.parseInt(controller.or);
    refl=controller.t11;
    output.clear();
     Input.clear();
     Detarea.clear();
     dmm="";
     dss="";
   
    }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        prot3.setText(Integer.toString(0));
        prot2.setText(Integer.toString(0));
        prot1.setText(Integer.toString(0));
        refl="UKW-B";
        r1=1;
        r2=2;
        r3=3;
        
    }    

  public void eni(String ina) {
      // verifie();
        
        
          if(d==0){
         ds=(Integer.parseInt(prot3.getText()))%26;
         dm=(Integer.parseInt(prot2.getText()))%26;
         dh=(Integer.parseInt(prot1.getText()))%26;
         d=1;
     }        
      // output.setText(plug.getText()+""+ref.getValue()+i);
       pot3=(Integer.parseInt(prot3.getText())+1)%26;
      switch_images_down(Im_wh3,indxi3D);
      
      
  indxi3D=(indxi3D+1)%4 ;
      
     pot2=(Integer.parseInt(prot2.getText()))%26;
     pot1=(Integer.parseInt(prot1.getText()))%26;
 
       if(pot3==ds%26){
           pot2=(Integer.parseInt(prot2.getText())+1)%26;
           switch_images_down(Im_wh2,indxi2D);
           indxi2D=(indxi2D+1)%4 ;
           if(pot2==dm%26){
           pot1=(Integer.parseInt(prot1.getText())+1)%26;
           switch_images_down(Im_wh1,indxi1D);
           indxi1D=(indxi1D+1)%4 ;
       }
       }
     
        prot3.setText(Integer.toString(pot3));
        prot2.setText(Integer.toString(pot2));
       prot1.setText(Integer.toString(pot1));
        
      if(pl.length()%2==1 ||pl.length()>26) { 
          pl="";
      }
        
        String in=ina;
                    
      String ze=  Essay2.affiche(in, r3, r2, r1, pot3, pot2, pot1,refl ,pl );
     
      
         
       dss=dss+ze;
       if((dss.length()%6)==0)
        { dss=dss+"\t";
        }
      
       dmm=dmm+in; 
         
         if((dmm.length()%6)==0)
        { dmm=dmm+"\t";
        }
    output.setText(dss); 
       
        
        Input.setText(dmm);
        char zero=Essay2.plug(pl, in.charAt(0));
        char one=Essay2.MaS_chiffrement(r3,zero, pot3);
        
        char two=Essay2.MaS_chiffrement(r2,one, pot2);
        
        char three=Essay2.MaS_chiffrement(r1,two, pot1);
        
        char four=Essay2.ref(three,refl);
        
        char five=Essay2.back_chiffrement(r1, four, pot1);
        
        char six=Essay2.back_chiffrement(r2, five, pot2);
        
        char seven=Essay2.back_chiffrement(r3, six, pot3);
        
        char eight=Essay2.plug(pl, seven);
        
        String dete=(    "\nposition des rotors : "+ pot1+" | "+pot2+" |"+pot3
                        +"\nLettre: "+in
                        +"\nPlug: "+zero
                        +"\nrotor à droite: "+one
                        +"\nrotor à centre: "+two
                        +"\nrotor à gauche: "+three
                        +"\nReflector:"+four
                        +"\nrotor à gauche: "+five
                        +"\nrotor à centre: "+six
                        +"\nrotor à droite: "+seven
                        +"\nPlug:"+eight
                        +"\nRésultat :"+eight
                        +"\n===================================================================================");
        drr=drr+dete;
        Detarea.setText(drr);
                          
     //be light
     
     
      light(ze);
      
   
      
            
   }  
    
    
    @FXML
    private void keyup(MouseEvent event) {
     AudioClip hit1 = new AudioClip(this.getClass().getResource("key-up.wav").toString());
     hit1.play(); // son release thebutton 
      
     Default(); // les lampes reour par defaut
     buttonDefault(); //les button retour par defaut
        
    }

    @FXML
    private void keydown(MouseEvent event) {
        
       hit.play(); // play son de clik
    String  aze= ((((Button)event.getSource()).getText()));  // le text de button comme input pour la fonction de chiffremet   
    eni(aze); //fonction de chiffremnt 
        buttonMousepressed(aze); //change background de butoon qui clic
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void Licence(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION,"The Enigma machines are a series of electro-mechanical rotor cipher machines. The first machines were invented at the end of World War I by German engineer Arthur Scherbius and were mainly used to protect commercial, diplomatic and military communication. Enigma machines became more and more complex and were heavily used by the German army during World War II to encrypt radio signals.\n" +
"\n" +
"You you will be able to use this machine to both encrypt or decrypt Enigma messages (Enigma encryption is symmetric, which means that the same settings can be used to both encrypt or decrypt a message).\n" +
"\n" +
"Use our Enigma emulator to start encoding or decoding secret messages.",ButtonType.CLOSE);
        alert.setHeaderText("About");
        DialogPane root = alert.getDialogPane();

Stage dialogStage = new Stage(StageStyle.UNDECORATED);


    ButtonBase button = (ButtonBase) root.lookupButton(ButtonType.CLOSE);
    button .setOnAction(e->{
        
        dialogStage.close();
            
        });
   


// replace old scene root with placeholder to allow using root in other Scene
root.getScene().setRoot(new Group());

root.setPadding(new Insets(10, 0, 10, 0));
Scene scene = new Scene(root);

dialogStage.setScene(scene);
dialogStage.setTitle("About");

dialogStage.initModality(Modality.APPLICATION_MODAL);
button.setAlignment(Pos.CENTER);

dialogStage.setAlwaysOnTop(true);
dialogStage.setResizable(false);
dialogStage.show();

    }

    @FXML
    private void scene3(ActionEvent event) throws IOException {
       Stage popup = new Stage();
    popup.initModality(Modality.APPLICATION_MODAL);


    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("scene3.fxml"));
    Parent root = loader.load();

    Scene3Controller controller1 = loader.getController();

    Scene scene = new Scene(root);
    popup.setScene(scene);
    popup.setTitle("Settings");
    popup.initStyle(StageStyle.UNDECORATED);
    popup.showAndWait();

    //after the popup closes, this will run, setting the label's text to the popup's test variable, which is public.
    pl=controller1.pl;
    pl = pl.replaceAll("\\s+","");
    pl=pl.toUpperCase();
    if(pl.length()%2==1 ||pl.length()>26) { 
          pl="";
      }
    
    }

    

    @FXML
    private void clear(ActionEvent event) {
     output.clear();
     Input.clear();
     Detarea.clear();
     dmm="";
     dss="";
    }

    @FXML
    private void Details(ActionEvent event) {
    IN.setText("(EN/DE)cryption steps:");
        Detarea.setOpacity(1);
        Detarea.setDisable(false);
        Gen.setOpacity(1);
        Gen.setDisable(false);
        det.setOpacity(0);
        det.setDisable(true);
    }
    

    @FXML
    private void General(ActionEvent event) {
        IN.setText("Input:");
        Detarea.setOpacity(0);
        Detarea.setDisable(true);
        Gen.setOpacity(0);
        Gen.setDisable(true);
        det.setOpacity(1);
        det.setDisable(false);
        
    }

    @FXML
    private void moveDR3(ActionEvent event) {
         switch_images_down(Im_wh3,indxi3D);
         indxi3D=(indxi3D+1)%4 ;
        hit.play();
        
        
        pot3=(Integer.parseInt(prot3.getText())+1)%26;

                prot3.setText(Integer.toString(pot3)); 
        
    }
    @FXML
    private void moveUR3(ActionEvent event) {
    hit.play();
        switch_images_up(Im_wh3, indxi3U);
        indxi3U=(indxi3U+1)%4 ;
               pot3=(Integer.parseInt(prot3.getText())-1)%26;
 if(pot3<0)
        pot3=(Integer.parseInt(prot3.getText())-1+26)%26;    
                prot3.setText(Integer.toString(pot3));
                hit.play();
    }
    

    @FXML
    private void moveDR2(ActionEvent event) {
         switch_images_down(Im_wh2,indxi2D);
      indxi2D=(indxi2D+1)%4 ;
         hit.play();
//         switch_images_down(Im_wh2);
      
pot2=(Integer.parseInt(prot2.getText())+1)%26;

                prot2.setText(Integer.toString(pot2));
    }
    
    @FXML
    private void moveUR2(ActionEvent event) {
          hit.play();
        switch_images_up(Im_wh2, indxi2U);
        indxi2U=(indxi2U+1)%4 ;
        pot2=(Integer.parseInt(prot2.getText())-1)%26;
        if(pot2<0)
        pot2=(Integer.parseInt(prot2.getText())-1+26)%26;    
            
                prot2.setText(Integer.toString(pot2));
    }
    @FXML
    private void moveDR1(ActionEvent event) {
         switch_images_down(Im_wh1,indxi1D);
      indxi1D=(indxi1D+1)%4 ;
        hit.play();
        
        pot1=(Integer.parseInt(prot1.getText())+1)%26;

                prot1.setText(Integer.toString(pot1));
        
        
    }

    @FXML
    private void moveUR1(ActionEvent event) {
              hit.play();
        switch_images_up(Im_wh1, indxi1U);
        indxi1U=(indxi1U+1)%4 ;
            
        
        pot1=(Integer.parseInt(prot1.getText())-1)%26;
 if(pot1<0)
        pot1=(Integer.parseInt(prot1.getText())-1+26)%26;    
        
                prot1.setText(Integer.toString(pot1));
    }

   

    @FXML
    private void poo(ActionEvent event) {
    
   }
    
    
    
    private void light(String ze) {
        String lampon="-fx-background-color:linear-gradient(to bottom right, #fceabb 0%, #f8b500 40%, #f8b500 41%, #fccd4d 43%, #fbdf93 100%)";
      switch(ze){
          case"A":
            A.setStyle(lampon);  
            
           break;
           
          case"B":       
            B.setStyle(lampon);
            break;
            
          case"C":
            C.setStyle(lampon);
            break;
            
          case"D":
            D.setStyle(lampon);
            break;
            
          case"E":
            E.setStyle(lampon);
            break;
            
          case"F":
            F.setStyle(lampon);
            break;
            
          case"G":
            G.setStyle(lampon);
            break;
            
          case "H":
           H.setStyle(lampon);
            break;
            
          case"I":
            I.setStyle(lampon);
            break;
          case"J":  
            J.setStyle(lampon);
            break;
          case"K": 
            K.setStyle(lampon);
            break;
          case"L":
            L.setStyle(lampon);
            break;
          case"M":  
            M.setStyle(lampon);
            break;
          case"N":  
            N.setStyle(lampon);
            break;
          case"O":
            O.setStyle(lampon);
            break;
          case"P":
            P.setStyle(lampon);
            break;
            
          case"Q":
            Q.setStyle(lampon);
            break;
            
          case"R":  
            R.setStyle(lampon);
            break;
            
          case"S":  
            S.setStyle(lampon);
            break;
            
          case"T":  
            T.setStyle(lampon);
            break;
            
          case"U":   
            U.setStyle(lampon);
            break;
            
          case"V":   
            V.setStyle(lampon);
            break;
            
          case"W":   
            W.setStyle(lampon);
            break;
            
          case"X":   
            X.setStyle(lampon);
            break;
            
          case"Y":  
            Y.setStyle(lampon);
            break;
            
          case"Z":   
            Z.setStyle(lampon);
            break;
      }
         
    }
    
    private void buttonDefault() {
     String themes="-fx-background-color: linear-gradient(to bottom right, #4c4c4c 0%,#595959 12%,#666666 25%,#474747 39%,#2c2c2c 50%,#000000 51%,#111111 60%,#2b2b2b 76%,#1c1c1c 91%,#131313 100%)"; 
     a.setStyle(themes);         
     b.setStyle(themes);
     c.setStyle(themes);
     dd.setStyle(themes);
     e.setStyle(themes);
     f.setStyle(themes);
     g.setStyle(themes);
     h.setStyle(themes);
     i.setStyle(themes);
     j.setStyle(themes);
     k.setStyle(themes);
     l.setStyle(themes);
     m.setStyle(themes);
     n.setStyle(themes);
     o.setStyle(themes);
     p.setStyle(themes);
     q.setStyle(themes);
     r.setStyle(themes);
     s.setStyle(themes);
     t.setStyle(themes); 
     u.setStyle(themes);
     v.setStyle(themes);
     w.setStyle(themes);
     x.setStyle(themes);
     y.setStyle(themes);
     z.setStyle(themes);
     

    }

   
    public void buttonMousepressed(String butt){
    String blampon="-fx-background-color:#383838;-fx-border-color:white;-fx-border-width:2px";
     switch(butt){
          case"A":
            ; 
            a.setStyle(blampon);  
           break;
           
          case"B": 
              
            b.setStyle(blampon);
            break;
            
          case"C":
              
            c.setStyle(blampon);
            break;
            
          case"D":
              
            dd.setStyle(blampon);
            break;
            
          case"E":
              
            e.setStyle(blampon);
            break;
            
          case"F":
              
            f.setStyle(blampon);
            break;
            
          case"G":
              
            g.setStyle(blampon);
            break;
            
          case "H":
              
           h.setStyle(blampon);
            break;
            
          case"I":
              
            i.setStyle(blampon);
            break;
          case"J":
              
            j.setStyle(blampon);
            break;
          case"K": 
              
            k.setStyle(blampon);
            break;
          case"L":
              
            l.setStyle(blampon);
            break;
          case"M":
              
            m.setStyle(blampon);
            break;
          case"N":
              
            n.setStyle(blampon);
            break;
          case"O":
              
            o.setStyle(blampon);
            break;
          case"P":
              
            p.setStyle(blampon);
            break;
            
          case"Q":
              
            q.setStyle(blampon);
            break;
            
          case"R":
              
            r.setStyle(blampon);
            break;
            
          case"S":
              
            s.setStyle(blampon);
            break;
            
          case"T":
              
            t.setStyle(blampon);
            break;
            
          case"U":
              
            u.setStyle(blampon);
            break;
            
          case"V":
              
            v.setStyle(blampon);
            break;
            
          case"W":
              
            w.setStyle(blampon);
            break;
            
          case"X":   
              
            x.setStyle(blampon);
            break;
            
          case"Y":
              
            y.setStyle(blampon);
            break;
            
          case"Z":   
              
            z.setStyle(blampon);
            break;
      }
}
    public void buttonkeypressed(String but){
    String blampon="-fx-background-color:#383838;-fx-border-color:white;-fx-border-width:2px";
      switch(but){
          case"A":
            eni("A") ; 
            a.setStyle(blampon);  
           break;
           
          case"B": 
            eni("B");  
            b.setStyle(blampon);
            break;
            
          case"C":
            eni("C");  
            c.setStyle(blampon);
            break;
            
          case"D":
              eni("D");
            dd.setStyle(blampon);
            break;
            
          case"E":
              eni("E");
            e.setStyle(blampon);
            break;
            
          case"F":
              eni("F");
            f.setStyle(blampon);
            break;
            
          case"G":
              eni("G");
            g.setStyle(blampon);
            break;
            
          case "H":
              eni("H");
           h.setStyle(blampon);
            break;
            
          case"I":
              eni("I");
            i.setStyle(blampon);
            break;
          case"J":
              eni("J");
            j.setStyle(blampon);
            break;
          case"K": 
              eni("K");
            k.setStyle(blampon);
            break;
          case"L":
              eni("L");
            l.setStyle(blampon);
            break;
          case"M":
              eni("M");
            m.setStyle(blampon);
            break;
          case"N":
              eni("N");
            n.setStyle(blampon);
            break;
          case"O":
              eni("O");
            o.setStyle(blampon);
            break;
          case"P":
              eni("P");
            p.setStyle(blampon);
            break;
            
          case"Q":
              eni("Q");
            q.setStyle(blampon);
            break;
            
          case"R":
              eni("R");
            r.setStyle(blampon);
            break;
            
          case"S":
              eni("S");
            s.setStyle(blampon);
            break;
            
          case"T":
              eni("T");
            t.setStyle(blampon);
            break;
            
          case"U":
              eni("U");
            u.setStyle(blampon);
            break;
            
          case"V":
              eni("V");
            v.setStyle(blampon);
            break;
            
          case"W":
              eni("W");
            w.setStyle(blampon);
            break;
            
          case"X":   
              eni("X");
            x.setStyle(blampon);
            break;
            
          case"Y":
              eni("Y");
            y.setStyle(blampon);
            break;
            
          case"Z":   
              eni("Z");
            z.setStyle(blampon);
            break;
      }
         
}
    private void Default() {
     String theme=  "-fx-background-color: linear-gradient(to bottom right, #000000 0%,#0a0a0a 11%,#0a0a0a 21%,#4e4e4e 33%,#383838 37%,#383838 37%,#1b1b1b 43%,#1b1b1b 43%,#000000 100%)";
     A.setStyle(theme);

     B.setStyle(theme);
     C.setStyle(theme);
     D.setStyle(theme);
     E.setStyle(theme);
     F.setStyle(theme);
     G.setStyle(theme);
     H.setStyle(theme);
     I.setStyle(theme);
     J.setStyle(theme);
     K.setStyle(theme);
     L.setStyle(theme);
     M.setStyle(theme);
     N.setStyle(theme);
     O.setStyle(theme);
     P.setStyle(theme);
     Q.setStyle(theme);
     R.setStyle(theme);
     S.setStyle(theme);
     T.setStyle(theme); 
     U.setStyle(theme);
     V.setStyle(theme);
     W.setStyle(theme);
     X.setStyle(theme);
     Y.setStyle(theme);
     Z.setStyle(theme);
     

    }

    @FXML
    private void KDBKB(KeyEvent event) {
        AudioClip hit = new AudioClip(this.getClass().getResource("key-down.wav").toString());
    String  aze= event.getCode().toString();
//verifie();
        if(lock==0){
    
    if(aze.length()>1){
         hit.stop();
    }
    else{
         hit.play();
    }
            buttonkeypressed(aze);
         

  lock=1;      
        }
    }

    @FXML
    private void KR(KeyEvent event) {
         AudioClip hit1 = new AudioClip(this.getClass().getResource("key-up.wav").toString());
        String e=event.getCode().toString();
       
        if(e.length()>1){
            hit1.stop();
        }
              
        else{
             hit1.play();
        }   
    
      
     buttonDefault();
     Default();
     lock=0;
        
    }
    
   
public void switch_images_up(ImageView img,int indx){
    
      img.setImage(new Image(getClass().getResource(wheelgoup[indx]).toExternalForm()));//wheelgoup table contieint les noms des photos
      
}



public void switch_images_down(ImageView img,int isa){
     
    img.setImage(new Image(getClass().getResource(wheelgou[isa]).toExternalForm()));//wheelgodonwn table contieint les noms des photos
  
}  

    @FXML
    private void Exit(ActionEvent event) throws IOException{
           try{
           
      Alert alert = new Alert(Alert.AlertType.WARNING, "Are you sure ?", ButtonType.YES, ButtonType.NO);
DialogPane root = alert.getDialogPane();

Stage dialogStage = new Stage(StageStyle.UTILITY);

for (ButtonType buttonType : root.getButtonTypes()) {
    ButtonBase button = (ButtonBase) root.lookupButton(ButtonType.NO);
    ButtonBase button1 = (ButtonBase) root.lookupButton(ButtonType.YES);
    button.setOnAction(evt -> {
        dialogStage.close();
    });
    button1.setOnAction(evt -> {
      System.exit(0);
    });
    // replace old scene root with placeholder to allow using root in other Scene
root.getScene().setRoot(new Group());
root.setPadding(new Insets(10, 0, 10, 0));
Scene scene = new Scene(root);
dialogStage.setScene(scene);
dialogStage.initModality(Modality.APPLICATION_MODAL);
dialogStage.setAlwaysOnTop(true);
dialogStage.setResizable(false);
dialogStage.showAndWait();}
    }
    catch (Exception Ex) {
         } 
    }

    
    
}
