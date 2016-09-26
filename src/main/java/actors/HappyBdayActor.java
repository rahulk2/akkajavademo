package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import scala.PartialFunction;
import scala.runtime.BoxedUnit;
import service.MessageHandlerService;

public class HappyBdayActor extends AbstractActor {

        final LoggingAdapter logger = Logging.getLogger(context().system(), this);
        public static final String BEAN_NAME = "pageCounterActorRef";
        private final MessageHandlerService messageHandlerService;

        HappyBdayActor(MessageHandlerService messageHandlerServie) {
            this.messageHandlerService = messageHandlerServie;
        }

        public static Props props(MessageHandlerService messageHandlerService) {
            return Props.create(HappyBdayActor.class, messageHandlerService);
        }

    @Override
    public PartialFunction<Object, BoxedUnit> receive() {
        return ReceiveBuilder
                .match(String.class, message -> {
                    logger.info("Message received from someone : {}" + message);
                    logger.info("\n ****************" + messageHandlerService.substr(message, 5) + "****************");
                })
                .matchAny(message -> logger.error("Some unknown things happened : {}", message))
                .build();
    }
}
