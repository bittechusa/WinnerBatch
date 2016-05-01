Feature: login process


Background:
Given i open bittech url
Scenario:

When i clicked login button
And i enter user id
And i enter password
And i click login
Then i should see login page



@p
Scenario Outline:

When i clicked login button
And i enter <user id>
And i enterp <password>
And i click login
Then i should see login page

Examples:
|user id|password|
|"asad"|"12234"|
|"shahid"|"123455"|
|"sfd"|"dfgfdg"|