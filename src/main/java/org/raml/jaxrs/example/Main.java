package org.raml.jaxrs.example;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.simple.SimpleContainerFactory;
import org.raml.jaxrs.example.resource.CustomerResourceImpl;

import java.io.Closeable;
import java.net.URI;
import java.util.Scanner;

/**
 * Created by gabrieldimech on 08/07/2016.
 */
public class Main {

   // @SuppressWarnings("resource")
    public static void main(final String[] args) throws Exception
    {
        final ResourceConfig config = new ResourceConfig();
        //config.register(TestResourceImpl.class);
        config.register(CustomerResourceImpl.class);

       // config.register(MultiPartFeature.class);


        final Closeable simpleContainer = SimpleContainerFactory.create(new URI("http://localhost:8181"),
                config);

        System.out.println("Strike ENTER to stop...");
        new Scanner(System.in).nextLine();

        simpleContainer.close();

        System.out.println("Bye!");
        System.exit(0);
    }
}
