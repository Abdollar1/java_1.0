package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
 

public class Controller {

    @FXML
    private TextField txtuser;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnsave;

    @FXML
    private Button btncancel;
    
    @FXML
    private Button btnlogout;

    @FXML
    private MenuItem MenuItemClose;

    @FXML
    private MenuItem FontSize10;

    @FXML
    private MenuItem FontSize20;

    @FXML
    private MenuItem FontSize30;

    @FXML
    private MenuItem FontSize40;

    @FXML
    private MenuItem FontTypeAsap;

    @FXML
    private MenuItem FontTypeArial;

    @FXML
    private MenuItem FontTypeFantacy;

    @FXML
    private MenuItem FontTypeMonospace;

    @FXML
    private MenuItem MenuItemAbout;

    @FXML
    private Button btnopen;

    @FXML
    private Button btnsavetofile;

    @FXML
    private Button btnloadimage;

    @FXML
    private Button btnplotgraph;

  

    @FXML
    private Button TextEditor;

    @FXML
    private Button ViewImage;

    @FXML
    private Button PlotGraph;
 

    @FXML
    private Button Calculator;

    @FXML
    private ImageView imgImageView;
    

    @FXML
    private javafx.scene.chart.LineChart<String, Number> LineChart;

    @FXML
    private Label about;

    

    @FXML
    private TextField TxtTextField;
    
    //begins of calculator
    
    @FXML
    private Button three;

    @FXML
    private Button six;

    @FXML
    private Button nine;

    @FXML
    private Button percentage;

    @FXML
    private Button dot;

    @FXML
    private Button doubleZero;

    @FXML
    private Button two;

    @FXML
    private Button five;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button four;

    @FXML
    private Button one;

    @FXML
    private Button zero;

    @FXML
    private Button clear;

    @FXML
    private Button division;

    @FXML
    private Button multiple;

    @FXML
    private Button subtract;

    @FXML
    private Button add;
    
    @FXML
    private Button equalsto;

    @FXML
    private TextField input;

    @FXML
    private Label output;
    
    @FXML
    private Button back;
 
    
  private Long snumber;
  private Long fnumber;
  private String operation;

    
    
    public void save() throws IOException {
    	String username = txtuser.getText();
    	String password = txtpassword.getText();
    	
    	//this hide the login page
    	//and output the mainapplication
    	
    	btnsave.getScene().getWindow().hide();
    	
    	//setting alert message
    	Alert message = new Alert(AlertType.INFORMATION);
    	
    	//using if statement to chech if password and username are correct.
    	 if(username.equals("Asap") &&(password.equals("1234"))){
//    		message.setContentText("welcome "+username);
//    		message.setTitle("welcome");
//    		message.show();
    		 
    		 //here is the codes that makes the program executable
   		 BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
 			Scene scene = new Scene(root,779,600);
 			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
 			
 			//declaring the stage
 			Stage primaryStage = new Stage();
			primaryStage.setTitle("welcome");
			primaryStage.setResizable(true);
			primaryStage.setScene(scene);
 			primaryStage.show();
    		
    	}
    	else {
    		message.setContentText("Invalid Details");
    		message.setTitle("Error");
    		message.show();
    		
    		 
    	}
    	 
    	 txtuser.setText("");
    	 txtpassword.setText("");
    	 
    	
    }
    
