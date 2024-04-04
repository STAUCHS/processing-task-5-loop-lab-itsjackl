import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // Draw bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  // Section 1
  public void draw_section1() {
    // Declare variables
    int intX = 0;
    int intY = 0;

    // Nested loops
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;

        // Print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 2
  public void draw_section2() {
    // Declare variables
    int intX = 0;
    int intY = 0;
    
    // Nested loops
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 300 + 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;
        
        // If/else statement to alternate colours
        if ((intRow % 2) == 1){
          fill(0);  
        }
        else{
          fill(255);
        }
        
        // Print rectangles
        noStroke();
        rect(intX, intY, 5, 5);
      }
  }
}

  // Section 3
  public void draw_section3() {
    // Declare variables
    int intX = 0;
    int intY = 0;

    // Nested loops
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 600 + 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;

        // If/else statement to alternate colours
        if((intColumn % 2) == 0){
          fill(0);
        }
        else{
          fill(255);
        }
        
        // Print rectangles
        noStroke();
        rect(intX, intY, 5, 5);
      }
  }
}

  // Section 4
  public void draw_section4() {
    // Declare variables
    int intX = 0;
    int intY = 0;

    // Nested loops
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 900 + 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;

        // If/else statement to alternate colours
        if((intColumn % 2) * ((intRow + 1) % 2) == 0){
          fill(0);
        }
        else{
          fill(255);
        }
        
        // Print rectangles
        noStroke();
        rect(intX, intY, 5, 5);
      }
  }
}

  // Section 5
  public void draw_section5() {
    // Declare variables
    int intX = 0;
    int intY = 0;

    // Nested loops
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 30; intColumn + intRow > 29; intColumn--) {
        intX = 3 + intRow * 10;
        intY = 3 + intColumn * 10;

        // Print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 6
  public void draw_section6() {
    // Declare variables
    int intX = 0;
    int intY = 0;

    // Nested loops
    for (int intColumn = 0; intColumn < 30; intColumn++) {
      for (int intRow = 0; intRow <= intColumn; intRow++) {
        intX = 300 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;

        // Print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 7
  public void draw_section7() {
    // Declare variables
    int intX = 0;
    int intY = 0;

    // Nested loops
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intRow + intColumn < 30; intColumn++) {
        intX = 600+ 3 + intRow * 10;
        intY = 3 + intColumn * 10;

        // Print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  // Section 8
  public void draw_section8() {
    // Declare variables
    int intX = 0;
    int intY = 0;

    // Nested loops
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn <= intRow; intColumn++) {
        intX = 900 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;

        // Print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
}