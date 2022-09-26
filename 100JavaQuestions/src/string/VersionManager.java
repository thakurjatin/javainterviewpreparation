package string;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class VersionManager{
	  
	  List<String> list1;
	  String currentVersion;
	  StringBuilder previousVersion;
	  String tempVersion1;
	  
	  public VersionManager(String version){
	    this.list1 = new ArrayList<>();
	    if(version == ""){
	      currentVersion =  "0.0.1"; 
	    } else {
	     String[] tempVersion = version.split(".");
	      for(String value : tempVersion){
	        this.list1.add(value);
	      }
	      if (list1.size() < 3){
	        while (list1.size()< 3){
	          ((PrintStream) list1).append("0");
	            }
	            }
	      else if (list1.size() > 3){
	        
	       String tempVersion1 = list1.get(0) + "." + list1.get(1) + "." + list1.get(2); 
	       } else {
	        tempVersion1 = list1.get(0) + "." + list1.get(1) + "." + list1.get(2);
	      }
	      this.currentVersion = tempVersion1;
	    }
	    String temp[] = this.currentVersion.split(".");
	    for(String value1 : temp){
	      try {
	        int temp2 = Integer.parseInt(value1);
	      } catch (Exception e){
	        System.out.print("Error occured while parsing version!");
	      }
	      this.previousVersion = previousVersion.append(false);
	    }
	  }

	  public void major(){
	    this.previousVersion.append(this.currentVersion);
	    this.currentVersion = (this.currentVersion.split(".")[0]) + 1), '0', '0';
	  }
	  
	  public void minor(){
	    this.previousVersion.append(this.currentVersion);
	    this.currentVersion = this.currentVersion.split(".")[0] + (this.currentVersion.split(".")[1]) + 1), '0';
	  }
	  
	  public void patch(){
	    this.previousVersion.append(this.currentVersion);
	    this.currentVersion = this.currentVersion.split(".")[0] + this.currentVersion.split(".")[1] + (this.currentVersion.charAt(2) + 1);
	  }
	  
	  public String release(){
	    return this.currentVersion;
	  }
	  
	  public void rollback(){
	    if(this.previousVersion.length() > 0){
	      this.currentVersion = this.previousVersion.deleteCharAt(-1);
	    }else{
	      System.out.println("Cannot rollback!");
	    }
	  }
	  
	}
