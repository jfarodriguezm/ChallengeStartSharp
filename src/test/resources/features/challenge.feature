# Autor: Jhonatan Fabian Rodriguez Mahecha

@stories
Feature: Serenity Platform
  As a user, I want to create a business unit and create a new meeting at the serenity platform

  Background:
    Given than John is already login in the platform
      | strUser | strPassword |
      | admin   | serenity    |

  @scenario1
  Scenario Outline: Create Business Unit

    When he create a business unit
      | strNomBusinessUnit   | strNomParentUnit   |
      | <strNomBusinessUnit> | <strNomParentUnit> |
    Then the Business Unit <strBusinessUnit> is already listed

    Examples:
      | strNomBusinessUnit | strNomParentUnit | strBusinessUnit |
      | chTest             | Test             | chTest          |

  @Scenario2
  Scenario Outline: Create Meeting
    When he create a new meeting
      | strMeetingName   | strMeetingType   | strMeetingNumber   | strStartDate   | strEndDate   | strStartHour   | strEndHour   | strLocation   | strUnit   | strOrganizedBy   | strReporter   | strAttendeeList   |
      | <strMeetingName> | <strMeetingType> | <strMeetingNumber> | <strStartDate> | <strEndDate> | <strStartHour> | <strEndHour> | <strLocation> | <strUnit> | <strOrganizedBy> | <strReporter> | <strAttendeeList> |
    Then the new <meeting> is already listed

    Examples:
      | meeting         | strMeetingName  | strMeetingType | strMeetingNumber | strStartDate | strEndDate | strStartHour  | strEndHour  | strLocation | strUnit        | strOrganizedBy | strReporter  | strAttendeeList |
      | JhonatanMeeting | JhonatanMeeting | General        | 123456789        | 06/17/2022   | 06/17/2022 | 09:30         | 09:50       | HQ-01       | chTest         | Adam Stewart   | Alexis Lopez | Allison Bell    |