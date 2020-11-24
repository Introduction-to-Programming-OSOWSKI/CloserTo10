package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);
       assertEquals(5, App.close10(5, 50), "Failed on x = 5, y = 50");
       assertEquals(12, App.close10(-9, 12), "Failed on x = -9, y = 12");
       assertEquals(15, App.close10(15, 1), "Failed on x = 15, y = 1");
       assertEquals(0, App.close10(9, 11), "Failed on x = 9, y = 11. NOTE: sthis should return 0.");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2020, 1, 8), "Submitted Late");
    }


}
