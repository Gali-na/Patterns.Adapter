import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HumanPainter humanPainter = new HumanPainter();
        List<Painter> listPainter = new ArrayList<>();
        listPainter.add(humanPainter);
        //Мы не можем включить TalentedPainter в список художников, потому
        // что список художников потому что список художнико работает только с интерфейсом Painter
        // мы создали адаптер AdaprterPainter для адаптированя TalentedPainter к типу Painter
        AdaprterPainter adaprterPainter = new AdaprterPainter();
        listPainter.add(adaprterPainter);
        for (Painter painter : listPainter){
            painter.draw();
        }
        System.out.println("Hello world!");
    }
}