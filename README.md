## Introduction

This is a demo of writing automated tests on the Nimble website using Java and Selenium.

## TODO

#### Home page
- [x] `testHomePageOpens`
- [x] `testMenuLinksList`
- [ ] `testSubMenuLinks`
- [x] `testContactInfo`
- [x] `testSocialMediaLinks`

#### What we do page
- [x] `testWhatWeDoPageOpens`
- [ ] `testClickingTestingTile`

#### Success stories page
- [ ] `testSuccessStoriesPageOpens` - Add find element test
- [ ] `testClickingSBGTile`

#### About nimble page
- [ ] `testAboutNimblePageOpens` - Add find element test
- [ ] `testEveryoneTileHEadings`
- [ ] `testSeeWhatWeDoLink`

#### Blog page
- [ ] `testBlogPageOpens` - Add find element test
- [ ] `testEdTechCategoryLink`
- [ ] `testMovingToTheSecondPage`

#### Careers page
- [ ] `testCareersPageOpens` - Add find element test
- [ ] `testJumpToAvailableRolesLink`
- [ ] `testCareerButton`
- [ ] `testWhatWeOffer`
- [ ] `testCopDropDown`

#### Contact us page - DONE
- [X] `testContactUsPageOpens`
- [X] `testCompletedContactUsForm`
- [x] `textInCompleteContactUsForm`
- [x] `testIncorrectEmailFormat`

#### Other
- [ ] Fix any tests that don't work in headless mode (List TBC)

#### Comments from TestCOP
- [ ] I'd avoid using xpath as much as you can (e.g. in the ContactUsPage) as they're the most brittle. I suspect you've done it there because there's no good alternative
- [ ] I'd possibly move some of the method-specific elements out like you've done with the rest (e.g. the submit button in ContactUsPage). It's not a huge concern either way, I just like all my elements defined in one place
- [ ] I'd consider making "workflow" functions e.g. fillInContactForm, which you pass all your info. It reduces the lines in your test from all the page.setX() and means there's only one point of refactor if necessary
- [ ] Look into WebDriverManager - https://github.com/bonigarcia/webdrivermanager
- [ ] Look into Lombok for annotation with getters and setter - https://projectlombok.org/
- [ ] Look into passing parameters into the BaseTest for the variables

Chat - https://nimbleapproach.slack.com/archives/C02E1JVFZPS/p1673532741014109