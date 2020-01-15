package date.issue;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@OpenAPIDefinition(
    info = @Info(
            title = "date-issue",
            version = "0.0",
            description = "example pet api"
    ),
    tags = {@Tag(name = "pet", description = "*notify turn in approval for shipping containers*")}
)
@Singleton
@RequiredArgsConstructor
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}