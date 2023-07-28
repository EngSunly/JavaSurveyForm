import java.awt.*;
import java.awt.event.*;


public class Main_withGui extends Frame
{
    public static void main(String[] args)
    {
        Main_withGui reg=new Main_withGui();
        System.out.println("Hello world!");
    }
    //Gui constructor
    Main_withGui()
    {
        // close form
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });


        //control frame
        setTitle("Registration Form");
        setSize(800,800);
        setVisible(true);

        setResizable(false);
        //Gui Code
        Color bg = new Color(46,2,25);
        setBackground(bg);
        setForeground(Color.blue);
        setLayout(null);

        Label l1=new Label("Registration Form");
        add(l1);
        l1.setBounds(300,50,100,50);
        Label l2=new Label("First Name");
        add(l2);
        l2.setBounds(250,100,100,10);
        TextField t1=new TextField(10);
        add(t1);
        t1.setBounds(400,100,100,30);
        Label l3=new Label("Last Name");
        add(l3);
        l3.setBounds(250,150,100,50);
        TextField t2=new TextField(25);
        add(t2);
        t2.setBounds(400,150,100,30);
        Label l4=new Label("" +
                "Address");
        add(l4);
        l4.setBounds(250,200,100,50);
        TextArea a=new TextArea(15,15);
        add(a);
        a.setBounds(400,200,100,50);
        Label l6=new Label("Gender");
        add(l6);
        l6.setBounds(200,250,100,50);

        CheckboxGroup cbg =new CheckboxGroup();
        Checkbox c4=new Checkbox("Male",cbg,false);
        add(c4);
        c4.setBounds(300,250,100,50);
        Checkbox c5=new Checkbox("Female",cbg,false);
        add(c5);
        c5.setBounds(400,250,100,50);

        Label l5=new Label("Hobbies");
        add(l5);
        l5.setBounds(250,300,100,50);
        Checkbox c1=new Checkbox("Cricket");
        add(c1);
        c1.setBounds(150,350,100,30);
        Checkbox c2=new Checkbox("Reading");
        add(c2);
        c2.setBounds(250,350,100,30);
        Checkbox c3=new Checkbox("PC Games");
        add(c3);
        c3.setBounds(350,350,100,30);

        Label l7=new Label("Subject"); add(l7);
        List l=new List(4);
        l7.setBounds(200,400,100,50);
        l.add("C++");
        l.add("PHP");
        l.add("Java");
        l.add("C");
        add(l);
        l.setBounds(350,400,150,40);

        Choice c=new Choice();
        c.add("Nashik");
        c.add("Pume");
        c.add("Mumbai");
        add(c);
        c.setBounds(300,500,100,50);

        Button b1=new Button("Send Data");
        add(b1);
        b1.setBounds(300,600,100,50);
        b1.setForeground(Color.black);



    }

}



