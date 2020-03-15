// Kathleen Kagan
// ACO 101 - Tibbetts

public class Planet
{      
   private String planetName;
   private double gravity;
   
   /** 
   constructor for planet
   @param name (name of planet)
   @param grvty (gravity of planet)
   */
   public Planet (String name, double grvty)
   {
      planetName = name;
      gravity = grvty;
   }
   
   /**
   return name of planet
   @return name of planet
   */
   public String getName ()
   {
      return planetName;
   }
   
   /**
   return gravity of planet
   @return gravity of planet
   */
   public double getGravity()
   {
      return gravity;
   }
   
  /**
   return weight on planet
   @param weight on planet
   @return weight times gravity of planet
   */
   public double weightOnPlanet (double weight)
   {
      return weight * gravity;
   }
}