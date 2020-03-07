package fii.practic.yonder.demo.service;

public interface TestService {
    String getTestMessage();

    void save(String name);

    String getAll();

    void update(Integer id, String newValue);

    void delete(Integer id);
}