    public void cancel() {
    	//this exit the application
    	Platform.exit();
    	
    }
    
    
    public void Logout() throws IOException {
    	//this will hide the login button
    	btnlogout.getScene().getWindow().hide();
    	
    	//when the logout button is clicked,it send the user back to the login page
    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("tryLogin.fxml"));
		Scene scene = new Scene(root,328,198);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
	   //declaring the stage
    	Stage primaryStage = new Stage();
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
    }
    
    //this makes the about page visible in the stackpane
    public void about() {
    	TextEditor.setVisible(false);
    	about.setVisible(true);
    	PlotGraph.setVisible(false);
    	ViewImage.setVisible(false);
        Calculator.setVisible(false); 
      
    	
    }
    
    
    //this makes the textfield visible in the stack
    public void TextEditor() {
    	LineChart.setVisible(false);
    	TxtTextField.setVisible(true);
    	imgImageView.setVisible(false);
    	TextEditor.setVisible(true);
    	about.setVisible(false);
    	PlotGraph.setVisible(false);
    	ViewImage.setVisible(false);
        Calculator.setVisible(false); 
        
        //here makes the button assocaited to the text editor visiable
        btnopen.setVisible(true);
        btnsavetofile.setVisible(true);
        btnloadimage.setVisible(false);
        btnplotgraph.setVisible(false);
       
    	
    }
    
    //this makes the linechart visible in the stackpane
    public void graph() {
    	LineChart.getData().clear();
    	LineChart.setVisible(true);
    	TxtTextField.setVisible(false);
    	imgImageView.setVisible(false);
        TextEditor.setVisible(false);
    	about.setVisible(false);
    	PlotGraph.setVisible(true);
    	ViewImage.setVisible(false);
        Calculator.setVisible(false); 
        
        //here makes the button assocaited to the plot graph visiable
        btnopen.setVisible(false);
        btnsavetofile.setVisible(false);
        btnloadimage.setVisible(false);
        btnplotgraph.setVisible(true);
        
    }
    
    
    //this makes the imageview visible in the stackpane
    public void imgImageView() {
    	
    	LineChart.setVisible(false);
    	TxtTextField.setVisible(false);
    	imgImageView.setVisible(true);
    	TextEditor.setVisible(false);
    	about.setVisible(false);
    	PlotGraph.setVisible(false);
    	ViewImage.setVisible(true);
        Calculator.setVisible(false);
      
        
        //here makes the button assocaited to the load image visiable
        btnopen.setVisible(false);
        btnsavetofile.setVisible(false);
        btnloadimage.setVisible(true);
        btnplotgraph.setVisible(false);
       
    	
    }
    
    
    
    public void back() {
    	
    	TextEditor.setVisible(true);
    	about.setVisible(true);
    	PlotGraph.setVisible(true);
    	ViewImage.setVisible(true);
        Calculator.setVisible(true); 
    	
    }
  
    	
    public void FontSize10() {
    	
    	TxtTextField.setFont(Font.font(10));
  
    }
    
    public void FontSize20() {
    	
    	TxtTextField.setFont(Font.font(20));
    }
    
    public void FontSize30() {
    	
    	TxtTextField.setFont(Font.font(20));
    }
    
    public void FontSize40(){
    	TxtTextField.setFont(Font.font(40));
    }
    
    //font type area.
    public void FontTypeAsap() {
    	TxtTextField.setFont(Font.font("Asap",FontPosture.ITALIC,20));
    	
    }
     
    
    public void FontTypeAria(){
    	TxtTextField.setFont(Font.font("Arial"));
    }
    
    public void FontTypeFantacy(){
    	
    	TxtTextField.setFont(Font.font("Fantacy",(FontPosture.REGULAR) , 15));
    }
    
    public void FontTypeMonospace() {
    	TxtTextField.setFont(Font.font("monospace"));
    	
    }
    
    public void opentextfile() throws FileNotFoundException {
    
    	FileChooser filechooser = new FileChooser();
    	
    	filechooser.setTitle("Open Text File");
    	
    	//here is to get the absolute path
    	 String path = ""+filechooser.showOpenDialog(null).getAbsolutePath();
    	 
    	 File inputfile = new File(path);
    	 
    	 Scanner readfile = new Scanner(inputfile);
    	 
    	 TxtTextField.setText(null);
    	 
    	 while(readfile.hasNextLine()) {
    		 
    		 String text = readfile.nextLine();
    		 
    		 TxtTextField.appendText(text + "\n");
    	 }
    	 
    	 
    	readfile.close();
    	 
    	
    }
    public void savetextfile() throws FileNotFoundException {
    	FileChooser filechooser = new FileChooser();
    	
    	filechooser.setTitle("save text file");
    	
    	//here is to get the absolute path
    	 String path = ""+filechooser.showSaveDialog(null).getAbsolutePath();
    	
    	PrintWriter savefile = new PrintWriter(path);
    	 
    	String text = TxtTextField.getText();
    	savefile.println(text);
    	savefile.close();
    }
    
    public void viewimage() throws FileNotFoundException {
    	
FileChooser filechooser = new FileChooser();
    	
    	filechooser.setTitle("select a picture");
    	
    	//here is to get the absolute path
    	 String path = ""+filechooser.showOpenDialog(null).getAbsolutePath();
    	 
    	 FileInputStream readfile = new FileInputStream(path);
    	 Image picture = new Image(readfile);
    	 imgImageView.setPreserveRatio(true);
    	 imgImageView.setImage(picture);
    	
    }
    
    //this contains the graphs declaration.
    public void plotgraph() {
    	
    	XYChart.Series<String, Number> weekone = new XYChart.Series<String, Number>();
    	weekone.setName("1st to 7th JUNE");
    	
    	XYChart.Series<String, Number> weektwo = new XYChart.Series<String, Number>();
    	weekone.setName("8th to 14th JUNE");
    	
    	weekone.getData().add(new XYChart.Data<String, Number>("Monday",24));
    	weekone.getData().add(new XYChart.Data<String, Number>("Tuesday",10));
    	weekone.getData().add(new XYChart.Data<String, Number>("Wednesday",47));
    	weekone.getData().add(new XYChart.Data<String, Number>("Thursday",03));
    	weekone.getData().add(new XYChart.Data<String, Number>("Friday",23));
    	weekone.getData().add(new XYChart.Data<String, Number>("saturday",40));
    	weekone.getData().add(new XYChart.Data<String, Number>("Sunday",51));
    	
    	
    	
    	weektwo.getData().add(new XYChart.Data<String, Number>("Monday",34));
    	weektwo.getData().add(new XYChart.Data<String, Number>("Tuesday",20));
    	weektwo.getData().add(new XYChart.Data<String, Number>("Wednesday",50));
    	weektwo.getData().add(new XYChart.Data<String, Number>("Thursday",13));
    	weektwo.getData().add(new XYChart.Data<String, Number>("Friday",03));
    	weektwo.getData().add(new XYChart.Data<String, Number>("saturday",30));
    	weektwo.getData().add(new XYChart.Data<String, Number>("Sunday",32));
    	
    	LineChart.getData().add(weekone);
    	LineChart.getData().add(weektwo);
    	
    	btnplotgraph.setVisible(true);
    }
    
    //end of graphics decration.
    
    
    
