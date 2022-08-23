package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class WikiOnBoardingPage {
  SelenideElement
          primaryTextView = $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")),
          continueButton = $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

  public final String
          textOnFirstScreen = "The Free Encyclopedia …in over 300 languages",
          textOnSecondScreen = "New ways to explore",
          textOnThirdScreen = "Reading lists with sync",
          textOnFourthScreen = "Send anonymous data";


  public void shouldHavePrimaryText(String value) {
    primaryTextView.shouldHave(text(value));
  }

  public void clickContinueButton() {
    continueButton.click();
  }
}