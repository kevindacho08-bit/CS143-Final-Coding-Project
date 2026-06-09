# Scholarship Search Engine & Tracker
This program receives user data and uses that information to match the user with eligible scholarship opportunities.  
This program also helps track accepted Scholarship opportunities made by the user.

## OOP Architecture 
    [Abstract Base Class: Scholarship] 
                 /         \ 
        [Subclass: User]  [Subclass: _Scholarship]
               \                   /
            [Class: CompareScholarships] 
                        |
                  [Class: Main]
  

## What Each Class Does
* **Scholarship** - This abstract class has the fields, accessor, and mutator methods for a scholarship object.
* **User** - Extended from Scholarship class due to field similarities.
* **Other Classes that Extend Scholarship** - We hard code scholarship values in these subclass constructors, the constructors do not take parameters.
* **CompareScholarships** - This class handles ArrayList<Scholarship>, comparing it, and returning sorted ArrayLists
* **Main** - Creates User class, calls CompareScholarships class, and provides info to user via menu based interface.
## Explain how the work together to perform project task

## Project Members
Made by David Vu, Kevin Ho, Casey LaBay, and TT Truong.
