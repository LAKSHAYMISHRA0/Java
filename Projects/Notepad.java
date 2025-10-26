import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Notepad extends Frame implements ActionListener {
    private TextArea textA_show;
    private Menu file, Edit;
    private MenuItem New, Open, Save, SaveAs, Exit, Find, Find_replace;
    private MenuBar mb = new MenuBar();
    private boolean isModified = false;
    private String currentfilepath = null;

    public Notepad() {
        file = new Menu("File");
        Edit = new Menu("Edit");
        New = new MenuItem("New");
        Open = new MenuItem("Open");
        Save = new MenuItem("Save");
        SaveAs = new MenuItem("Save As");
        Exit = new MenuItem("Exit");
        Find = new MenuItem("Find");
        Find_replace = new MenuItem("Find & Replace");

        file.add(New);
        file.addSeparator();
        file.add(Open);
        file.addSeparator();
        file.add(Save);
        file.addSeparator();
        file.add(SaveAs);
        file.addSeparator();
        file.add(Exit);
        Edit.add(Find);
        Edit.addSeparator();
        Edit.add(Find_replace);
        mb.add(file);
        mb.add(Edit);

        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        SaveAs.addActionListener(this);
        Exit.addActionListener(this);
        Find.addActionListener(this);
        Find_replace.addActionListener(this);

        setTitle("Notepad");
        setSize(600, 400);
        setLocation(100, 100);
        setMenuBar(mb);
        textA_show = new TextArea();
        textA_show.addTextListener(e -> {
            isModified = !textA_show.getText().isEmpty();
        });
        this.add(textA_show);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                if (confirmExit()) {
                    System.exit(0);
                }
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == New) {
            if (isModified) {
                boolean shouldSave = confirmSave();
                if (shouldSave) {
                    saveFile(false);
                }
                textA_show.setText(""); 
                currentfilepath = null; 
                isModified = false;
            }
        }else if (ae.getSource() == Open) {
            if (isModified && !confirmSave()) return;
            openFile();
        } else if (ae.getSource() == Save) {
            saveFile(false);
        } else if (ae.getSource() == SaveAs) {
            saveFile(true);
        } else if (ae.getSource() == Exit) {
            if (confirmExit()) System.exit(0);
        } else if (ae.getSource() == Find) {
            createFind();
        } else if (ae.getSource() == Find_replace) {
            createFindReplace();
        }
    }

    public void openFile() {
        try {
            FileDialog fd = new FileDialog(this, "Open File", FileDialog.LOAD);
            fd.setVisible(true);
            String dir = fd.getDirectory();
            String fname = fd.getFile();
            if (fname != null) {
                currentfilepath = dir + fname;
                BufferedReader br = new BufferedReader(new FileReader(currentfilepath));
                StringBuilder msg = new StringBuilder();
                String str;
                while ((str = br.readLine()) != null) {
                    msg.append(str).append("\n");
                }
                br.close();

                isModified = false; // Ensure file loads without marking it as modified
                textA_show.setText(msg.toString());
            }
        } catch (Exception e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }

    public void saveFile(boolean saveAs) {
        try {
            if (currentfilepath == null || saveAs) {
                FileDialog fd = new FileDialog(this, "Save File", FileDialog.SAVE);
                fd.setVisible(true);
                String dir = fd.getDirectory();
                String fname = fd.getFile();
                if (fname != null) {
                    currentfilepath = dir + fname;
                } else {
                    return;
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(currentfilepath));
            bw.write(textA_show.getText());
            bw.close();
            isModified = false;
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public boolean confirmSave() {
        return showConfirmationDialog("Do you want to save changes?");
    }

    public boolean confirmExit() {
        return !isModified || showConfirmationDialog("You have unsaved changes. Do you really want to exit?");
    }

    public boolean showConfirmationDialog(String message) {
        Dialog dialog = new Dialog(this, "Confirmation", true);
        dialog.setLayout(new FlowLayout());
        dialog.setSize(300, 150);
        dialog.add(new Label(message));
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        final boolean[] result = {false};
        yesButton.addActionListener(e -> {
            result[0] = true;
            dialog.dispose();
        });
        noButton.addActionListener(e -> {
            result[0] = false;
            dialog.dispose();
        });
        dialog.add(yesButton);
        dialog.add(noButton);
        dialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                result[0] = false;
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
        return result[0];
    }

    public void createFind() {
        Frame findFrame = new Frame("Find");
        findFrame.setSize(250, 150);
        findFrame.setLayout(new FlowLayout());
        Label findLabel = new Label("Find:");
        TextField findField = new TextField(10);
        Button findButton = new Button("Find");
        Button closeButton = new Button("Close");
        findFrame.add(findLabel);
        findFrame.add(findField);
        findFrame.add(findButton);
        findFrame.add(closeButton);
        closeButton.addActionListener(e -> findFrame.dispose());
        findButton.addActionListener(e -> {
            String searched = findField.getText();
            String content = textA_show.getText();
            int index = content.indexOf(searched, textA_show.getCaretPosition() + 1);
            if (index >= 0) {
                textA_show.requestFocus();
                textA_show.select(index, index + searched.length());
                System.out.println("Text found at position: " + index);
            } else {
                textA_show.setCaretPosition(0);
                System.out.println("No further matches found.");
            }
        });
        findFrame.setVisible(true);
    }
    public void createFindReplace() {
        Frame replaceFrame = new Frame("Find & Replace");
        replaceFrame.setSize(400, 200);
        replaceFrame.setLayout(new GridLayout(5, 1));
    
        Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label findLabel = new Label("Find:");
        TextField findField = new TextField(15);
        p1.add(findLabel);
        p1.add(findField);
    
        Panel p2 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label replaceLabel = new Label("Replace With:");
        TextField replaceField = new TextField(15);
        p2.add(replaceLabel);
        p2.add(replaceField);
    
        Panel buttonPanel = new Panel();
        Button findNextButton = new Button("Find Next");
        Button replaceButton = new Button("Replace");
        Button replaceAllButton = new Button("Replace All");
        Button closeButton = new Button("Close");
    
        buttonPanel.add(findNextButton);
        buttonPanel.add(replaceButton);
        buttonPanel.add(replaceAllButton);
        buttonPanel.add(closeButton);
    
        replaceFrame.add(p1);
        replaceFrame.add(p2);
        replaceFrame.add(buttonPanel);
    
        findNextButton.addActionListener(e -> {
            String searched = findField.getText();
            String content = textA_show.getText();
            int index = content.indexOf(searched, textA_show.getCaretPosition() + 1);
            if (index >= 0) {
                textA_show.select(index, index + searched.length());
                System.out.println("Text found at position: " + index);
            } else {
                textA_show.setCaretPosition(0);
                System.out.println("No further matches found.");
            }
        });
    
        replaceButton.addActionListener(e -> {
            String searched = findField.getText();
            String replaceStr = replaceField.getText();
            String content = textA_show.getText();
            int index = content.indexOf(searched, textA_show.getCaretPosition());
            if (index >= 0) {
                textA_show.replaceRange(replaceStr, index, index + searched.length());
                textA_show.select(index, index + replaceStr.length());
                textA_show.setCaretPosition(index + replaceStr.length());
            }
        });
    
        replaceAllButton.addActionListener(e -> {
            String searched = findField.getText();
            String replaceStr = replaceField.getText();
            String content = textA_show.getText();
            String updatedContent = content.replace(searched, replaceStr);
            textA_show.setText(updatedContent);
        });
    
        closeButton.addActionListener(e -> replaceFrame.dispose());
    
        replaceFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }
}