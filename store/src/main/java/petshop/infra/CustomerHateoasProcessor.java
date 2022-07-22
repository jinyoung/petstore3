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
<<<<<<< HEAD
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/createAvatar")
                .withRel("createAvatar")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test")
                .withRel("test")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/estsefsf")
                .withRel("estsefsf")
        );
=======
>>>>>>> be917371c1747605ab3eeebe6637962eeeafe390

        return model;
    }
}
