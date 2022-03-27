package com.css.practical;

public class Implementation1 {
  String validator(Shipping details) throws SamePlaceException, WeightException{
    if(details.sourcePlace.equalsIgnoreCase(details.destinationPlace))
    {
       throw new SamePlaceException("source and destination cannot be same");
    }
    if(details.netWeight == details.totalWeight)
    {
        throw new WeightException("net weight cannot be greater than total weight");
    }
    return "shipping details are valid";
  }
  float bill(Shipping details)
  {
      float totalBill=0.0F;
      try
      {
         if(validator(details).equals("shipping details are valid"))
         {
            totalBill+=details.totalWeight*5;
         }
      } catch (SamePlaceException | WeightException e) {
          return 0.0F;
      }catch (Exception e){
          return -1.0F;
      }
      return totalBill;
  }
}
