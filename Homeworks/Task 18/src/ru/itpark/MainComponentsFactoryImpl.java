package ru.itpark;

public class MainComponentsFactoryImpl {
  public static void main(String[] args) {
    ComponentsFactory factory = ComponentsFactory.getInstance();
    MessageRenderer messageRenderer = factory.getMessageComponent();
    messageRenderer.render();
  }
}
