package com.LiveasyLogistics.Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class loadService {
    @Autowired
    loadRepo loadRepo;
    public String addLoadDetails(load loadDetails) {
        loadRepo.save(loadDetails);
        return "Load Details added Succesfully";
    }

    public List<load> getLoadDetails(Long shipperId) {
         return loadRepo.findByShipperId(shipperId);

    }

    public Optional<load> getLoadById(Long loadId) {
        return loadRepo.findById(loadId);
    }

    public String updateLoad(Long id, load updatedLoad) {
        if (loadRepo.existsById(id)) {
            updatedLoad.setId(id);
            loadRepo.save(updatedLoad);
            return "Load Updated Successfully";
        } else {
            throw new LoadNotFoundException("Load with ID " + id + " not found.");
        }
    }

    public String deleteLoad(Long loadId) {
        loadRepo.deleteById(loadId);
        return "Load with " + loadId + "is deleted";
    }
}
