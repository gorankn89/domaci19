package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        ASCIIArtGenerator artGen = new ASCIIArtGenerator();

        System.out.println();
        artGen.printTextArt("Hello!", ASCIIArtGenerator.ART_SIZE_SMALL);
        System.out.println();

        System.out.println();
        artGen.printTextArt("Milos is Great!", ASCIIArtGenerator.ART_SIZE_MEDIUM, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_DIALOG,"@");
        System.out.println();
    }


}