import javax.swing.*;
public class UsingJOptionPane{
public static void main(String [] args){
while(true){
String input = JOptionPane.showInputDialog("Input your name : " );
if(input == null){
JOptionPane.showMessageDialog(null, "Please input valid name : ");
continue;
}
int choice = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
if(choice == JOptionPane.YES_OPTION){
JOptionPane.showMessageDialog(null, "Hello " + input);
break;
}
else if(choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION){
continue;
}
}
}
}
