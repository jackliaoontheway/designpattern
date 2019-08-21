package behavioral.mediator.DeepThinking.standard;

public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA colleagueA;

    private ConcreteColleagueB colleagueB;

    @Override
    public void changed(Colleague colleague) {
        //colleagueA do something call colleagueB
        //colleagueB do something call colleagueA
    }
}
