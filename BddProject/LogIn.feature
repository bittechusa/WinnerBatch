Feature:login process

Background:
Given i enter facebook

@tag1
Scenario: signup 

When i enter firstname 
And i enter lastname
Then i should see login page

@moga
Scenario Outline: login

When i enter email <email>
And i enter pass <password>
Then i should see signup page

Examples:
    | email |password | 
    | "dgddd" | "213243"  |
    |"fsdsfd" | "23423"   |

