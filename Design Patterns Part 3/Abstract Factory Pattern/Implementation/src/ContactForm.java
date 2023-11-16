public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();

//        if (theme == Theme.MATERIAL) {
//            MaterialButton materialButton = new MaterialButton();
//            materialButton.render();
//            MaterialTextBox materialTextBox = new MaterialTextBox();
//            materialTextBox.render();
//        } else if (theme == Theme.ANT) {
//            AntButton antButton = new AntButton();
//            antButton.render();
//            AntTextBox antTextBox = new AntTextBox();
//            antTextBox.render();
//        } else {
//            throw new RuntimeException("Unsupported theme");
//        }
    }
}
