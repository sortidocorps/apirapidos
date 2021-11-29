package com.example.apirapidos.apirapidos.controllers;

import com.example.apirapidos.apirapidos.models.Potato;
import com.example.apirapidos.apirapidos.services.PotatosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/potatos")
public class PotatosController {

    @Autowired
    private PotatosService service;

    @Operation(summary = "Get all Potatos")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(hidden = true))) })
    @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    @GetMapping
    public List<Potato> getAll() {

        List<Potato> potatoes = new ArrayList<>();
        service.findAllPotatos().forEach(potatoes::add);

        return potatoes;
    }

    @ApiResponses(value = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(hidden = true))) })
    @PostMapping
    public void postPotatos(@RequestBody Potato potato) {
        service.save(potato);
    }

}
