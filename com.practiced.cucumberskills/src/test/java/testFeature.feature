Feature: Google Verify
Scenario: Launch the google
Given open Google
When search for "kitty"
Then results page with "google" is displayed