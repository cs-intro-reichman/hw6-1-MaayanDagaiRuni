import java.awt.Color;

public class Editor4 {
       public Editor4() {
   }

   public static void main(String[] args) {
    String sourceFile = args[0];
    int steps = Integer.parseInt(args[1]);
    Color[][] source = Runigram.read(sourceFile);
    Color[][] grey = Runigram.grayScaled(source);
    Runigram.setCanvas(source);
    Runigram.morph(source, grey, steps);


   }
}

    

