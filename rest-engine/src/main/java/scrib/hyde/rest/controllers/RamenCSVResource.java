package scrib.hyde.rest.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import scrib.hyde.data.interfaces.RamenCSVInterface;
import scrib.hyde.models.pojo.RamenModelLayer;
import scrib.hyde.models.pojo.RamenSearch;
import scrib.hyde.models.pojo.RamensEnvelope;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ramencsv")
@Slf4j
public class RamenCSVResource {

    @Resource
    RamenCSVInterface ramenCSVInterface;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public RamensEnvelope getRamens() {
        try {
            return RamensEnvelope.builder().data(ramenCSVInterface.getAllRamens())._errorMessage(null).status("OK").build();
        } catch (Exception e) {
            return RamensEnvelope.builder().data(null)._errorMessage(e.getMessage()).status("FAIL").build();
        }
    }


    /*
    TEST OF VERSION
    K - V --> Content-Type - application/json;version=2
    @RequestMapping(value = "/all", method = RequestMethod.GET, consumes = "application/json;version=2")

    Methid # 2 :

     */
    @RequestMapping(value = "/all", method = RequestMethod.GET, headers = "api-version=2")
    public RamensEnvelope getRamensByVersion() {
        try {
            return RamensEnvelope.builder().data(ramenCSVInterface.getAllRamens())._errorMessage(null).status("OK_VERSIONED").build();
        } catch (Exception e) {
            return RamensEnvelope.builder().data(null)._errorMessage(e.getMessage()).status("FAIL").build();
        }
    }


    @RequestMapping(value = "/all/brands", method = RequestMethod.GET)
    public List<String> getRamenBrands() {
        return null;
    }

    @RequestMapping(value = "/search/brands/{brand}", method = RequestMethod.GET)
    public List<String> searchRamenBrands(@PathVariable("brand") String brandName) {
        log.info("Searching brand : {}", brandName);
        return Arrays.asList(brandName);
    }

    //TO COMPLETE
    public RamensEnvelope paginatedResponse() {
        /*
        GET METHOD WITH A PAGINATED RESPONSE
         */
        return null;
    }

    /*
    GET WITH REQUEST BODY
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchRamens(@RequestBody RamenSearch searchForm) {
        return searchForm.getBrand();
    }


}
