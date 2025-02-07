import java.util.Scanner; 

class AreaPerimeter {
    public static void main(String[] args) {
        final float radius = 5.5f;
        final float pi = 22.0f / 7.0f;
        
        float area = pi * radius * radius;
        float perimeter = 2 * pi * radius;
        System.out.println("The given radius of the circle is: " + radius + " cm");
        System.out.println("The area of the circle is: " + area + " cm^2");
        System.out.println("The perimeter of the circle is: " + perimeter + " cm");

        Scanner rd = new Scanner(System.in); 
        System.out.print("Input the radius (cm): "); 
        float r = rd.nextFloat(); 
        
        float a = pi * r * r;
        float p = 2 * pi * r;
        System.out.println("The given radius of the circle is: " + r + " cm");
        System.out.println("The area of the circle is: " + a + " cm^2");
        System.out.println("The perimeter of the circle is: " + p + " cm");
    }
}
