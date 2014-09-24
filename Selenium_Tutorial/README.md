As part of my learning, I posted [Selenium Tutorial](#a1) and programs. Programs are available in [src folder](src/com/sample/SelTrainin) and Tutorial (Notes) is posted below. 

Selenium Tutorial: 
============
 1: Tools/Libraries : Required for Selenium learning & also for creating automation framework.  
 2: Selenium Tutorial Index.  
 3: Selenium Tutorial.  
 4: Differences between some methods/commands.  
 5: Topics not covered in this tutorial.  
 6: Some Java Concepts (which I used in framework)

Tools & Libraries
-----------------
I've used below tools/software during my learning and I listed them here:  
1: Selenium IDE on Firefox.  
2: Selenium WebDriver2 from Selenium website.  
3: Eclipse.  
4: Java.  
5: Firebug & Fire path (Addons for Firefox).  
6: Addons for Safari, Chrome and IE.  
7: Ant.  
8: TestNG and Excel sheets  
9: Excel Application's POI Jars.  
10: Selenium GRID

Selenium Tutorial Index
-----------------  
1: About Selenium  
2: Firebug and Firepath  
3: Creating a Driver Object  
4: Locators  
5: Combo Box; How to work with Combo Box.  
6: Actions  
7: Switch Commands  
8: How to work with different browsers.  
9: Wait/TimeOut Settings  
10: Screenshot  
11: Verifications  
12: Robot Class.  
13: Java Script Executor  
14: TRY/Catch block  
15: Excel   
16. TestNG  
17. Selenium GRID  
18. ANT

SELENIUM TUTORIAL
------------------------  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
**1: ABOUT SELENIUM**   
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
1.1: Selenium is a web automation tool. 
 - It is a Firefox addon
 - But can run testings automation on any browser and on any Os.
 -  It supports many languages. Most popular is Selenium with JAVA.
 -  It supports Web application testing on,
  - Desktop 
  - Devices (iPhone, android)

1.2: Selenium used for,  
- Web applications testing.  
- And also used for Mobile web application's testing. (For ex: Safari on iOS, Chrome in Android). You can run automation on both. Simulators and also on physical devices (by connecting them to computer).

1.3: Selenium Drawbacks:  Sometimes selenium might not work well with below actions or components.
- It doesn't work well on flex OR flash.
- Sometimes right click options doesn't work
- Multiple windows
- Drag and Drop options
- Mouse moving
- IE browser have more problems than others. 

1.4: Selenium VS Appium: 
Both are automation tools but Appium is only Mobile Automation tool. It is easy to learn Appium if you already know Selenium.

1.5: Selenium Components:  
1.5.1: IDE: It is addon on firefox browser only.  
1.5.2:  Selenium Server:RC: It is also called, Remote control OR Selenium 1.0 Or Version 1.0 OR Selenium Server.
This is deprecated 4years back.
WebDriver: It is also called
- Selenium 2.0/WebDriver
- Version 2.0
- Selenium Server.
- Native browser
- Why its called native browser: When selenium automation starts to run, it opens a fresh browser for testing. If browser have addons,bookmarks or cookies, WebDriver removes all these and opens a fresh browser (without any of these).   

1.5.3:GRID: With the help of this tool, you can run selenium automation scripts from remote box. 
How do you run remotely: Here you talk about hub and nodes. Lets take example. You have a hub and three nodes. . 
Node 1: With MAC OS with Safari browser
Node 2: Linux OS with Chrome browser
Node 3: Windows with Firefox browser. 
Basically, all these three nodes should be registered first in HUB. It is nothing but we register all three Ips in hub. And then run we use the grid tool to run automation on all three nodes from HUB. 
Here, automation is running simultaneously on three nodes. If one fails, the another one will not be affected. So all three are independent. 

1.6: JRE7: While creating a java project in eclipse, you will find an Option for selecting JRE. By default, it should be JRE7.  You can also choose JRE8 but selenium works most comfortable with JRE 7.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   
**2:FIREBUG & FIREPATH**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
1: It is a Firefox addon. It installed only on Firefox.After you install it, restart the browser and launch Firebug.
Now, you should see firebug (it should be similar to below picture). 

![alt tag](https://github.com/mjalleda/Selenium/blob/master/Selenium_Tutorial/Screenshots/FireBug_Firepath.png)  

2: On the top panel, you will find
- Firebug icon
- Inspect Element/arrow button in a box
- left and right arrows,
- Command line popup
- Tabs: Console, html, CSS, Script, DOM, Net, Cookies and Firepath. 
- Search Box with up and down arrows.

3:  On Right Panel: You will find Style, computed, Layout, DOM, Events

4: We use, on left panel
- Firebug icon:
- Inspect element: Click on it and place it on an html element. Later firebug shows its attributes.
- Console Tab: It shows all html code. 
- FirePath > Select Xpath: now inspect for an element, it will show XPath value for that element. 
- FirePath > Select CSS: now inspect for an element, it will show CSS value for that element.
- FirePath > Select CSS: now inspect for an element, it will show CSS value for that element.
- Search box: You can search for any attributes/tags.

5: We use the following: On right panel
- Computed: We check all CSS values for getCssValues() method. I mean, for verification purpose.
- Sometimes, we use Style tab for verification of attributes values only.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
**3: CREATING A WEBDRIVER OBJECT & TYPES OF WEBDRIVERS**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
In selenium we use the below code.  
Webdriver Driver = new FirefoxDriver.  
Usually, In java we create object like below.  
<ClassName> Driver  = new <ClassName>.

but in Selenium the child reference is FireFoxDriver.  Actually, when you create WebDriver Object, it inherits properties from both (Parent & child) class. So, it inhertis from WebDriver & also from FirefoxDriver. We need to import below packages before creating a WebDriver.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

WebDriver Object methods: There are many methods for this object, but few of below are most used.  
Get, navigate, close, quit, findelement, manage & SwitchTo. You will find their description, usage in my assignments/programs.

**Types of WebDrivers:**
Basically, there are two types of WebDriver() classes are available in Selenium. They, are:  
WebDriver() : It is called child of RemoteWebDriver()  
RemoteWebDriver(): It is called parent of WebDriver()

RemoteWebDriver() Vs WebDriver():   
RemoteWebDriver runs automation on Node machines which are registered with hub.  Where, webDriver runs automation only on the same machine.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
**4: LOCATORS & COMMANDS:**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
1: There are many locators available. They are: Id, name, class, linkText, Xpath and CSS.   
2: SendKeys is a command.

**1 & 2:Id & Name Locators:**
Most used locator is ID. On a web page, a html element can have multiple properties like id, name, class. Id & name are unique identifiers.  
Code snippet for Id:  
*Driver.findelement(By id(“Id locator”)).click();*

Code snippet for Name:  
*Driver100.findelement(By.name(“Google Search”)).click();*

**3: Class locator**
On a web page, a group of same objects (for ex: group of  buttons, OR group of links) can share same classname. We can also use this locator.  
Code snippet for Class:  
*Diver100.findelement(By.class(“gbqfba”)).click();*

Disadvantages of class locator:  
Since a group of objects contain the same name, it may not be a good if  automation completely dependent on class locator. So class is not recommend to use very often.  
Then why do we use group locator? In case, if “id” and “name” are not available then “class” is used.  
What happens if a group of objects are exist on a web page and Selenium developer choose “class” locator ? It will click on the first html elemnt from that group.

**4: LinkText**
Again it is also a locator. It will used to click on html links.  
Syntax is:  
Driver100.findelement(By.linktext(“Advertisement”)).click();  
What if same LinkText exists for more than one html element on a same web page: In this case, it will perform action on first html element on the page.

**5: Xpath locator**   
1: There are three types of Xpath locators. 
- Absolute Xpath
- Positional/Shortest Xpath
- Relative Xpath  
2: The most used one Relative xpath.   
3: It is always better to write xpath manually, rather depending on firebug & firepath. Because Firepath only avialable in Firefox and not in other browsers  like IE/Safari/Chrome. So, it is better to write your own.

**5.1: Absolute Xpath:** 
Most of the selenium deverlopers prefer to not use this one. Here, we need to use tree structure of html source code to write Absolute Xpath.  
For ex: I want to write Xpath for Serach button in below html source code, how can I write?  

![alt tag](https://github.com/mjalleda/Selenium/blob/master/Selenium_Tutorial/Screenshots/AbsoluteXpath.png)

Now, we want to find Search. How do we find this? Remember, it is exist in third div level and at second button level. Since it is third level of div, we should write like div[3]. And button should be like button[2].  
Absolute Xpath should be like: /html/body/div[3]/button[2]

First, it will check in 1:div, it will search for button, if it wont find then it will search in 2:div..it will continuously search for button[2]. In case, if it won't find then it will return “No matching node”.

**5.2: Positional Xpath:** Is a shortest Xpath, basically you use doubleslash (//), If doubleslash exist in Xpath, selenium will directly go to that level.  
For example, in above example write positional Xpath for  button (facebook). You can directly write //button3.   
It will look for three buttons in each level. Only in form folder, three buttons exist, so it will go to there. Or you can aslo write //form/button[3], in this case, it will search for form and then search if three buttons exist, if so it will go inside.  
Actually, in second division also have button (facebook) exist, but it is NOT third button, so it will not go inside. 

**5.3: Relative XPath:**
It has a relation in between html element and its locator. Most of the time, we find element's id locators  or names locators, and it should be easy to write Relative Xpath using Type 1. But in other cases (link span, html links) they don't have id locators and name locators. In that case, we use Type 2 OR Type 3  for writing Relative Xpath. In all three cases, we use backslash (//)& at (@) symbol. Backslash directly checks for html element, and @ is used to search for the locator.

5.3.1: Format one:  writing Relative Xpath:  
Format :  //htmlelement[@id='gbqfba']. For ex: button[@id='gbqfba']  
@symbol search for the position.  
In above, it will search for element “button” if button finds, then it will immediately search for id locator, if locator value finds then it will run the script.

5.3.2: Format two: writing Relative Xpath:  In below example, the hyperlinks (gmail, images,  +you) are have same classname (see below code, cpied from firebug) and data-ved too. But their hyperlinks/hrefs are different, so we can use their href values.  

![alt tag](https://github.com/mjalleda/Selenium/blob/master/Selenium_Tutorial/Screenshots/Relative_Xpath.png)

For +You://a[@href='https://plus.google.com/?gpsrc=ogpy']  
For Gmail://a[@href='https://mail.google.com/mail/?tab=wm']  
For Images://a[@href='https://www.google.co.in/imghp?hl=en']

5.3.3 Format 3:  writing Relative Xpath: 
On google homepage, there are three textlinks, which have same id lcoator and don't have name locator. In this case, we can either use textlink OR Xpath. Below html code you will find for these three htmllinks.  

![alt tag](https://github.com/mjalleda/Selenium/blob/master/Selenium_Tutorial/Screenshots/Relative_Xpath_Foramt3.png)

So, how to write a Xpath using paren'ts id. Here parent is “span” and child is “a href”.  
For Element: hyperlink “Advertisement”  
//htmlelement[@id='id']/a[1]   
//htmll  
//span[@id='fsl']/a[1]

For Element: hyperlink “Business”  
//htmlelement[@id='id']/a[2]   
//htmll  
//span[@id='fsl']/a[1]

For Element: hyperlink “About”  
//htmlelement[@id='id']/a[3]   
//htmll  
//span[@id='fsl']/a[1]

**6: CSS locator** Casade styling sheet.
Firepath is not available for IE and Chrome browsers. In this case, how can you find CSS and Xpath locators for an object. No, you can't find in these browsers, you have to write your own CSS and Xpath properties. So, it is better if you write  CSS and Xpath. 
There are three types, that you can write CSS.
- Using id locator
- Using Classname locator
- Using any other locators (like href, a, name)

6.1: Using ID: Using ID locator we can use CSSSelector. Format is,  
Format: htmlelement#id  
Example: button#gqafba

6.2: Using Classname: Using Classname locator we can use CSSSelector. Format is,  
Format: htmlelement.classname  
Example: button.gqafba

6.3: Using any other locator: We can use other attributes like href, name,a, id, classname. Format is,  
Format: htmlelement[locator='value']  
example: button[id='gqafba']

6.4: Using Greater Symbol (>) : Using child element, we can also find a parent's element.  
Format: Parent element's CSS selector > childelement's CSSS  
Example: font#addlang > a[href='http://....=homepage']

Note: You can use parents levels up , for ex:  
Parent's css selector > level 2 parent's css selector > level 3 parent's css selector > finall child's

**7: SendKeys()command**  
This command is used to pass input data. For ex: pasing keyword in google search textbox.  
Usually, good practice is, clear out edit box (in case if any text is already present OR by default if any text is already present then remove it) and then pass your input. 
Syntax:  
*Driver.findelement(By.id(“Textbox/Edit box field's id”)).clear();*  
*Driver.findelement((By.id(“Textbox/edit box field id”))).sendkeys(“Please pass the input”);*  
In java 1.8 sendkeys command doesn't support, so you need to change the JRE to JRE 1.7. Then it supports.  

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**5: DROPDOWN BOX/COMBO BOX**
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
1: There are three commands we use to select options from Dropdown box.
- sendKeys
- By Using Xpath
- Select Class with selectByIndex options.

For ex: Select box name is : Month with options from Jan, feb to Dec.
Image Month Drop down Xpath is: //select[@id='month']
& jan Options Xpath location is : ///select[@id='month']//option[1]

1: sendKeys. With sendKeys() command, we directly select the option. To select, Jan option from Month Drop down box, we should write,
WebDriverObjective.findelement(By.Xpath(“//select[@id='month']”)).sendKeys(“Jan”);

2: Using Xpath option: With Option's Xpath location, we directly click on the option. To select, Jan option from Month Drop down box, we should write, 
WebDriverObjective.findelement(By.Xpath(“//select[@id='month']//option[1]”)).click();

3: Using Select Class with selectByVisibleText command.
- 1: Here, we use "Select" class. Later, we store DropdownBox name into a Variable1. 
- 2: Later, we create a object using Select class with above creating variable.
- 3: Using this Object, we call selectByVisibleText command and pass the option value. In this case, we pass "Jan".


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
**6: ACTIONS**
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
We use Actions for different purposes like,  
1: Mouse move: When we mouse to a htmlelemt (for ex: Ajex controls), it shows/displays a dropdown box.  
2: RightClick: If you right click, some options will be opened up.  
3: Drag and Drop: Drag file/image from one source to destination  
4: Double Click.

**1: MouseMoves:** 
For ex: When you move a mouse on html elemnt, it shows some options. Let say, you move mouse on to DropDown box and then it shows available options. For ex, go to  
http://www.naukri.com & move mouse to html element “Search Jobs button”.   
Action: When you move your mouse on to this button, a dropdown box will open up.  
We use below command during this testing. “moveToElement”  
How to MouseMove:  
1:First create a Object using Action class.  
2: Get the Xpath location for the element which you want to move the mouse on to.  
3: Now, using Object, execute method moveToElement, which will open up the combo box.  
4: In advance, get Xpath Locator for the option which you want to select, after the box opens up, click on the option.

**2: RightClick:** For ex: When you right click on an element, a contextMenu should popup/displayed. Later you should select the options from contextMenu.  
Ex: http://medialize.github.io/jQuery-contextMenu/demo.html
HtmlElement: “right click me” button  
Action: When you click on above button, a contextmenu will open up with options like, “edit”, “copy”...etc.
We use below command during this testing. “contextClck”  
How to RightClick:  
1: First create a object using Action class.  
2: Get Xpath location for the element, which you want to rightclick on. Which will open up context menu.  
3: Now, using XpathLocation, click on element from context menu.


**3: doubleClick:** 
When you doublec lick on an element, a new windpw page will openup.  
Ex: http://www.naukri.com  
HtmlElement: “ChipDsg/Semicond Calsoft Labs” link  
Action: When you doubleclick on the element, it goes to a new page..  
We use below command during this testing. “doubleClick”  
How to double click:  
1: First, create a object using Actions class.  
2: get Xpath of the element which you want to double click.  
3: Now, execute the command doubleClick() with the object you created.

**4: Drag And Drop:** You need both source and destinations here. You drag source and drop into destination.  
Ex: http://jqueryui.com/droppable  
HtmlElement: A frame has both two elements. One is source and another one is target. When you want to drag source and drop into target.  
Action: We use below command during this testing. “dragAndDrop”  
This is a special thing.   
1: Here, you need to first open up a frame. For that, we use switchTo() method on webDriver Object.   
2: Later, we create a object from action class.   
3: Later create two variables for source and destination from WebElement.   
4: Get Source locator( the item which you want to drag) and store in src variable.  
5: Get destination locator (the location where do you want to drop the item), and store into destimation variable.  6: Now, execute dragAndDrop command on the object you created with help of Src and Dest variables.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
**7: Switch Commands**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
We use switchTo() commands on Webriver object. We usually, use them to switch to frames, handling popups/alerts & for handling windows.  
1: How to work with frames:  
2: How to work with alerts:  
3: WINDOWS

**1: How to work with frames:**  
WebDriver Object driver can't directly work with frames, you need to switch them to frames using switch command.  Look at below example.  

![alt tag](https://github.com/mjalleda/Selenium/blob/master/Selenium_Tutorial/Screenshots/Frames1.png)

Let say, you have a page (the yellow box) it has two frames. A frame with in a frame. Outermost frame (green box) has element2, and innermost frame has element3.   
Now, we have two tasks. We need to click on Element3 first and then on Element1 & then on element2. Red –> Yellow → Green.  
1: First, we switch our WebDriver object to Outermost frame, and then again switch webobejct driver to innermost frame. And click on Element2.  
2: Now, we completely come out from both frames to current page. For that we select defaultContent() command, now webobject driver focus is on current page (on yellow box). Here, we click on Element1.  
3: Now, we again move to Outermost frame and click on the element2 and will come out frame using defaultContent() command.

**2: How to work with alerts:**   
Usually, most of the alerts are written in javascript not in html.  
Alerts will always have ok & cancel buttons only.   
To click on OK button: we use accept command.  
Webobjectdriver.switchto().alter(“provide locator”).accept();  

To click on cancel/NO button: we use dismiss command.  
Webobjectdriver.switchto().alter(“provide locator”).dismiss();

**3: WINDOWS**  
3.1: How to change the focus in between windows.  
3.2: How to close a current window OR all windows?

**3.1: How to change the focus in between windows.** : WebDriver gives a unique hashcode for each single webpage. Using hashcode, Webdriver object changes its focus in between pages.  
Why do we use hashcodes why not other locators?  
Because usually webpages doesn't get any locators like id, name..etc. But some times we see locators like target. In that case, we can use target, o.w. We have to depend on hashcode only.  
Task1: Let say, you have two pages ( imagine, page2 openeed by page1). Page1 refers to Yellow box & page2 refers to blue box. Now, we have to click on element2 and then close webpage2 and then page1. For this, we need to change the webdriverobject focus to page2. GetwindowHandle() command returns only current pages hashcode but getwindowHandles() command returns all opened pages hashcodes. 

![alt tag](https://github.com/mjalleda/Selenium/blob/master/Selenium_Tutorial/Screenshots/Frames_2.png)  

1: First store current pages hashcode into a string variable1.  
2: Now, store all pages hashcodes into a set.  
set<string> = WebDriver Object.getWindowHandles();  
3: Now iterate each hashcode and find the second page's window hashcode.And store it into a String variable S2  
4: Now change the WebDriver Object focus to 2nd page.  
Webdriverobject.switchTo.window(S2);

**3.2: Close command:** Which closes the page where the webdriverobject focus is on, but quit command closes all the opened webpages. Which is safe too.   
In above example,   
1: after you click on element2 now you have to close the webpage2 first   
2: then change the focus to page1.  
3: now close element1.

If you close webpage two and it will not automatically change the FOCUS to webpage one. It will not change the focus. You have to tell the webdriver to change the focus to page1. 

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
**8: How to work with different browsers.**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
1: Usually, automation runs faster on IE and chrome than firefox.  
2: download addon from selenium download page. The 64bit version works on 32bit system.  

1: How to configure IE/Chrome addons into your project/class: In our java class, write below line of code.  
WebdriverObject.setproperty(“webdriver.chrome.driver”.”//Volumes//Chrome//Chrome”);  
WebdriverObject.setproperty(“webdriver.IE.driver”.”//Volumes//IE//IE”);  
Note: make sure, yours IE/Chrome is stored in volumes folder.

**1: IE**  
IE & Its problems  Why & how to change windows size?  
One is with Window size problem: IE returns errors if window is not maximized during automation execution. So, you have to add below line of code to maximize window size.  
WebDriverObject.manage().window().maximize();

**2: Chrome browser:**  
In Windows:  
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");   

In MAC:   
System.setProperty("webdriver.chrome.driver", "/Users/appledev/Downloads/ChromeDriver");		  

Syntax to create WebDriver Chrome Object.  
WebDriver Obj1 = new ChromeDriver();

**3: Safari Browser:**  
Mac:  
1: If you are running on Mac, you NO NEED to call with System.properties();   
2: On MAC, usually when you start running your class file, you immediately find below lines in console. It is just saying the port number and all.  
Jul 31, 2014 10:16:26 PM org.openqa.selenium.safari.SafariDriverServer start  
INFO: Server started on port 12944  
Jul 31, 2014 10:16:27 PM org.openqa.selenium.safari.SafariDriverCommandExecutor start  
INFO: Launching Safari  
Jul 31, 2014 10:16:27 PM org.openqa.selenium.safari.SafariDriverCommandExecutor start  
INFO: Waiting for SafariDriver to connect  

Windows:   
1: But if you are running on windows, then you need to write like below  
System.setProperty("webdriver.safari.driver", "<Safari driver path>");  
WebDriver Obj1 = new SafariDriver();


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
**9: Wait/Timeout settings**
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
There are couple of ways, where we can set wait period.  
1: thread.sleep(1000)  
2: Implicit wait  
3: Explicit  Wait 

**1: Thread.sleep(10000);**  
This is java code.  
It will work with microseconds. If you give in 100000, it will take it as 10 second.  
You need to add “throws InteruptedException” to the class.   
Public static void main(String[] args) throws InterruptedException.  
It will blindly wait for 10 seconds, no matter if the next line visible/statment appeared/satisfied. It just wait for 10 seconds.  
Since it will blindly waits and doesn't check if the following condition is satisfied.

**2: Implicit wait settings:**   
Which is a selenium class, you need implicitly tell, wait for certain statement/condition/element to satisfied/appeared. Otherwise return an error.  

Lets take an example.  
Obj1.manage().timeouts().implicitlyWait(Argument1, TimeUnit.SECONDS);  
Obj1.findElement(By.id("locator for some html element")).click();  

Example:
Obj1.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
Obj1.findElement(By.id("car-view-reservation")).click();  

1: Using manage() & timeouts() commands, we call implicitly command().  
In this, we need to pass the value and argument. Argument1 should can be from Nano seconds to Days.   
2: Immediately in next line, we are passing a htmlelement click.   
3: here, selenium checks every second if that htmlelement appears, if so it will go to next line, if not it keeps on checks 120 seconds, after 120 seconds, it will return an error.

**3: Explicit Wait settings:**  
We need to explicitly tell, if that condition appears, then it will continue. This is mostly used for  
If an element is presented/visible.  
If an element is not visible, then continue.   
And also used for many others like if alters are present, if frame is present, if element is enabled/disabled, if element ready to be clickable,   

WebDriverWait wait = new WebDriverWait(Obj1, 120);   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("html element locator")));  

1: First we need to create a Object using with “WebDriverWait” class.  
2: Here, we use Until() command, ExpectedConditions(), later we pass our condition.   

For ex:  
1: If you upload a document, and the spinner appears for uploading/downloading, in that case, we can use explict wait and we can ask to “wait until spinner disappear”. Here, we can use method “invisibilityOfElementLocated()”
wait.until(ExpectedConditions.invisibilityOfElementLocated(locator)(By.id("car-view-reservation")));  

2: We can also tell for the conditions like,  
When a element becomes clickable/enabled &  
When frame appears...

3: By default, it takes in seconds.

4: PageTimeOutLoad: This is a special case, we can't write any of above timeouts on this, because most of the time we don't write/provide any arguments for it. Some webpages, you may find “target” but not in all webpages. Anyways, since no htmlelement is available then how to handle timeouts for a page? Selenium provided a special command for it, it is called PageTimeOutLoad(). It checks if page loaded within given time, otherwise return an exception. The code should be,  
Obj1.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

1: Remember, we are using manage() & timeouts() on our webdriverobject and passing pageLoadTimeout(). It checks if page loaded or not, it checks each and every second, if it doesn't find page in 120 seconds, then it will return an exception.

**Difference between Implicit & Explicit waits**  
Implicit Wait: During Implicit wait if the Web Driver cannot find it immediately because of its availability, the WebDriver will wait for mentioned time and it will not try to find the element again during the specified time period. Once the specified time is over, it will try to search the element once again the last time before throwing exception. The default setting is zero. Once we set a time, the Web Driver waits for the period of the WebDriver object instance.  
Explicit Wait: There can be instance when a particular element takes more than a minute to load. In that case you definitely not like to set a huge time to Implicit wait, as if you do this your browser will going to wait for the same time for every element.  
To avoid that situation you can simply put a separate time on the required element only. By following this your browser implicit wait time would be short for every element and it would be large for specific element.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**10: SCREENSHOTS:**
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    
1: You can take screenshots only for a webpage. Not for popups/alerts/dialogs.  
2:  You can save screenshots into your local machine and later verify it with Java code.   
3: You can save screenshots in any extension like .png, .jpeg, .jpg, etc..  
4: Try/Catch Block: You can write the code in try block, if any exceptions/error page returned then you can save that error page in screenshot in catch block. For ex: look at assignment.  
5: We use Files for screenshots, for taking screenshot below is standard code.   
File src = ((TakesScreenshot)Obj1).getScreenshotAs(OutputType.FILE);  
FileUtils.copyFile(src, new File("/Users/appledev/Desktop/Screenshot1.png"));

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**11: VERIFICATIONS/RETRIVALS:**
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
There are many verifications provided for different purposes.  
1: getText(), getSize(), getLocation(), getAttributes(), getTagName() & getCSSValues.  
2: IsSelected, IsDisplayed, isEnabled  
3: Compound verifications (Means, List of same elements verifications).  
4: Tables  
5:  elements which we can't verify:

**1: GetText:**  This is used to return a text which is displayed on a webpage. We can save this in WebElement OR String data types. We usually use this for elements like,   
Search/Input boxes,  headings, tables, Frames, etc.

**2: getAttributes():** It is used for all locators and also for any attribute values which are defined by developers. We again store this in WebElement OR String. We usually use this for locators like,  
Id, name, classname & and attributes like: src, type, href, title, any.....

**3: getTagName():** This is used to get a tagname. For ex: /a is a tag. /div is also a tag. /frame is also a tag.  
This is heavily used in Compound element handling. Since we need to handle multiple elements at same time, so we go by //a OR //img OR //Table OR //Div //iframe.

**4: getLocation() Vs getSize().**  
1:  Both can't be stored neither in Strings NOR in WebElement datatypes.  
2: getLocation() is used to verify a location of an element, and it will return the values of X & Y coordinates of an element, so it will return two values. It can be stored only in Point Datatype.  
3: getSize() is used to verify a size of an element, and it will returns values of length & width of an element, so it will return two values. These values are stored only in Dimensions Datatype.

**5: getCSSValues:**
We use this method to retrieve/verify CSS values of an element. CSS values of an element can be found under Firebug.  Go to Firefbug > In Right Window > Select Computed > Under here, you will find CSS values (which are like, font related...etc) see below page. 

![alt tag](https://raw.github.com/username/projectname/branch/path/to/img.png)

1: In case, if you want to find font-colors, background colors, height/width/size of an element then you can use getCSSValues().  

**6: isSelected, isEnabled, isDisplayed():**  
1: To find if any element is enabled/disabled. For ex: Submit button will be enabled when you pay the amount. So it should be in isEnabled() mode until then, so you can use “isEnabled” mode.  
2: To find if a radio/check/drop down boxes are selected, then you can isSelected option.  
3: If a button is displayed, OR if a spinner is still displayed, OR if a dialog is displayed, then you can use “isDisplayed” mode.

**7: Compound Verifications:**  
1: In order to test/verify/retrieve a group of same elements then we use “Compound Handling Mechanism”. Which is nothing but,  retrieving a group of elements in List<WebElement>. Later, we can iterate the list and find which value we are looking/checking/verifying for. 
For ex:   
1: To retrieve all links on a page. Which will be possible by htmlelement “a”  
2: To retrieve all images on a page. Which will be possible by attribute “img”  
3: To retrieve all tables on a page. Which will be possible by htmlelement “table”  
4: To retrieve all links on a page. Which will be possible by htmlelement “frame”  
5: To retrieve all buttons on a page. Which will be possible by htmlelement “button”  
6: To retrieve all input/text boxes on a page. Which will be possible by htmlelement “input”

**8: Tables verification:**  
1: In order to verify/return/retrieve table elements, first we need to go though the table.   
2: In my Excel assingments I created below methods,   
- Cell Values for a column name & row number  
- Cell values for a column number & row number  
- number of rows  
- number of columns  
- if a sheet exist

**9:  Things which we can't verify:**  
1: Charts/Graphs  
2: Playing/recording/paused/moving Videos files  
3: Playing/paused Audio file

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**12: ROBOT CLASS**
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
Robot class is a Java class. Where it provides KeyBoard & Mouse related events.  
Why we use Keyboard OR Mouse buttons?  
1: For any reason, if you can't click on OK/cancel buttons on a popup dialog, then you can click on “Enter” key from keyboard.   
2: If you want to test Mouse right click buttons.   

In cases like above, you can use Robot class. It enters all keys which are available from Keyboard.   
And Mouse right, left and middle(Scroll bar) clicks.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**13: JAVA SCRIPT EXECUTOR CLASS**
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
This is a Java class, which is used to execute JavaScrpt Code OR javascript methods.  
Limitations: We use this class/code only when Website uses Javascript code.   
Why do we need this class in Selenium? : In some websites, some buttons/links/any html elements are not active/not clickable/doesn't respond by Selenium. In order to do automation, all html elements should respond to selenium commands but sometimes some don't respond. In those cases,  we should talk to developers and understand the JavaScript code that they used in the developing web application.  

In two ways, we can JSM in Selenium.  
**1: Either get that Button/Link JavaScript method code completely and Copy paste in your selenium code.**
Example for calling Javascriptmethod code which is used by developer in web application.  
1: Object response = ((JavascriptExecutor) driver).executeAsyncScript(  
2:       "var callback = arguments[arguments.length - 1];" +  
3:       "var xhr = new XMLHttpRequest();" +  
4:       "xhr.open('GET', '/resource/data.json', true);" +  
5:       "xhr.onreadystatechange = function() {" +  
6:       "  if (xhr.readyState == 4) {" +  
7:       "    callback(xhr.responseText);" +  
8:       "  }" +  
9:       "};" +  
10:       "xhr.send();");  
11:   JSONObject json = new JSONObject((String) response);  
12:   assertEquals("cheese", json.getString("food"));  

Some syntax points:  
1: Code at number one line, does three thing.   
 - Returning response in a variable called “response” which is  Object data type.   
 - Creating a Object of JavascriptExecutor  
ExecutingAsyncScript and also inserting the java script code.

2: Javascript code is From line 2nd  to line 10th line. Each Javascript line is separated with double strings(“”) and also Plus(+) sign. Remember, the last line (at 10th ), doesn't have a plus sign because there is NO Javascript code after that.  
3: Later, we are changing response Object to JsonObject type.  
4: Finally, verifying if string “Cheese” Exist in JsonObject OR not.  

**2: OR if they used any JavaScript methods**, get those method names and directly use them in your selenium. If method needs any arguments/prameters, please pass them too.
Example for calling java script methods from a web site.  

WebDriver driver=new FirefoxDriver();    
driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");  
JavascriptExecutor js=(JavascriptExecutor) driver;  
String domain_name=(String) js.executeScript("return document.domain");

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**14: Try/Catch Block**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
Try/catch block: In try block, we write the code & if any errors/exceptions are returned we catch them in catch block. A good example is: Taking screenshots. We write the code and if we know code might return errors/exception then we catch them in CATCH block. In selenium, we use Try/Catch a lot.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**15: EXCEL APPLICATION**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**1: Excel Usage** 
In most of automation frameworks, we use excel applications for Test cases, test steps, test data or to store test results. I also used in my framework for all these purposes.

**2: POI Jars and Configuration.**  
1: In selenium, POI jar libraries are required in order to work with Excel application.  
So, we need to download and attach these libraries to our project.  
2: Go to website http://poi.apache.org/download.html > binary distribution > click on zip file. poi-bin-3.11-beta2-20140822.zip ( 24MB, signed)  
In your Java project, right click >  select build path > select configure build path > add external libraries > select below libraries > Say OK.  
(The below jars are available in ooxml-lib, lib and poi-3.11-beta2 folders)  
commons-coded-1.5.jar  
commons-loggin-1.1.jar  
dom4j-1.6.1.jar  
junit-3.8.1.jar  
log4j.1.2.13.jar  
poi-3.9-20121203.jar  
poi-excelant-2.9-20121203.jar  
poi-ooxml-3.9-20121203.jar  
poi-ooxml-schemas-3.9-20121203.jar  
poi-scratchpad-3.9-20121203.jar  
stax-api-1.0.1.jar  
xmlbeans-2.3.0.jar

**3: Excel Inbuilt methods**:  
1: First we need to get our excel file, then define Workbook, Sheet , Row and cell (in POI subject, it is called cell, this is nothing but column).  
2: For defining these four, we use POI classes. For ex: XSSF is used for new version of excel (.xlsx) and HSSF is used for old excel (.xls).   
3: In POI Subject, Excel sheet number starts from 0.  
4: In POI Subject, Row number starts from 0.  
5: In POI Subject, column/cell number starts from 0.  
6:There are many inbuilt methods we use for ex: getSheetAt(index). Index is nothing but sheetNumber. If you provide index it returns a Sheet Object. Later On sheet object we can perform many methods like, getPhysicalNumberofRows(), getLastDatacell(), getRowCount() and so on.

**4: My Libraries (functions/methods which I created):**  
Using POI libraries I created below methods in my assignments.  
1: PrintAllCellValues for given SheetName.  
2: Check if a sheet exist?  
3: Return TotalRowCount for given sheetname  
4: Return TotalColumnCount for given sheetname  
5: Return a cellvalue when ROW number & Column number are given  
6: Return a cellvalue when a ROW number & Column Name are given

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**16: TESTNG**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
I covered below TestNG topics.  
1: [About TestNG. Configuration & Installation](#B1)  
2: [Annotations](#B2)  
3: [Assertions](#B3)  
4: [Test Groups](#B4)  
5: [Reports (Emailable Report, Console & Errors)](#B5)

**1: About TestNG**  
1: TestNG: This is a tool, which can be configured in Eclipse. Most of selenium developers use this tool, for   
-Running Test suites  
-For writing annotations 
-It also provide good test reports.

2: How to use this?  
In your project in Eclipse, right click, you will find TestNG. It has two options.  
TestNG > RightClick > Create a TestNG Class  
TestNG > RightClick > Convert into TestNG

3: Create a TestNG class: If you select it, it will create a class with annotations. You can select annotations during this classcreation.

4: Convert it into TestNG: Basically, this will be used to select multiple classes and to create a testsuite. 
Select multiple/single classes from a project > select this option > you will see “Generating testing/xml” file, here you can create a TestSuite file and you can also edit classes.

4: Preserve-order=true  
If you add above line to the TestNG.xml file, then it go by the order. For ex, you might listed ten test cases (.java files) in test sutie and TestNG  will execute all of them in their order.

5: It also provides many reports.

**2: Annotations:**  
TestNG provides 10 Annotations.  
@Test, @DataProvider  
@BeforeSuite, @AfterSuite  
@BeforeTest, @AfterTest  
@BeforeClass, @AfterClass  
@BeforeMethod, @AfterMethod.

**Annotation:**  
Annotation are nothing but blocks, where you can write piece of code Before OR After your testcase. For ex:  
1: You want to create WebDriverObject in advance. Then, you can use @BeforeMethod.  
2: You want to close/quit WebDriverObject after some method. Her you can use, @AfterMethod.

1: @TEST: In this annotation, you can write test case. You can have multiple @Test annotations with in a class.  
2: @BeforeMethod & @AfterMethod: As we said earlier, here we can write driver open/close commands, etc.  
3: @BeforeSuite & @AfterSuite: If you want to perform some actions before & after suite then you can use these annotations. For ex: open excel sheet OR close excel sheet Or Open/close db connections.  
4: @BeforeClass & AfterClass: If you want to perform some actions before & after class then you can use these annotations.  
5: @DataProvider : To perform/pass complex/multi parameters you can use dataprovider. This will return a multidimensional object. like: Object[][]. Let say, you want to return key value parameters as two dimensional array, you can use it. Which can carry/forward data from class to class.  
In your framework, you are using a method called getDATA() which will carry the data and pass it to testcases classes.  
This annotation should be called by @Test annotation only.  Can have line code as like any other java methods.  
6: Annotations Priority order:  
@BeofreSuite >> @BeofreTest >> @BeofreClass >> BeforeMethod >> @Test >> @AfterMethod >> @AfterClass >> @AfterTest >> AfterSuite.

**3: TestNG Assertions**  
1: Assertions are TestNG Methods. Assert verifies  
-	compare values of two arrays/variables.   
-	verifies a variable is null  
-	verifies condition is true OR False  
-	Many others too.  

2: Rather than using Assert, you can also check the condition in a IF/while loop and return result.  
3: Then why assert is introduced: Because it is online code, and it returns error as an assertion exception, if it pass then it continues, o.w it returns assert exception.  
4: There are many assertion methods are available for Byte, short, int, long, double, char, string and array and Object datatypes. According to your specification you can use the appropriate assertion method.  
5: But most of important assertions are below.  
- Assert.assertEquals()  
- Assert.assertArrayEquals()  
- Assert.assertNotEquals()  
- Assert.assertTrue()  
- Assert.assertFalse()  
- Assert.assertSame  
- Assert.assertNull()

**1: Assert.assertEquals()**  
1: it takes total two mandatory parameters and compare their value. If both values are same then only it returns pass, o.w, it returns error/exception.  
Diff between assertEqauls() assertSame():  
assertSame() compare type & value of given parameters,  
assertEqual() compare only value of a given parameter.

2: This has total 3 parameters.  
Assert.assertEquals(“Message is an optional parameter”, expected variable, actual variable);  
OR  
Assert.assertEquals(expected, actual);

**2: Assert.assertNotEquals() :**  
1: it takes total two mandatory parameters and compare their value. If both values are NOT same then it returns pass, if both values are same then it returns error/exception.  
2: This has total 3 parameters.  
Assert.assertNotEual(“Message is an optional parameter”, expected variable, actual variable);  
OR  
Assert.assertNotEqual();

**3: Assert.assertArrayEquals() :**  
1: it takes total two mandatory parameters and compare their value. It takes only Array parameters. They can be any datatypes like int, byte, string, Object or double.   
Diff between assertEqauls() assertArrayEquals():  
assertArrayEquals() compare only array variables, but assertEqual() compare any parameters including object, and array parameters.  
2: This has total 3 parameters.  
Assert.assertArrayEquals(“Message is an optional parameter”, expected array, actual array);  
OR  
Assert.assertArrayEquals(expcted array, actual array);

**4: Assert.assertTrue() :**  
1: it takes total one mandatory condition and compare if given condition is True/passed/successful/matched.   
Then assert return pass, O.w. It returns exception.  
2: This has total 2 parameters.  
Assert.assertTrue(“Message is an optional parameter”, condition);  
OR  
Assert.assertTrue(condition);

**5: Assert.assertFalse() :**  
1: it takes total one mandatory condition and compare if given condition is False/Failed/ not matched.   
Then assert return pass, O.w. It returns exception.  
2: This has total 2 parameters.  
Assert.assertFalse(“Message is an optional parameter”, condition);  
OR  
Assert.assertFalse(condition);

**6: Assert.assertNull() :**  
1: it takes total one mandatory condition and compare if given parameter value is Null. If so, it returns pass, o.w., it returns exception.   
Then assert return pass, O.w. It returns exception.  
2: This has total 2 parameters.  
Assert.assertNull(“Message is an optional parameter”, variable);  
OR  
Assert.assertNull(variable);

**7: Assert.assertSame() :**  
1: it takes total two mandatory parameters and compare their type & value. If both matches then only it returns pass, o.w., it returns error/exception.  
Diff between assertEqauls() assertSame():  
assertSame() compare type & value of given parameters,  
assertEqual() compare only value of a given parameter.

2: This has total three parameters.  
Assert.assertSame(“Message is an optional parameter”, expected variable, actual variable);  
OR  
Assert.assertSame(expected, actual);

**4: TestNG Groups**
With TestNG groups, you can group your smoke/regression/functional test cases and run them by their category.

For ex: Let say, you want to run smoke automation, then you want to run only 10 test scripts out of large amount of cases. You can mark/group those 10 cases as “smoke” and run from TestNG suite.  
Like this, you can run regression, functional, integration test automation suites. 

Lets take an example and explain.  
1: Let say you have two java classes, which ten test cases each (under @Test annotation).  
If you want to mark first test cases from each class file as “smoke”, mark them as smoke.  
For ex: @Test(groups=”smoke”)  
2: In yout TestNG Suite, you need to mention the group.  
Now, insert above two class files into TestNG suite, then write group name as “smoke” in TestNG suite file and run the suite. It will only run those two cases which marked as “smoke” and return the results

**5: TestNG Reports**  
TestNG generates the results in many forms. But most used ones are:   
1: Console  
2: Emailable Report

**1: Console:** For passed & Failed cases. It contains,
- The xml file location  
- Print statements  
- If it is passed, it shows @Test annotation method name with PASSED if it passed  
- If it is failed, it shows @Test annotation method name here with FAILED mark. It also contains           Assertion failure command.  
- Default Test, number of test run and faillures and skip  
- Default Suite, number of test run and faillures and skips  
- Time taken for each output result files.

[TestNG] Running:
/private/var/folders/mk/fhjr9r1x1h3fp4znrz1rsd_80000gn/T/testng-eclipse--322693934/testng-customsuite.xml  
Any Print Statments here:  
PASSED: @Test annotation method name here.  
OR  
FAILED: @Test annotation method name here.  
org.junit.ComparisonFailure: expected:<Se[]l> but was:

Default test  
Tests run: 1, Failures: 0, Skips: 0

Default suite  
Total tests run: 1, Failures: 0, Skips: 0

[TestNG] Time taken by org.testng.reporters.EmailableReporter2@17fe1feb: 36 ms
[TestNG] Time taken by org.testng.reporters.JUnitReportReporter@335856a5: 14 ms
[TestNG] Time taken by org.testng.reporters.SuiteHTMLReporter@15aaf0b3: 29 ms
[TestNG] Time taken by org.testng.reporters.jq.Main@77f297e7: 89 ms
[TestNG] Time taken by org.testng.reporters.XMLReporter@5ff06dc3: 21 ms
[TestNG] Time taken by [FailedReporter passed=0 failed=0 skipped=0]: 0 ms


**2: Emailable-report.html**:  also shows the same information but in Table formats with different colors. So it is very easy to understand. And in Online, you will find many programs on emailing this emailable-report.html to our email address. 

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**17: SELENIUM GRID**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
1: ABOUT SELENIUM GRID:  
2: Hub & Node connections  
3: Hub & NodeMachine Requirements

**1: ABOUT SELENIUM GRID:**  
Here, you will find notes with an example.  
Let say, you have a automation framework/suite in a machine called A. And you want to run this automation on other machines B & Machine C at same time. You need to run the automation from machine A (hence it is called hub) and B & C are called nodes.  
How to do this? You can achieve this by Selenium GRID. In olden days, Selenium GRID was provided as a separate jar file but recently it was included in selenium server jar file. Hence we need to start selenium server jar file to start selenium GRID. Along with that, we need to mention the role, Which means, if the mahcine is acting as a hub or node?  
Port number is optional. Usually, it starts on port number 4444. [this is called default port number]. But for any reason if it is not starting on 4444, you can pass port number parameter. 

**2: Hub & Node connections**  
1: First, you  need to start hub.  
2: Confirm if hub started correctly  
3: Second, you need to start/register nodes  
4: Confirm if node started correctly?  
5: On hub, execute automation and it should run on nodes.

**1: First, you  need to start hub.**
1.1: Go to command prompt/terminal application, and execute below commands. 
java -jar <selenium-jar file> -role <hub/node>  <[optional]-port  <portnumber>]

**2:  confirm if it started correctly**
On Hub machine, go to browser and execute URL http://localhost:4444/grid/console, you should see gird console V2.24.2 view configuration, basically it gives configuration for the hub, like host, port cleanUpcycle, timeout sessions, etc.. 

**3: Start/register Node(s).**
3.1: Go to command prompt/terminal application,  and execute below commands.  
java -jar <selenium-jar file> -role <node>  <[optional]-port  <portnumber>] -hub http://<hub ip address>:<hub portnumber>/grid/register/

**4:  confirm if node started correctly**  
On Hub machine, go to browser and execute URL http://localhost:<hub prot number>/grid/console   you should see gird console V2.24.2 view configuration and it should the node configuration. Here, you should see two tabs. Browsers & Configuration.  
4.1: Browsers: Here, you see,How many browsers ( like IE, Firefox, and Chrome) a hub allowed to connect. For ex: A hub can allow to execute five firefox browsers on node machine.
Don't confuse: It shows both remote control and web driver, Both are same.   
4.2: configuration: In configuration, you should see, What is node's port number, remoteHost URL, capabilities..etc. 
**5: From Hub, execute automation and it should run an Node:**  
1; There are only two extra lines you need to add to your automation. Those two lines will be added when you create your WebDriver object.   
In this scenario, we use RemoteWebDriver() class.   
1st line: Create a Driver Object of type RemoteWebDriver()  
2nd line: During this creation you need to pass one capabilities of that driver. For that, we call/use DesiredCapabilities class. 
DesireCapabilities: Basically, you can set/adjust some settings on node machines. For ex: you want to disabled JavaScript on a node or platform setting, Or to set browsername, etc.. 

**4: Hub & NodeMachine Requirements:**  
HUB:  
1: Should be able to allow multiple remote connections.

Nodes:  
1: Shoud allow remote connection.  
2: In below line, you mentioned browser path, so you need to confirm if really browser stored/located there?  
System.setProperty("RemoteWebDriver.firefox.bin","/Volumes/Firefox/Firefox");  System.setProperty("RemoteWebDriver.chrome.driver", "/Users/appledev/Downloads/ChromeDriver");

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
**18: ANT**  
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  
1: What is ANT  
2: How to run ANT/build.xml from eclipse?  
3: How to run ANT/build.xml from desktop? 

**1: What is ANT:**  
Ant is build/integration tool.  
Then, why testers are using:  
1: To do multiple tasks in one click: Which means, compile, run, email and reporting.  
2: Ant can easily configure with TestNG files.. (Remember: In one TestNG.xml file we can have multiple suites).  
3: Later, you can create a small .bat file and execute above ant's build.xml file. So, with a single click all your automation can be executed. You can configure this .bat file windows/mac schedulers. And you can run it when ever you want.

**2:How to run ANT/build.xml from eclipse?**  
1: In your java project > Select buid.xml > righ click > run as > external tools configurations > from dialog select JRE tab > then select JRE 1.6 from separate JRE radio button > then click on run button.  
2: Now, in eclipse select window tab > show view > select ant. On eclipse right panel, you will see ANT like in below picture. Click on icon “add build files” which has icon Ant picture With + symbol (which is next to “add build files with search”). It will open up  a dialog and ask to select a project. (it will show only those projects which have build.xml file). Then select the project and from it select build.xml file.  
4: Now, in the same righ panel doubl click on Ant icon, which will open your ANT project.  In that project you will find all tasks like build, all, compile, email, run, report, etc..  
5: now double click on any task for ex: run. It will run your testNG file and will show results like below. There you will see the ANT results, Which would contain TestNG suite test results.

**3: : How to run ANT/build.xml from desktop?**  
1: Why do we need to run it from desktop:   
To run ANT, either you have to open up command prompt/terminal app OR eclipse, to avoid it we can create a small .bat file and you  can run it.   
2: I've this file copied to /Users/appledev/Documents/workspace/Downloads/Run_ANT.bat  
3: Basically, it has below two lines of code.  
cd /Users/appledev/Documents/workspace/Selenium_AntProject  
ant run  
4: How to open it in mac?  
4.1: In mac your .sh file should contian lines like below.  
cd /Users/appledev/Documents/workspace/Selenium_AntProject  
ant run  
4.2: Now right click on file (Run_ANT.bat) > select open with > others > select utilities folder > select terminal.app  
4.3: it should run and show results over there.
