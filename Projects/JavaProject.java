// import java.awt.event.*;
// import java.io.*;
// import java.awt.*;
// public class JavaProject extends WindowAdapter implements ActionListener{
//     Frame window;
//     TextArea textArea;
//     MenuBar menuBar;
//     File currFile=null;
//     boolean ismodified=false;
//     public JavaProject(){
//         createWindow();
//         createTextarea();
//         createmenuBar();
//         // createFind();
//         window.setVisible(true);
//     }
//     public void createWindow(){
//         window=new Frame("Notepad");
//         window.setSize(400,300);
//         window.addWindowListener(this);
//     }
//     public void createTextarea(){
//         textArea=new TextArea();
//         textArea.addTextListener(e->ismodified=true);
//         window.add(textArea);
//     }
//     public void createmenuBar(){
//         menuBar=new MenuBar();
//         Menu FileMenu=new Menu("File");
//         Menu EditMenu=new Menu("Edit");
//         MenuItem newf =new MenuItem("New");
//         newf.setActionCommand("newf");
//         newf.addActionListener(this);
//         MenuItem open=new MenuItem("Open");
//         open.addActionListener(this);
//         MenuItem save=new MenuItem("Save");
//         save.addActionListener(this);
//         MenuItem save_as=new MenuItem("Save As");
//         save_as.addActionListener(this);
//         MenuItem Exit=new MenuItem("Exit");
//         Exit.addActionListener(this);
//         MenuItem find=new MenuItem("Find");
//         find.addActionListener(this);
//         MenuItem find_replace=new MenuItem("Find & Replace");
//         find_replace.addActionListener(this);
//         FileMenu.add(newf);
//         FileMenu.addSeparator();
//         FileMenu.add(open);
//         FileMenu.addSeparator(); 
//         FileMenu.add(save);
//         FileMenu.addSeparator();
//         FileMenu.add(save_as);
//         FileMenu.addSeparator();
//         FileMenu.add(Exit);
//         EditMenu.add(find);
//         EditMenu.addSeparator();
//         EditMenu.add(find_replace);
//         menuBar.add(FileMenu);
//         menuBar.add(EditMenu);
//         window.setMenuBar(menuBar);
//     }
//     public void windowClosing(WindowEvent e){
//         window.setVisible(false);
//         window.dispose();
//         System.exit(0);
//     }
//     public void openFile(String path){
//         try {
//             BufferedReader reader=new BufferedReader(new FileReader(path));
//             textArea.setText("");
//             String line;
//             while ((line=reader.readLine())!=null) {
//                 textArea.append(line+"\n");
//             }
//             System.out.println("File is opened!!");
//         } catch (IOException e) {
//             System.out.println("Failed to open File !!");
//         }
//     }
//     public void saveFile(String path){
//         if (path==null || path.isEmpty() || path.equals("nullnull")){
//             System.out.println("NO FILE IS SELECTED !!");
//             return;
//         }
//         if (currFile!=null) {
//             BufferedWriter writer=null;
//         try
//         {
//            writer=new BufferedWriter(new FileWriter(path));
//             writer.write(textArea.getText());
//             System.out.println("File Saved !!");
//         } catch(IOException e) 
//         {
//             System.out.println("Saving the file is Failed !!");
//         }
//         }
//         else {
//             FileDialog saveAs = new FileDialog(window, "Save As", FileDialog.SAVE);
//             saveAs.setVisible(true);
//             SaveAs(saveAs.getDirectory() + saveAs.getFile());
//         }
       
