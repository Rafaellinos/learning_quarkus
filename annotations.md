# Quarkus Annotations Overview

## 1. RESTEasy (JAX-RS)

Annotations for building RESTful services:

- `@Path`: Assigns the URI path to a resource class or method.
- `@GET`, `@POST`, `@PUT`, `@DELETE`: Represent the HTTP methods.
- `@Produces`, `@Consumes`: Specify content types that a resource can handle.
- `@PathParam`, `@QueryParam`, `@HeaderParam`, `@FormParam`: Used for injecting parameters into methods.

## 2. CDI (Contexts and Dependency Injection)

Annotations for managing beans and dependencies:

- `@Inject`: Injects bean dependencies.
- `@ApplicationScoped`, `@RequestScoped`, `@SessionScoped`, `@Dependent`: Defines bean lifecycle context.
- `@Produces`: Marks a method as a bean producer.
- `@Qualifier`: Differentiates beans of the same type.

## 3. Transactional (JTA and JPA)

Annotations for handling database interactions:

- `@Transactional`: Specifies transaction boundaries.
- `@PersistenceContext`: For injecting the `EntityManager`.
- `@Entity`: Marks a class as a JPA entity.
- `@Id`: Defines the primary key of an entity.

## 4. MicroProfile Config

Annotations for configuration management:

- `@ConfigProperty`: Injects configuration property values.

## 5. Bean Validation

Annotations for validating data:

- `@Valid`: Triggers validation on an object.
- `@NotNull`, `@Size`, `@Min`, `@Max`: Constraint annotations.

## 6. Quarkus Specific

Quarkus's own set of annotations:

- `@QuarkusTest`: Denotes that a test is a Quarkus test.

## 7. Spring Compatibility Layer

Annotations supported for Spring compatibility:

- `@Autowired`: Alternative to `@Inject` in Quarkus.
- `@SpringBootTest`: Used for Quarkus testing context.
- `@RestController`, `@RequestMapping`: Used within Quarkus’s RESTEasy context.

## 8. Schedulers and Asynchronous Processing

Annotations for asynchronous processing:

- `@Scheduled`: Defines a scheduled task.
- `@Asynchronous`: Marks a method as asynchronous.

## 9. Security

Annotations for security-related restrictions:

- `@RolesAllowed`: Restricts method access by roles.
- `@Authenticated`: Restricts method access to authenticated users.

## 10. Events

Annotations for event-driven operations:

- `@Observes`: Marks a method as an event listener.

