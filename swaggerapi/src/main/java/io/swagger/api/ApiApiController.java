package io.swagger.api;

import io.swagger.model.Server;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-19T15:09:32.514488200+05:30[Asia/Calcutta]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Server>> apiServerAddPost(@Parameter(in = ParameterIn.DEFAULT, description = "A JSON object containing Server information", required=true, schema=@Schema()) @Valid @RequestBody Server body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Server>>(objectMapper.readValue("[ {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n}, {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Server>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Server>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Server>> apiServerDeleteIdDelete(@Parameter(in = ParameterIn.PATH, description = "Delete a server.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Server>>(objectMapper.readValue("[ {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n}, {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Server>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Server>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Server>> apiServerGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Server>>(objectMapper.readValue("[ {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n}, {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Server>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Server>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Server>> apiServerGetByNameNameGet(@Parameter(in = ParameterIn.PATH, description = "Delete a server.", required=true, schema=@Schema()) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Server>>(objectMapper.readValue("[ {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n}, {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Server>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Server>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Server>> apiServerIdGet(@Parameter(in = ParameterIn.PATH, description = "Fetch Result for an Id.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Server>>(objectMapper.readValue("[ {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n}, {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Server>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Server>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Server>> apiServerUpdateIdPut(@Parameter(in = ParameterIn.PATH, description = "Fetch Result for an Id.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Server>>(objectMapper.readValue("[ {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n}, {\r\n  \"framework\" : \"framework\",\r\n  \"language\" : \"language\",\r\n  \"id\" : \"id\",\r\n  \"Name\" : \"Name\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Server>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Server>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
