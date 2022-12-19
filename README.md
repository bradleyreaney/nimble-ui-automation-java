## Introduction

This is a demo of writing automated tests on the Nimble website using Java and Selenium.

To run the tests you can user the command `mvn test`

## TODO

#### Home page
- [x] `testMenuLinksList`
- [x] `testContactInfo`
- [x] `testSocialMediaLinks`

#### What we do page
- [x] `testWhatWeDoPageOpens`
- [ ] Add more tests

#### Success stories page
- [ ] TODO

#### About nimble page
- [ ] TODO

#### Blog page
- [ ] TODO

#### Careers page
- [ ] TODO

#### Contact us page
- [ ] `testContactUsPageOpens` - TODO
- [ ] `testCompletedContactUsForm` - Find a way of returning text from the fields for the assertion
- [ ] `textInCompleteContactUsForm` - Fix being able to click the 'Submit' button
- [ ] `testIncorrectEmailFormat` - Blocked by `textInCompleteContactUsForm` submit button issue