package io.jaegertracing.examples.wildfly;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class TracedStoreApplication extends Application {
}