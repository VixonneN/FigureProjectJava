package Figures.aplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Figures.aplication.FigureGraphics.*;

class DialogTest {
    private JPanel jPanel = new JPanel();

    private JButton lineButton = new JButton("Line");
    private JButton dotButton = new JButton("Dot");
    private JButton circleButton = new JButton("Circle");
    private JButton ellipseButton = new JButton("Ellipce");
    private JButton deleteButton = new JButton("Delete button");

    private void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        frame.add(lineButton);
        frame.add(dotButton);
        frame.add(circleButton);
        frame.add(ellipseButton);
        frame.add(deleteButton);

        jPanel.setBackground(Color.WHITE);
        jPanel.setPreferredSize(new Dimension(500, 300));
        frame.add(jPanel);

        frame.setPreferredSize(new Dimension(800, 600));

        lineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Line line = new FigureGraphics().new Line();
                line.paintLine(jPanel.getGraphics());
            }
        });

        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dot dot = new FigureGraphics().new Dot();
                dot.paintDot(jPanel.getGraphics());
            }
        });

        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circle circle = new FigureGraphics().new Circle();
                circle.paintCircle(jPanel.getGraphics());
            }
        });

        ellipseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ellipce ellipce = new FigureGraphics().new Ellipce();
                ellipce.paintEllipce(jPanel.getGraphics());
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteFigure delete = new FigureGraphics().new DeleteFigure();
                delete.deleteFigure(jPanel.getGraphics());
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DialogTest().createGUI();
            }
        });
    }
}