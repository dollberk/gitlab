
package hello;

public class Hello
{
 public static void main( String argv[] )
 {
 // This is Dylan pushing to dollberk's Github
 String name = "World";
 if ( argv.length != 0 )
 {
 name = argv[0];
 }
 System.out.println( "Hello, " + name + "!" );
 }
}