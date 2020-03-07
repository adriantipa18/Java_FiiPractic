package fii.practic.yonder.demo.controller;

import fii.practic.yonder.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController{
    @Autowired
    private TestService testService;

    @GetMapping
    @RequestMapping(value= "/test")
    public String getTestMessage(){
        return testService.getTestMessage();
    }

    @PostMapping
    public void save(@RequestBody String name){
        testService.save(name);
    }

    @GetMapping
    public String getNames(){
        return testService.getAll();
    }

    @PutMapping(value="/{id}")
    public void update(@PathVariable Integer id, @RequestBody String newValue){
        testService.update(id, newValue);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Integer id)
    {
        testService.delete(id);
    }

}
