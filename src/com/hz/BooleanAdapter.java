package com.hz.;

import java.lang.reflect.Array;
import java.util.*;

public class BooleanAdapter extends ConsoleReader{
    private ConsoleReader adaptee;

   public BooleanAdapter(ConsoleReader reader){
       String[] correctWords = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

       if(Array.asList(correctWords).contains(reader)){

       }


   }
}
