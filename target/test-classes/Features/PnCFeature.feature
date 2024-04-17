Feature: To test the Painting and Cleaning module

#Background: 
#Given User should be Logged in 

#Scenario for validating the search bar in painting and cleaning in the menu
#Scenario-1
@searchBar
Scenario: To validate Search bar in Painting and Cleaning
Given user should be on Home page
When user clicks on menu button
And user selects painting and cleaning
And user enters in search bar
|bathroom|
And user selects from the list
Then It should redirect to the selected page

#Scenario for corporate enquiry form from the menu tab
#Scenario-2
@corporateEnquiry
Scenario Outline: To validate form of corporate Enquiry
Given user should be on Home page
When user clicks on menu button from the sidebar
And clicks on corporate enquiry
And user enters "<name>", "<mobile_number>", "<email>" and "<company_name>"
And user selects city from dropdown
And user clicks on book consultation
Then it should display the success message of form submission

Examples:
|name | mobile_number | email | company_name |
|Popeye| 1111111111| popeye@gmail.com | popeyeTheSailorMan |

#Scenario for validating the contact now form in the Top Blogs page
#Scenario-3
@blog
Scenario: To validate contact now page in Blogsy
Given user should be on Home page
When user selects blog from the menu
And user gets navigated to blog page and scrolls down 
And user clicks on Top Blogs
And user scrolls down the page
And user chooses a link from renting part
And user gets navigated to the page and scrolls down
#And user fills the contact us form
And user fills "<bName>", "<bMobile_no>" , "<bGmail>" and selects city and service from dropdown
And clicks on submit button
Then it should show a success message for the form submission

Examples:
|     bName     | bMobile_no |      bGmail       |
| Shubham Dhole | 6759436759 | shubh.d@gmail.com |

#Scenario for validating the property details form in Rental Agreement
#Scenario-4
@propertyDetails
Scenario Outline: To validate Rental Agreements Property Details
Given User should be logged in and should be on home page
When user scrolls down the menu page
And user clicks on Rental Agreement 
And user gets navigated to Legal Services Page
And user clicks on Rental Agreement with Biometric
And user clicks on Property Details
And user fill out the "<flatNo>" , "<BuildingName>" , "<Locality>" , "<street>" , "<pincode1>" , "<propNo>" ,"<flatBuildUpArea1>" , "<parkingArea1>" and "<galleryArea1>"
And user clicks on Save and Proceed
Then user gets navigated to Landlord Detail page

Examples:
| flatNo | BuildingName | Locality     | street           | pincode1 | propNo | flatBuildUpArea1 | parkingArea1 | galleryArea |
| 206    | Puneet       | Tagore Nagar | The Other Street | 452011  | 1505   |   2200            | 1100         |  500        |


#Scenario for validating the mobile number field in corporate enquiry page
#Scenario-5
@defectInCorpEnquiry
Scenario: To validate the mobile number of Corporate Enquiry
Given user should be on Home page
When user clicks on menu 
And user clicks on Corporate Enquiry from the dropdown
And user enters name
Then user enters "<mobile_number>" including characters


Examples:
|mobile_number|
| 4567ert     |








