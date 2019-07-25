package com.scci.edu.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
   List<String> addressList;
   Set<String>  addressSet;
   Map<String, String>  addressMap;
   Properties addressProp;

   // a setter method to set List
   public void setAddressList(List<String> addressList) {
      this.addressList = addressList;
   }
   
   // prints and returns all the elements of the list.
   public List<String> getAddressList() {
      System.out.println("List Elements :"  + addressList);
      return addressList;
   }
   
   // a setter method to set Set
   public void setAddressSet(Set<String> addressSet) {
      this.addressSet = addressSet;
   }
   
   // prints and returns all the elements of the Set.
   public Set<String> getAddressSet() {
      System.out.println("Set Elements :"  + addressSet);
      return addressSet;
   }
   
   // a setter method to set Map
   public void setAddressMap(Map<String, String> addressMap) {
      this.addressMap = addressMap;
   }
   
   // prints and returns all the elements of the Map.
   public Map<String, String> getAddressMap() {
      System.out.println("Map Elements :"  + addressMap);
      return addressMap;
   }
   
   // a setter method to set Property
   public void setAddressProp(Properties addressProp) {
      this.addressProp = addressProp;
   }
   
   // prints and returns all the elements of the Property.
   public Properties getAddressProp() {
      System.out.println("Property Elements :"  + addressProp);
      return addressProp;
   }
}