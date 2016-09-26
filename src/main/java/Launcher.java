import actors.HappyBdayActor;
import akka.actor.ActorRef;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import injectionmodule.Config;

public class Launcher {

    private ActorRef pageCountActorRef;

    @Inject
    public Launcher(@Named(HappyBdayActor.BEAN_NAME) ActorRef pageCountActorRef) {
        this.pageCountActorRef = pageCountActorRef;
    }

    public ActorRef getPageCountActorRef() {
        return pageCountActorRef;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Config());
        Launcher app = injector.getInstance(Launcher.class);


        app.getPageCountActorRef().tell("RahulKumar",ActorRef.noSender());

    }

}
