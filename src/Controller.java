import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Controller {

    JFrame window;
    JPanel textPanel;
    JTextArea textArea;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);

    String text;
    int i = 0;

    SoundEffect se = new SoundEffect();

public static void main(String[] args) {
    new Controller();
}
    public Controller() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.RED);
        window.setLayout(null);

        textPanel = new JPanel();
        textPanel.setBounds(100, 100, 600, 250);
        textPanel.setBackground(Color.GRAY);
        window.add(textPanel);

        textArea = new JTextArea();
        textArea.setBounds(100, 100, 600, 250);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.white);
        textArea.setFont(normalFont);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textPanel.add(textArea);

        window.setVisible(true);

        text = "What is your name?";

        timer.start();
    }

    Timer timer = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            char[] character = text.toCharArray();
            int arrayNumber = character.length;

            String addedCharacter = "";
            String blank = "";

            addedCharacter = blank + character[i];
            textArea.append(addedCharacter);

            i++;

            //URL typeSoundURL = getClass().getResource("typewriter-key-1");
            //se.setURL(typeSoundURL);
            se.playSound("typewriter-key-1");

            if (i == arrayNumber){
                i = 0;
                timer.stop();
            }
        }
    });
/*
        intro();
        Scanner userName = new Scanner(System.in);
        System.out.println("What is your name?");

        String Name = userName.nextLine();
        System.out.println("So... " + Name + " Welcome to the end of you... buahahaha");
        System.out.println("Well get to the end of the dungeon and claim your reward, fame and glory!");
        System.out.println("Now, Decide who to save: ");
        System.out.println("Save a lost Dog?");
        System.out.println("Save a stranger you found on this room?");
        System.out.println("You decide " + Name + ", Will it be the Dog or Stranger?");
        Scanner level1 = new Scanner(System.in);
        String level1choice = level1.nextLine();

        if (level1choice.equals("Dog") || level1choice.equals("DOG") || level1choice.equals("dog")) {
            System.out.println("Good Choice.");
            System.out.println("The lost Dog will smell enemies you may find and help you on your journey");
        } else if (level1choice.equals("Stranger") || level1choice.equals("stranger") || level1choice.equals("STRANGER")) {
            System.out.println("The Stranger turned out to be a Daemon!");
            System.out.println("It stabs you in the hearth as you were saving him.");
            System.out.println("GAME OVER.");
            System.exit(0);
        }
        System.out.println("You Walk through a narrow hallway and feel the heat go up with every step.");
        System.out.println("There seems to be a light at the end of the hallway...");
        System.out.println("You reach the end and find yourself on a different room");
        System.out.println("There is a 4X4 grid on the floor and an exit on the opposite side of the room");

        System.out.println("choose which platform you will step on: ");
        System.out.println("You have four choices");
        System.out.println("Choose 1, 2, 3, or 4");

        Scanner oneXFour = new Scanner(System.in);
        Scanner twoXfour = new Scanner(System.in);
        Scanner threeXfour = new Scanner(System.in);
        Scanner fourXfour = new Scanner(System.in);

        int oneByFour = oneXFour.nextInt();
        if (oneByFour == 4) {
            System.out.println("take your next step.");
            int twoByFour = twoXfour.nextInt();
            if (twoByFour == 2) {
                System.out.println("take your next step.");
                int threeByFour = threeXfour.nextInt();
                if (threeByFour == 1) {
                    System.out.println("take your next step.");
                    int fourByFour = fourXfour.nextInt();
                    if (fourByFour == 4) {
                        System.out.println("You've reached the other side of the room.");
                        System.out.println("You walk through the door and continue the journey.");
                    }
                }
            }
        } else {
            System.out.println("The platform under you has shattered and you've fallen in Lava.");
            System.exit(0);
        }

        System.out.println();


    }

*/
    public static void intro() {
        System.out.println("===================================");
        System.out.println("Welcome to Escape The Java Dungeon");
        System.out.println("===================================");

    }
}
