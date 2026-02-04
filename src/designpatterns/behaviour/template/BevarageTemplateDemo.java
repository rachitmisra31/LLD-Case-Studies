package designpatterns.behaviour.template;

public class BevarageTemplateDemo {

    public static void main(String[] args) {
        Bevarage tea = new TeaBevarage();
        tea.prepareRecipe();

        System.out.println("Preparing Coffee");

        Bevarage coffee = new CoffeeBevarage();
        coffee.prepareRecipe();
    }
}
