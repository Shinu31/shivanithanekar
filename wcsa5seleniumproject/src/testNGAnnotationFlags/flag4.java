package testNGAnnotationFlags;

import org.testng.annotations.Test;

public class flag4 {
  @Test(priority=1)
  public void a() {
	  System.out.println("a");
  }
  @Test(priority=0)
  public void b() {
	  System.out.println("b");
  }
  @Test(priority=1)
  public void c() {
	  System.out.println("c");
  }
  @Test(priority=1)
  public void d() {
	  System.out.println("d");
  }
  @Test(priority=0)
  public void e() {
	  System.out.println("e");
  }
  @Test
  public void f() {
	  System.out.println("f");
  }
  @Test
  public void g() {
	  System.out.println("g");
  }
  @Test(priority=-1)
  public void h() {
	  System.out.println("h");
  }
}