//         }
//         public boolean showSaveConfirmation() {
//             Dialog confirmDialog = new Dialog(window, "Save Changes", true);
//             confirmDialog.setLayout(new GridLayout(2, 1));
//             confirmDialog.setSize(300, 100);
//             Label message=new Label("Do you want to save changes to the current file?");
//             confirmDialog.add(message);
//             Panel buttonPanel=new Panel();
//             Button yesButton=new Button("Yes");
//             Button noButton=new Button("No");
//             Button cancelButton=new Button("Cancel");
//             buttonPanel.add(yesButton);
//             buttonPanel.add(noButton);
//             buttonPanel.add(cancelButton);
//             confirmDialog.add(buttonPanel);
//             final boolean[] decision=new boolean[1]; 
//             yesButton.addActionListener(e -> {
//                 decision[0]=true; 
//                 confirmDialog.dispose();
//             });
//             noButton.addActionListener(e -> {
//                 decision[0]=false; 
//                 ismodified=false; 
//                 confirmDialog.dispose();
//             });
//             cancelButton.addActionListener(e -> {
//                 decision[0]=false; 
//                 confirmDialog.dispose();
//             });
//             confirmDialog.setVisible(true);
//             return decision[0];
//         }
    
//     public void SaveAs(String path){
//         if (path==null || path.isEmpty() || path.equals("nullnull")){
//             System.out.println("NO FILE IS SELECTED !!");
//             return;
//         }if (currFile!=null) {
            
//         }
//         BufferedWriter writer=null;
//         try 
//         {
//             writer=new BufferedWriter(new FileWriter(path));
//             writer.write(textArea.getText());
//             System.out.println("file save successfully at:-"+path);
//         }catch(IOException ex) 
//         {
//             System.out.println("error in saving File"+ex.getMessage());
//         }
        
// }
//     public void newf(String t){
//         textArea.setText(t);
//     }

