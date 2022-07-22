package petshop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petshop.domain.*;

@Component
public class CustomerHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Customer>> {

    @Override
    public EntityModel<Customer> process(EntityModel<Customer> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/createAccount4")
                .withRel("createAccount4")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/deleteAccount")
                .withRel("deleteAccount")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/createAvatar")
                .withRel("createAvatar")
<<<<<<< HEAD
<<<<<<< HEAD
=======
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test")
                .withRel("test")
>>>>>>> 5f46f40ee4c8079ee3d89f3af450924b93da2a86
=======
>>>>>>> 9c3dc2d99650e94bf93e38560ee7cdcaf6942b32
        );

        return model;
    }
}
