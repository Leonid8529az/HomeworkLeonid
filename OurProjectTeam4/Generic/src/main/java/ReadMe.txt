Info about all the methods in OurAPI:

1.createWebElement() - is a return type method. Does a very simple job, just creates an element, using xpath.
2.createWebElementByID() - if you happen to locate an id, use this method, its a lot easier.
3.listOfWebElements() - is a return type method, which gives you back a list. Use it in case of tables or dropdown menu.
4.listOfWebElementsByID() - same, but with an id.
5.click() - is a simple click method, accepts both String and WebElement parameters. Usage of webelements is preferable.
6.clickByID() - still exists, in case to make things simple.
7.enterText() - accepts both String and WebElements and returns the text of the chosen web element.
8.enterTextByID() - does the same, but requires id
9.getTitle() - return type method, which gives you the title of the page, very useful for verification of you current
location on website.
10.selectDropDownOption() - an easy selector, accepts String and WebElement. Only works, if there is <select> tag
in HTML code.
11.selectDropDownOptionByID() - does the same, but accepts id.
12.switchToDifferentWindow() - doesn't accept or return anything. Just switches you to the latest open window.
13.switchToDifferentTab() - doesn't return or accept parameters, switches you to the latest open tab.
14.alertClick() - accepts boolean parameters, switches automatically to the alert pop up and press "accept", if you
pass it "true", or presses "cancel", if you pass it "false".
15.alertTextDetector() - in case if you need to get text from alert, you can use this. It returns String
16.scroller() - manual page scroller, which accepts String parameters, but be sure to pass it numbers. For example,
"500". It reads the number and scrolls that many pixels. If you put positive numbers, it scrolls down, if you put
negative, it scrolls down.
17.hoverOver() - hovers over the web element. Can accepts both String and WebElements
18.switchToIFrame() - accepts integer. Just tell the methods which iframe you want to switch to. Indexes starts from
1(ONE).
19.howManyIframesWeHave() - tells you the index of iframes on your page and their title. Just in case if you need
to know the index of proper iframe
20.pressEnter() - Accepts String and WebElement, just hits enter on webelement. Usable for search fields
21.checkIfIsChecked() - accepts Sting and webelement, asserts, if the element is checked (flagged)
22.checkIfIsUnchecked() - does the same, but assets if the element is not checked
23.checkIfIsVisible() - accepts String and Webelement, asserts, if the element is displayed.
24.checkIfIsNotVisible() - the same, but checks, if it is not displayed.
25.checkIfIsEnabled() - asserts, if it is enabled.
26.checkIfIsDisabled() - asserts, if it is disabled.
27.waitSeconds() - accepts integer, put the thread to sleep for this many seconds.
28.scrollToView() - accepts webelement or String, scrolls to the element