//     public void actionPerformed(ActionEvent e){
//         String command=e.getActionCommand();
//         switch (command) {
//             case "newf":
//                 if (ismodified && showSaveConfirmation()) {
//                     FileDialog save=new FileDialog(window,"Save",FileDialog.SAVE);
//                     save.setVisible(true);
//                     saveFile(save.getDirectory()+save.getFile());
//                 }
//                 newf("");
//                 ismodified=false;
//                 break;
//             case "Open":
//             if (ismodified && showSaveConfirmation()) {
//                 FileDialog save=new FileDialog(window,"Save",FileDialog.SAVE);
//                 save.setVisible(true);
//                 saveFile(save.getDirectory()+save.getFile());
//             }
//                 FileDialog open=new FileDialog(window,"Open",FileDialog.LOAD);
//                 open.setVisible(true);
//                 openFile(open.getDirectory()+open.getFile());
//                 ismodified=false;
//                 break;
//             case "Save":
//                 FileDialog save=new FileDialog(window,"Save",FileDialog.SAVE);
//                 save.setVisible(true);
//                 saveFile(save.getDirectory()+save.getFile());
//                 break;
//             case "Save As":
//                 FileDialog saveAs=new FileDialog(window,"Save As",FileDialog.SAVE);
//                 saveAs.setVisible(true);
//                 SaveAs(saveAs.getDirectory()+saveAs.getFile());
//                 break;
//             case "Exit":
//                 window.setVisible(false);
//                 window.dispose();
//                 System.exit(0);
//                 break;
//             case "Find":
//                 createFind();
//                 break;
//             case "Find & Replace":
//                 createfind_replace();
//                 break;
//             default:
//                 System.out.println("UNKNOWN ACTION !!  ");
//                 break;
//         }
//     }
    // public void createFind(){
    //     Frame findf=new Frame("Find Window");
    //     findf.setSize(200,200);
    //     findf.setLayout(new GridLayout(3,1));
    //     Panel p1=new Panel(new FlowLayout(FlowLayout.LEFT));
    //     Label find=new Label("Find");
    //     p1.add(find);
    //     Panel p2=new Panel(new FlowLayout(FlowLayout.LEFT));
    //     TextField text=new TextField(10);
    //     p2.add(text);
    //     Panel p3=new Panel(new FlowLayout(FlowLayout.CENTER));
    //     Button b1=new Button("Find");
    //     Button b2=new Button("Close");
    //     p3.add(b1);
    //     p3.add(b2);

    //     findf.add(p1);
    //     findf.add(p2);
    //     findf.add(p3);

    //     b2.addActionListener(e->findf.dispose());
    //     b1.addActionListener(e->{
    //         String searched=text.getText();String content=textArea.getText();int index=content.indexOf(searched,textArea.getCaretPosition()+1);
    //         if (index>=0){
    //             textArea.select(index,index+searched.length());
    //             System.out.println("TEXT IS FOUND AT "+index);
    //         }else{
    //             System.out.println("Further Matches NOT FOUND !!");
    //             textArea.setCaretPosition(0);
    //         }});
    //     // System.out.println("find frame is working");
    //     findf.setVisible(true);
    //     findf.addWindowListener(new WindowAdapter() {
    //         public void windowClosing(WindowEvent e){
    //             findf.dispose();
    //         }
    //     });
    // }
    // public void createfind_replace(){
    //     Frame replacef=new Frame("Find & Replace");
    //     replacef.setSize(400,200);
    //     replacef.setLayout(new GridLayout(5,1));
    //     Panel p1=new Panel(new FlowLayout(FlowLayout.LEFT));
    //     Label find=new Label("Find");
    //     p1.add(find);
    //     Panel p2=new Panel(new FlowLayout(FlowLayout.LEFT));
    //     TextField text=new TextField(10);
    //     p2.add(text);
    //     Panel p3=new Panel(new FlowLayout(FlowLayout.LEFT));
    //     Label replace=new Label("Replace With");
    //     p3.add(replace);
    //     Panel p4=new Panel(new FlowLayout(FlowLayout.LEFT));
    //     TextField text2=new TextField(10);
    //     p4.add(text2);

    //     Panel p5=new Panel();
    //     Button b1=new Button("Find Next");
    //     Button b2=new Button("Replace");
    //     Button b3=new Button("Replace All");
    //     Button b4=new Button("Close");
    //     p5.add(b1);
    //     p5.add(b2);
    //     p5.add(b3);
    //     p5.add(b4);

    //     replacef.add(p1);
    //     replacef.add(p2);
    //     replacef.add(p3);
    //     replacef.add(p4);
    //     replacef.add(p5,BorderLayout.SOUTH);
    //     b1.addActionListener(e->{
    //         String searched=text.getText();
    //         String content=textArea.getText();
    //         int index=content.indexOf(searched,textArea.getCaretPosition());
    //         if (index>=0) {
    //             textArea.select(index, index+searched.length());
    //         }else{
    //             System.out.println("Text Does Not Found");
    //         }
    //     });
    //     b2.addActionListener(e->{
    //         String searched=text.getText();
    //         String replace_str=text2.getText();
    //         String content=textArea.getText();
    //         int index=content.indexOf(searched,textArea.getCaretPosition());
    //         if (index>=0) {
    //             textArea.replaceRange(replace_str, index, index+searched.length());
    //             textArea.select(index, index+replace_str.length());
    //             textArea.setCaretPosition(index+replace_str.length());
    //             System.out.println("First Occurance is Replaced !!");
    //         }else{
    //             System.out.println("Text Does Not Found");
    //         }
    //     });
    //     b3.addActionListener(e->{
    //         String searched=text.getText();
    //         String replace_str=text2.getText();
    //         String content=textArea.getText();
    //         String updated=content.replace(searched, replace_str);
    //         textArea.setText(updated);
    //         System.out.println("Text is Replaced !! ");
    //     });
    //     b4.addActionListener(e->replacef.dispose());
    //     replacef.setVisible(true);
    //     replacef.addWindowListener(new WindowAdapter() {
    //         public void windowClosing(WindowEvent e){
    //             replacef.dispose();
    //         }
    //     });
        
    // }
//     public static void main(String[] args) {
//         JavaProject j=new JavaProject();
//      }
// }
