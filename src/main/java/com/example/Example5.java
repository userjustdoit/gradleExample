package com.example;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;

import java.awt.*;

public class Example5 {

    public static void main(String[] args) {

        String latex1 = "\\frac{1}{1+sin(x)}";
        String latex2 = "\\frac{1}{1+sin(x)+\\frac{1}{1+sin(x)+\\frac{1}{1+sin(x)+\\frac{1}{1+sin(x)}}}}";
        TeXFormula formula = new TeXFormula(latex1);
        formula.createPNG(TeXConstants.STYLE_DISPLAY, 20, "target/Example1.png", Color.white, Color.black);

        TeXFormula formula2 = new TeXFormula(latex2);
        formula2.createPNG(TeXConstants.STYLE_DISPLAY, 20, "target/Example2.png", Color.white, Color.black);

    }

}
