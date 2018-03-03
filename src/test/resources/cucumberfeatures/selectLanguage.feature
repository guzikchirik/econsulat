Feature: selectLanguage
  Background:
    Given an open browser with https://by.e-konsulat.gov.pl

  Scenario Outline: user try select Language
    When user select <language> in filter
    Then language marker value changing to <Language version>

    Examples:
      |language       |Language version      |
      |"Polska"       |"Wersja językowa"     |
      |"English"      |"Language version"    |
      |"Russian"      |"Языковая версия"     |