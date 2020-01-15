package date.issue.controllers;


import date.issue.domains.Pet;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "pet")
@Validated
@Controller("pet")
public class PetController {
    @Get(produces = MediaType.APPLICATION_JSON)
    @Operation(summary = "Pet Search", description = "Lists all pets.", operationId = "searchPet")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful search", content = { @Content( array = @ArraySchema(schema = @Schema(implementation = Pet.class))) })
    })
    public HttpResponse index() {
        return HttpResponse.notFound();
    }
}