// this controls the calculator pane.
    
    public void Calculators() throws IOException {
    	LineChart.setVisible(false);
    	TxtTextField.setVisible(false);
    	imgImageView.setVisible(false);
    	TextEditor.setVisible(false);
    	about.setVisible(false);
    	PlotGraph.setVisible(false);
    	ViewImage.setVisible(false);
        Calculator.setVisible(true); 
      
        
        //here makes the button assocaited to the load image visiable
        btnopen.setVisible(false);
        btnsavetofile.setVisible(false);
        btnloadimage.setVisible(false);
        btnplotgraph.setVisible(false);
       
    	
    
      //this will hide the login button
    	//btnlogout.getScene().getWindow().hide();
    	
    	//when the logout button is clicked,it send the user back to the login page
        BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("calculator.fxml"));
		Scene scene = new Scene(root,374,316);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
	   //declaring the stage
    	Stage primaryStage = new Stage();
		primaryStage.setResizable(false);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
        
        
    }
    
    
   //calculator initiations
    
    
    public void dot_click() {
    	String oldvalue = input.getText();
    	String set = ".";
    	input.setText(oldvalue +set);
    	 }
    
    public void one_click() {
    	String oldvalue = input.getText();
    	String set = "1";
    	input.setText(oldvalue+set);
    	 }
    
    public void two_click() {
    	String oldvalue = input.getText();
    	String set = "2";
    	input.setText(oldvalue + set);
    	 }
    
    public void three_click() {
    	String oldvalue = input.getText();
    	String set = "3";
    	input.setText(oldvalue +set);
    	 }
    
    public void four_click() {
    	String oldvalue = input.getText();
    	String set = "4";
    	input.setText(oldvalue +set);
    	 }
    
    public void five_click() {
    	String oldvalue = input.getText();
    	String set = "5";
    	input.setText(oldvalue +set);
    	 }
    
    public void six_click() {
    	String oldvalue = input.getText();
    	String set = "6";
    	input.setText(oldvalue +set);
    	 }
    
    
    public void seven_click() {
    	String oldvalue = input.getText();
    	String set = "7";
    	input.setText(oldvalue +set);
    	 }
    
    public void eight_click() {
    	String oldvalue = input.getText();
    	String set = "8";
    	input.setText(oldvalue +set);
    	 }
    
    
    public void nine_click() {
    	String oldvalue = input.getText();
    	String set = "9";
    	input.setText(oldvalue +set);
    	 }
    
    public void zero_click() {
    	String oldvalue = input.getText();
    	String set = "0";
    	input.setText(oldvalue +set);
    	 }
    
    public void doublezero_click() {
    	String oldvalue = input.getText();
    	String set = "00";
    	input.setText(oldvalue +set);
    	 }
    
    
    
    public void add() {
    	String value = input.getText();
    	long valuenumber = Integer.parseInt(value);
    	this.fnumber = valuenumber;
    	input.setText("");
    	output.setText(value +"+");
    	operation = "+";
    	
    }
    
    public void subtract() {
    	String value = input.getText();
    	long valuenumber = Integer.parseInt(value);
    	this.fnumber = valuenumber;
    	input.setText("");
    	output.setText(value +"-");
    	operation = "-";
    	
    }
    
    
    
    public void divid() {
    	String value = input.getText();
    	long valuenumber = Integer.parseInt(value);
    	this.fnumber = valuenumber;
    	input.setText("");
    	output.setText(value +"/");
    	operation = "/";
    	
    }
    
    
    public void percentage() {
    	String value = input.getText();
    	long valuenumber = Integer.parseInt(value);
    	this.fnumber = valuenumber;
    	input.setText("");
    	output.setText(value + "%"+ "100");
    	operation = "%";
    	
    }
    
    
    public void multiple() {
    	String value = input.getText();
    	long valuenumber = Integer.parseInt(value);
    	this.fnumber = valuenumber;
    	input.setText("");
    	output.setText(value +"*");
    	operation = "*";
    	
    }
    
    
    public void equals() {
    	switch(operation){
    	
    	case "+":
    		String valueadd = input.getText();
    		this.snumber = (long) Integer.parseInt(valueadd);
    		long systemadd = this.snumber + this.fnumber;
    		input.setText(String.valueOf(systemadd));
    		String oldoutput = output.getText();
    		output.setText(oldoutput + valueadd);
    		
    		
    	break;
    	
    	
    	
    	case "-":
    		String valuesub = input.getText();
    		this.snumber = (long) Integer.parseInt(valuesub);
    		long systemsub = this.fnumber - this.snumber;
    		input.setText(String.valueOf(systemsub));
    		String oldoutputsub = output.getText();
    		output.setText(oldoutputsub + valuesub);
    		
    	break;
    	
    	
    	
    	case "/":
    		String valuediv= input.getText();
    		this.snumber = (long) Integer.parseInt(valuediv);
    		long systemdiv = this.fnumber / this.snumber;
    		input.setText(String.valueOf(systemdiv));
    		String oldoutputdiv = output.getText();
    		output.setText(oldoutputdiv + valuediv);
    		
    	break;
    	 
    	
    	
    	case "*":
    		String valuemul = input.getText();
    		this.snumber = (long) Integer.parseInt(valuemul);
    		long system = this.fnumber * this.snumber;
    		input.setText(String.valueOf(system));
    		String oldoutputmul = output.getText();
    		output.setText(oldoutputmul + valuemul);
    		
    	break;
    	
    	
    	case "%":
    		String valuepercent = input.getText();
    		this.snumber = (long) Integer.parseInt(valuepercent);
    		long systempercent = this.fnumber + this.snumber/ 100;
    		input.setText(String.valueOf(systempercent));
    		String oldoutputpercent = output.getText();
    		output.setText(oldoutputpercent + valuepercent);
    		
    	break;
    	
    	}
    	
    }
    
    public void clear() {
    	input.setText("");
    	output.setText("");
    	this.fnumber = (long) 0;
    	this.snumber = (long) 0;
    
    }
    
    
}
