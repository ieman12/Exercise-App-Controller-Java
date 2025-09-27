/**
 * Write a description of class App here.
 *App consist into to record person's step count and other features.
 * @author (Ieman S.)
 * @version (25-10-2024)
 */
public class App
{
// instance variables
private String title;
private String objective;
private int costInPence;
private int numberOfDownloads;
//to store highest step count acheved. 
private int highestStepCount;
//to sotre the name of the player with the highest step count.
private String highestStepCountName;
// Relating the controller to the app.
private Controller appController;

/**
* Constructor for objects of class App
*/
public App(String newTitle, String newObjective, int newCostInPence, Controller newAppController)
{
// initialise instance variables
title = newTitle;
objective = newObjective;
costInPence = newCostInPence;
// I set the number of donload to zero because it's a starting point
//of newly app. 
numberOfDownloads = 0;
highestStepCountName = "";
highestStepCount = 0;
appController = newAppController;
        
}

/**
* Defullt Constructor for objects of class App
*/
public App()
{
// initialise instance variables
title = "Step Counter App";
objective = "To get fitter";
costInPence = 75;
// I set the number of donload to zero because it's a starting point
//of newly app. 
numberOfDownloads = 4539;
highestStepCountName = "Laura M";
highestStepCount = 15000;
      
}
/**
* These are mutator methods
*/
public void setTitle (String newTitle)
{
    title = newTitle;
    }
    
public void setObjective (String newObjective)
{
    objective = newObjective;
    }
    
public void setCostInPence(int newCostInPence)
{
    costInPence= newCostInPence;
    }
    
public void setNumberOfDownloads(int downloads)
{
    numberOfDownloads = downloads; 
    }
    
/**
* These are accessor methods
*
*/
public String getTitle()
{
    return title;
    }
    
public String getObjective()
{
    return objective;
    }
    
public int getCostInPence()
{
    return costInPence;
    }

public int getNumberOfDownloads() 
{
    return numberOfDownloads; 
    }
    
/**
* Calculating earinings.
* The formula foe knowing the total earning is:
* Num. of Downloads x Cost per Donload
*/
public int calculateEarnings()
{
    return numberOfDownloads * costInPence;
}
    
/**
* Download method
* Here we shoud print the downloaded exercise app. 
*/
public void download()
{
    numberOfDownloads = numberOfDownloads +1;
    System.out.println("Title: " + title);
    System.out.println("Objective: " + objective);
    System.out.println("Download cost: " + costInPence);
        
}
    
/**
* checkStepCo   unt method
* Here we gonna execute if the step count are grater or not.
* I will use boolean methos. 
*Need to ask more info...
*/
public void checkStepCount(int stepCount, String playerName) 
{
    if (stepCount > highestStepCount) 
    {
     highestStepCount = stepCount;
     highestStepCountName = playerName; 
    }
    
}
    
/**
* This is printReport() method
*
*/
public void printReport()
{
    System.out.println("Title: " + title );
    System.out.println("Objective: " + objective);
    System.out.println("Download cost: " + costInPence);
    System.out.println("Number of downloads to date: " + numberOfDownloads);
    System.out.println("Highest count: " + highestStepCount);
    System.out.println("Highest step count to date: " + highestStepCountName);
    System.out.println("Earnings to date: " + calculateEarnings() );
    System.out.println("Controller player surname: " + appController.getcontrollerSurname());
    }
    
}
