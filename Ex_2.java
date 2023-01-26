//Suppose the high temperature (in degrees Fahrenheit) for each of next week's days are 
//45, 29, 10, 22, 41, 28, and 33 and the probability of precipitation for each of the next 
//seven days is 95%, 60%, 25%, 5%, 0%, 75%, and 90%. Write a program using a loop that displays 
//the day of the week if that day's high temperature is less than or equal to 32 and the probability 
//of precipitation is greater than 50% (meaning it's likely to snow).


//Mya Moxley
//WeekII

public class Ex_2 {
   public static void main(String[]args){


      String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
      int[] temp = {45,29,10,22,41,28,33};
      int[] rain = {95,60,25,5,0,75,90};

     /*  if (temp.indexOf(0)<32){
         System.out.println(temp);
         System.out.println(days.indexOf(0));
      }
*/

for (int i = 0; i < rain.length; i++) {
   if(temp[i] < 32 && rain[i] > 50 )
      System.out.println(days[i]);
      
   }








      
   }
}