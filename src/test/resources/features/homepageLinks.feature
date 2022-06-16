Feature: User checks the homepage links

  Background: User is on the burger king page
    When user is on the burger king page

  @wip
  Scenario: User checks the homepage links
    When user click the more button
    And user check the all links one by one
      | About BK                     |
      | Careers                      |
      | Franchising                  |
      | Nutrition                    |
      | Offer Terms                  |
      | Delivery Terms               |
      | Contact Us                   |
      | FAQ                          |
      | Crown Card                   |
      | Restaurant Survey            |
      | Terms of Service             |
      | Privacy Policy               |
      | Trademarks                   |
      | Accessibility                |
      | Unsolicited Idea Policy      |
      | Attributions                 |
      | Royal Perks                  |
      | Royal Perks Terms of Service |

    Then user should be assure that whole links are worked