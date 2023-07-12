package objects;

import junit.framework.TestCase;

public class PointTest extends TestCase {

  Point p1, p2;
	
  public void setUp() {
    p1 = new Point();
    p2 = new Point();
  }

  
  public void testDistanceBetweenPoints() {
    p1.setPoint(0, 0);
    p2.setPoint(0, 5);
    assertEquals( 5, p1.distance(p2), 0f);
  }
	
  public void testDistanceSamePoint() {
    p1.setPoint(0, 0);
    assertEquals(0, p1.distance(p1), 0f);
   }
  
  public void testNull() {
    Point p3 = null;
    try {    
      assertEquals(0, p1.distance(p3), 0f);
	}
    catch(NullPointerException e) {
    	System.out.println("excecao capturada!!!");
        return;
    }
    fail("should not get here...");
  }
  

    
  
  public void testOutro() {
	  p1.setPoint(10, 5);
	  p2.setPoint(20, 5);
	  double resultado = p2.distance(p1);
	  assertEquals( 10 , resultado, 0.000001);
	  
  }  
 
  
  public void testDistanciaEntreOutrosPontos() {
	  p1.setPoint(10, 5);
	  p2.setPoint(25, 5);
	  double resultado = p2.distance(p1);
	  assertEquals( 15 , resultado, 0.000001);
	  
  }
  
  
} // fim da classe
