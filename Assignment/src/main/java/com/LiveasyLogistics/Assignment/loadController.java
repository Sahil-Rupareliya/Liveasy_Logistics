package com.LiveasyLogistics.Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("load")
public class loadController {
    @Autowired
    loadService loadService;

    @PostMapping()
    public String addLoadDetails(@RequestBody load loadDetails){
        return this.loadService.addLoadDetails(loadDetails);
    }

    @GetMapping()
    public List<load> getLoadDetails(@RequestParam Long shipperId){
        return this.loadService.getLoadDetails(shipperId);
    }

    @GetMapping("/{id}")
    public load getLoadById(@PathVariable Long id) {
        return loadService.getLoadById(id)
                .orElseThrow(() -> new LoadNotFoundException("Load with ID " + id + " not found."));
    }


    @PutMapping("{id}")
    public String updateLoad(@PathVariable Long id,@RequestBody load updatedLoad){
        return this.loadService.updateLoad(id,updatedLoad);
    }

    @DeleteMapping("/{loadId}")
    public String deleteLoad(@PathVariable Long loadId) {
        return loadService.deleteLoad(loadId);
    }
}
